package org.thoughtcrime.securesms;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import org.signal.core.util.concurrent.LifecycleDisposable;
import org.signal.donations.StripeApi;
import org.thoughtcrime.securesms.components.DebugLogsPromptDialogFragment;
import org.thoughtcrime.securesms.components.PromptBatterySaverDialogFragment;
import org.thoughtcrime.securesms.components.settings.app.AppSettingsActivity;
import org.thoughtcrime.securesms.components.voice.VoiceNoteMediaController;
import org.thoughtcrime.securesms.components.voice.VoiceNoteMediaControllerOwner;
import org.thoughtcrime.securesms.conversationlist.RelinkDevicesReminderBottomSheetFragment;
import org.thoughtcrime.securesms.devicetransfer.olddevice.OldDeviceExitActivity;
import org.thoughtcrime.securesms.keyvalue.SignalStore;
import org.thoughtcrime.securesms.net.DeviceTransferBlockingInterceptor;
import org.thoughtcrime.securesms.notifications.VitalsViewModel;
import org.thoughtcrime.securesms.stories.tabs.BottomMenuRepository;
import org.thoughtcrime.securesms.stories.tabs.BottomMenuViewModel;
import org.thoughtcrime.securesms.util.AppStartup;
import org.thoughtcrime.securesms.util.CachedInflater;
import org.thoughtcrime.securesms.util.CommunicationActions;
import org.thoughtcrime.securesms.util.DynamicNoActionBarTheme;
import org.thoughtcrime.securesms.util.DynamicTheme;
import org.thoughtcrime.securesms.util.SplashScreenUtil;
import org.thoughtcrime.securesms.util.WindowUtil;

/*
In Android, starting from version androidx.appcompat:appcompat:1.2.0,
AppCompatActivity automatically implements the LifecycleOwner interface,
making every MainActivity (or any activity that extends AppCompatActivity) a LifecycleOwner by default.
*/

public class MainActivity extends PassphraseRequiredActivity implements VoiceNoteMediaControllerOwner {

  //==================Properties===================//
  public static final int RESULT_CONFIG_CHANGED = Activity.RESULT_FIRST_USER + 901;

  private final DynamicTheme  dynamicTheme = new DynamicNoActionBarTheme();

  //khởi tạo 1 object MainNavigator, và gắn chính main activity vào để navigator lắn nghe state của main activity
  private final MainNavigator navigator    = new MainNavigator(this);


  private BottomMenuViewModel bottomMenuViewModel;
  private VitalsViewModel     vitalsViewModel;


  //đây là biến lưu trữ mediaController của MainActivity
  private VoiceNoteMediaController      mediaController;

  //đây chính là 1 Lifecycle Observer chuyên dùng để nhận event onCreate,onStart...onDestroy của object Lifecycle Owner
  private final LifecycleDisposable lifecycleDisposable = new LifecycleDisposable();

  //đây là biến khống chế việc render view ra màn hình
  private boolean onFirstRender = false;
  //==================Properties===================//

