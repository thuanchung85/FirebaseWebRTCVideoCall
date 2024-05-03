package com.codewithkael.firebasevideocall.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0016J\u0012\u0010\u001c\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\b\u0010\u001f\u001a\u00020\u0019H\u0014J\b\u0010 \u001a\u00020\u0019H\u0014J\b\u0010!\u001a\u00020\u0019H\u0002J\b\u0010\"\u001a\u00020\u0019H\u0002J\b\u0010#\u001a\u00020\u0019H\u0002J\b\u0010$\u001a\u00020\u0019H\u0002J\b\u0010%\u001a\u00020\u0019H\u0002J\b\u0010&\u001a\u00020\u0019H\u0002J\b\u0010\'\u001a\u00020\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/codewithkael/firebasevideocall/ui/CallActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/codewithkael/firebasevideocall/service/MainService$EndCallListener;", "()V", "isCaller", "", "isCameraMuted", "isMicrophoneMuted", "isScreenCasting", "isSpeakerMode", "isVideoCall", "requestScreenCaptureLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "serviceRepository", "Lcom/codewithkael/firebasevideocall/service/MainServiceRepository;", "getServiceRepository", "()Lcom/codewithkael/firebasevideocall/service/MainServiceRepository;", "setServiceRepository", "(Lcom/codewithkael/firebasevideocall/service/MainServiceRepository;)V", "target", "", "views", "Lcom/codewithkael/firebasevideocall/databinding/ActivityCallBinding;", "init", "", "onBackPressed", "onCallEnded", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onStart", "setupCameraToggleClicked", "setupMicToggleClicked", "setupScreenCasting", "setupToggleAudioDevice", "startScreenCapture", "updateUiToScreenCaptureIsOff", "updateUiToScreenCaptureIsOn", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class CallActivity extends androidx.appcompat.app.AppCompatActivity implements com.codewithkael.firebasevideocall.service.MainService.EndCallListener {
    private java.lang.String target;
    private boolean isVideoCall = true;
    private boolean isCaller = true;
    private boolean isMicrophoneMuted = false;
    private boolean isCameraMuted = false;
    private boolean isSpeakerMode = true;
    private boolean isScreenCasting = false;
    @javax.inject.Inject
    public com.codewithkael.firebasevideocall.service.MainServiceRepository serviceRepository;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> requestScreenCaptureLauncher;
    private com.codewithkael.firebasevideocall.databinding.ActivityCallBinding views;
    
    public CallActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.codewithkael.firebasevideocall.service.MainServiceRepository getServiceRepository() {
        return null;
    }
    
    public final void setServiceRepository(@org.jetbrains.annotations.NotNull
    com.codewithkael.firebasevideocall.service.MainServiceRepository p0) {
    }
    
    @java.lang.Override
    protected void onStart() {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void init() {
    }
    
    private final void setupScreenCasting() {
    }
    
    private final void startScreenCapture() {
    }
    
    private final void updateUiToScreenCaptureIsOn() {
    }
    
    private final void updateUiToScreenCaptureIsOff() {
    }
    
    private final void setupMicToggleClicked() {
    }
    
    @java.lang.Override
    public void onBackPressed() {
    }
    
    private final void setupToggleAudioDevice() {
    }
    
    private final void setupCameraToggleClicked() {
    }
    
    @java.lang.Override
    public void onCallEnded() {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
}