  //=========APP METHODS===========//
  @Override
  protected void onCreate(Bundle savedInstanceState, boolean ready)
  {
    Log.d("CHUNG", "MAIN ACTIVITY onCreate");
    AppStartup.getInstance().onCriticalRenderEventStart();
    super.onCreate(savedInstanceState, ready);

    // lấy file layout ra "main_activity" để áp dụng cho this MainActivity
    //main activity chưa 2 thứ 1 cái host và 1 cái bottom menu
    //host là 1 activity có chưa navigation ("MainActivityListHostFragment")
    //bottom menu là 1 fragment thường
    setContentView(R.layout.main_activity);

    //cái android.R.id.content là của system hệ thống, nó không phải của res layout, thường dùng để lấy view  root view của activity
    final View content = findViewById(android.R.id.content);

    //ViewTreeObserver is an object that monitors changes to the layout of a view hierarchy
    content.getViewTreeObserver().addOnPreDrawListener(
        //lắn nghe event khi content chuẫn bị đươc vẽ ra trên màn hình
        new ViewTreeObserver.OnPreDrawListener() {
          @Override
          public boolean onPreDraw() {
            // Use pre draw listener to delay drawing frames till conversation list is ready
            //có cái cờ onFirstRender để chắc chắn là adapter của conversation list đã có data xong thì  hiện main activity view
            if (onFirstRender == true) {
              content.getViewTreeObserver().removeOnPreDrawListener(this);
              //return true nghĩa là được ok thông qua để render tiếp
              return true;
            } else {
              //return false nghĩa là cancel quá trình vẽ ra màn hình
              return false;
            }
          }
        }

    );

    //chính vì MainActivity có implement interface "VoiceNoteMediaControllerOwner" nên nó có quyền gọi lifecycleDisposable.bindTo
    //lifecycleDisposable là class tạo ra để quản lý vòng đời của các Activity
    //main activity mặc định là 1 LifecycleOwner, cho nên no có thể truyền vào lifecycleDisposable.bindto
    //lý do ta cần cái này là vì ai cần 1 cơ chế để các class khác thấy được vòng đời sống của main activity này
    lifecycleDisposable.bindTo(this, "MainActivity -> onCreate");

    //khởi tạo mediaController cho main activity
    mediaController = new VoiceNoteMediaController(this, true);

    //???????
    handleDeeplinkIntent(getIntent());

    //??????
    CachedInflater.from(this).clear();


    //khởi tạo 1 cái kho "repository" chuyên dùng để lo vấn đề  ConversationList
    BottomMenuRepository repository = new BottomMenuRepository();
    //bọc cái repository vào 1 object gọi là factory, factory này là 1 ViewModel có dạng ConversationListTabViewModel
    BottomMenuViewModel.Factory factory = new BottomMenuViewModel.Factory(repository);
    //factory được tạo ra để pass vào ViewModelProvider để tạo ra 1 Custom Initialization ViewModel mới
    bottomMenuViewModel = new ViewModelProvider(this, factory).get(BottomMenuViewModel.class);
    updateTabVisibility();


    //vistals có nghĩa là sức sống, cái vitalsViewModel dùng để theo dỏi tình trang app state  NONE,PROMPT_BATTERY_SAVER_DIALOG,PROMPT_DEBUGLOGS_FOR_NOTIFICATIONS,PROMPT_DEBUGLOGS_FOR_CRASH
    vitalsViewModel = new ViewModelProvider(this).get(VitalsViewModel.class);


    lifecycleDisposable.add(
        vitalsViewModel
            .getVitalsState()
            .subscribe(this::presentVitalsState)
    );


  }

  @Override
  protected void onResume() {
    Log.d("CHUNG", "MAIN ACTIVITY onResume");
    super.onResume();
    dynamicTheme.onResume(this);
    if (SignalStore.misc().isOldDeviceTransferLocked()) {
      new MaterialAlertDialogBuilder(this)
          .setTitle(R.string.OldDeviceTransferLockedDialog__complete_registration_on_your_new_device)
          .setMessage(R.string.OldDeviceTransferLockedDialog__your_signal_account_has_been_transferred_to_your_new_device)
          .setPositiveButton(R.string.OldDeviceTransferLockedDialog__done, (d, w) -> OldDeviceExitActivity.exit(this))
          .setNegativeButton(R.string.OldDeviceTransferLockedDialog__cancel_and_activate_this_device, (d, w) -> {
            SignalStore.misc().setOldDeviceTransferLocked(false);
            DeviceTransferBlockingInterceptor.getInstance().unblockNetwork();
          })
          .setCancelable(false)
          .show();
    }

    if (SignalStore.misc().getShouldShowLinkedDevicesReminder()) {
      SignalStore.misc().setShouldShowLinkedDevicesReminder(false);
      RelinkDevicesReminderBottomSheetFragment.show(getSupportFragmentManager());
    }

    updateTabVisibility();

    vitalsViewModel.checkSlowNotificationHeuristics();
  }

  @Override
  protected void onStop() {
    super.onStop();
    SplashScreenUtil.setSplashScreenThemeIfNecessary(this, SignalStore.settings().getTheme());
  }



  //=========APP METHODS===========//

  public static @NonNull Intent clearTop(@NonNull Context context) {
    Intent intent = new Intent(context, MainActivity.class);

    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP |
                    Intent.FLAG_ACTIVITY_NEW_TASK |
                    Intent.FLAG_ACTIVITY_SINGLE_TOP);

    return intent;
  }


  @SuppressLint("NewApi")
  private void presentVitalsState(VitalsViewModel.State state) {
    switch (state) {
      case NONE:
        break;
      case PROMPT_BATTERY_SAVER_DIALOG:
        PromptBatterySaverDialogFragment.show(getSupportFragmentManager());
        break;
      case PROMPT_DEBUGLOGS_FOR_NOTIFICATIONS:
        DebugLogsPromptDialogFragment.show(this, DebugLogsPromptDialogFragment.Purpose.NOTIFICATIONS);
      case PROMPT_DEBUGLOGS_FOR_CRASH:
        DebugLogsPromptDialogFragment.show(this, DebugLogsPromptDialogFragment.Purpose.CRASH);
        break;
    }
  }

  @Override
  public Intent getIntent() {
    return super.getIntent().setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP |
                                      Intent.FLAG_ACTIVITY_NEW_TASK |
                                      Intent.FLAG_ACTIVITY_SINGLE_TOP);
  }

  @Override
  protected void onNewIntent(Intent intent) {
    super.onNewIntent(intent);
    handleDeeplinkIntent(intent);
  }

  @Override
  protected void onPreCreate() {
    super.onPreCreate();
    dynamicTheme.onCreate(this);
  }


  @Override
  public void onBackPressed() {
    if (!navigator.onBackPressed()) {
      super.onBackPressed();
    }
  }

  @Override
  protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == MainNavigator.REQUEST_CONFIG_CHANGES && resultCode == RESULT_CONFIG_CHANGED) {
      recreate();
    }
  }

  private void updateTabVisibility() {
    findViewById(R.id.conversation_list_tabs).setVisibility(View.VISIBLE);
    WindowUtil.setNavigationBarColor(this, ContextCompat.getColor(this, R.color.signal_colorSurface2));
  }

  public @NonNull MainNavigator getNavigator() {
    return navigator;
  }

  private void handleDeeplinkIntent(Intent intent) {
    handleGroupLinkInIntent(intent);
    handleProxyInIntent(intent);
    handleSignalMeIntent(intent);
    handleCallLinkInIntent(intent);
    handleDonateReturnIntent(intent);
  }

  private void handleGroupLinkInIntent(Intent intent) {
    Uri data = intent.getData();
    if (data != null) {
      CommunicationActions.handlePotentialGroupLinkUrl(this, data.toString());
    }
  }

  private void handleProxyInIntent(Intent intent) {
    Uri data = intent.getData();
    if (data != null) {
      CommunicationActions.handlePotentialProxyLinkUrl(this, data.toString());
    }
  }

  private void handleSignalMeIntent(Intent intent) {
    Uri data = intent.getData();
    if (data != null) {
      CommunicationActions.handlePotentialSignalMeUrl(this, data.toString());
    }
  }

  private void handleCallLinkInIntent(Intent intent) {
    Uri data = intent.getData();
    if (data != null) {
      CommunicationActions.handlePotentialCallLinkUrl(this, data.toString());
    }
  }

  private void handleDonateReturnIntent(Intent intent) {
    Uri data = intent.getData();
    if (data != null && data.toString().startsWith(StripeApi.RETURN_URL_IDEAL)) {
      startActivity(AppSettingsActivity.manageSubscriptions(this));
    }
  }




  //hàm này để cho các activity khác gọi để khống chế việc ,có hay không cho phép main activity render tiếp
  public void onFirstRender() {
    onFirstRender = true;
  }


  //đây là method bắc buộc phải implement bởi vì MainActivity đã implement interface VoiceNoteMediaControllerOwner
  //method này là get method tư động đươc tạo ra, do interface VoiceNoteMediaControllerOwner có khai báo biến val voiceNoteMediaController
  @Override
  public @NonNull VoiceNoteMediaController getVoiceNoteMediaController() {
    //trả ra chính object mediaController của MainActivity
    return mediaController;
  }


}
