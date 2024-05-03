package com.codewithkael.firebasevideocall.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0003./0B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0002J\b\u0010\u001d\u001a\u00020\u0015H\u0002J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010 \u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010!\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0014\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010%\u001a\u00020\u0015H\u0016J\u0010\u0010&\u001a\u00020\u00152\u0006\u0010\'\u001a\u00020(H\u0016J\"\u0010)\u001a\u00020*2\b\u0010$\u001a\u0004\u0018\u00010\u001a2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*H\u0016J\b\u0010-\u001a\u00020\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/codewithkael/firebasevideocall/service/MainService;", "Landroid/app/Service;", "Lcom/codewithkael/firebasevideocall/repository/MainRepository$Listener;", "()V", "TAG", "", "isPreviousCallStateVideo", "", "isServiceRunning", "mainRepository", "Lcom/codewithkael/firebasevideocall/repository/MainRepository;", "getMainRepository", "()Lcom/codewithkael/firebasevideocall/repository/MainRepository;", "setMainRepository", "(Lcom/codewithkael/firebasevideocall/repository/MainRepository;)V", "notificationManager", "Landroid/app/NotificationManager;", "rtcAudioManager", "Lcom/codewithkael/firebasevideocall/webrtc/RTCAudioManager;", "username", "endCall", "", "endCallAndRestartRepository", "handleEndCall", "handleSetupViews", "incomingIntent", "Landroid/content/Intent;", "handleStartService", "handleStopService", "handleSwitchCamera", "handleToggleAudio", "handleToggleAudioDevice", "handleToggleScreenShare", "handleToggleVideo", "onBind", "Landroid/os/IBinder;", "intent", "onCreate", "onLatestEventReceived", "data", "Lcom/codewithkael/firebasevideocall/utils/DataModel;", "onStartCommand", "", "flags", "startId", "startServiceWithNotification", "Companion", "EndCallListener", "Listener", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class MainService extends android.app.Service implements com.codewithkael.firebasevideocall.repository.MainRepository.Listener {
    private final java.lang.String TAG = "MainService";
    private boolean isServiceRunning = false;
    private java.lang.String username;
    @javax.inject.Inject
    public com.codewithkael.firebasevideocall.repository.MainRepository mainRepository;
    private android.app.NotificationManager notificationManager;
    private com.codewithkael.firebasevideocall.webrtc.RTCAudioManager rtcAudioManager;
    private boolean isPreviousCallStateVideo = true;
    @org.jetbrains.annotations.NotNull
    public static final com.codewithkael.firebasevideocall.service.MainService.Companion Companion = null;
    @org.jetbrains.annotations.Nullable
    private static com.codewithkael.firebasevideocall.service.MainService.Listener listener;
    @org.jetbrains.annotations.Nullable
    private static com.codewithkael.firebasevideocall.service.MainService.EndCallListener endCallListener;
    @org.jetbrains.annotations.Nullable
    private static org.webrtc.SurfaceViewRenderer localSurfaceView;
    @org.jetbrains.annotations.Nullable
    private static org.webrtc.SurfaceViewRenderer remoteSurfaceView;
    @org.jetbrains.annotations.Nullable
    private static android.content.Intent screenPermissionIntent;
    
    public MainService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.codewithkael.firebasevideocall.repository.MainRepository getMainRepository() {
        return null;
    }
    
    public final void setMainRepository(@org.jetbrains.annotations.NotNull
    com.codewithkael.firebasevideocall.repository.MainRepository p0) {
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @java.lang.Override
    public int onStartCommand(@org.jetbrains.annotations.Nullable
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    private final void handleStopService() {
    }
    
    private final void handleToggleScreenShare(android.content.Intent incomingIntent) {
    }
    
    private final void handleToggleAudioDevice(android.content.Intent incomingIntent) {
    }
    
    private final void handleToggleVideo(android.content.Intent incomingIntent) {
    }
    
    private final void handleToggleAudio(android.content.Intent incomingIntent) {
    }
    
    private final void handleSwitchCamera() {
    }
    
    private final void handleEndCall() {
    }
    
    private final void endCallAndRestartRepository() {
    }
    
    private final void handleSetupViews(android.content.Intent incomingIntent) {
    }
    
    private final void handleStartService(android.content.Intent incomingIntent) {
    }
    
    private final void startServiceWithNotification() {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override
    public void onLatestEventReceived(@org.jetbrains.annotations.NotNull
    com.codewithkael.firebasevideocall.utils.DataModel data) {
    }
    
    @java.lang.Override
    public void endCall() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/codewithkael/firebasevideocall/service/MainService$Listener;", "", "onCallReceived", "", "model", "Lcom/codewithkael/firebasevideocall/utils/DataModel;", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void onCallReceived(@org.jetbrains.annotations.NotNull
        com.codewithkael.firebasevideocall.utils.DataModel model);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/codewithkael/firebasevideocall/service/MainService$EndCallListener;", "", "onCallEnded", "", "app_debug"})
    public static abstract interface EndCallListener {
        
        public abstract void onCallEnded();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006\u001e"}, d2 = {"Lcom/codewithkael/firebasevideocall/service/MainService$Companion;", "", "()V", "endCallListener", "Lcom/codewithkael/firebasevideocall/service/MainService$EndCallListener;", "getEndCallListener", "()Lcom/codewithkael/firebasevideocall/service/MainService$EndCallListener;", "setEndCallListener", "(Lcom/codewithkael/firebasevideocall/service/MainService$EndCallListener;)V", "listener", "Lcom/codewithkael/firebasevideocall/service/MainService$Listener;", "getListener", "()Lcom/codewithkael/firebasevideocall/service/MainService$Listener;", "setListener", "(Lcom/codewithkael/firebasevideocall/service/MainService$Listener;)V", "localSurfaceView", "Lorg/webrtc/SurfaceViewRenderer;", "getLocalSurfaceView", "()Lorg/webrtc/SurfaceViewRenderer;", "setLocalSurfaceView", "(Lorg/webrtc/SurfaceViewRenderer;)V", "remoteSurfaceView", "getRemoteSurfaceView", "setRemoteSurfaceView", "screenPermissionIntent", "Landroid/content/Intent;", "getScreenPermissionIntent", "()Landroid/content/Intent;", "setScreenPermissionIntent", "(Landroid/content/Intent;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.codewithkael.firebasevideocall.service.MainService.Listener getListener() {
            return null;
        }
        
        public final void setListener(@org.jetbrains.annotations.Nullable
        com.codewithkael.firebasevideocall.service.MainService.Listener p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.codewithkael.firebasevideocall.service.MainService.EndCallListener getEndCallListener() {
            return null;
        }
        
        public final void setEndCallListener(@org.jetbrains.annotations.Nullable
        com.codewithkael.firebasevideocall.service.MainService.EndCallListener p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final org.webrtc.SurfaceViewRenderer getLocalSurfaceView() {
            return null;
        }
        
        public final void setLocalSurfaceView(@org.jetbrains.annotations.Nullable
        org.webrtc.SurfaceViewRenderer p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final org.webrtc.SurfaceViewRenderer getRemoteSurfaceView() {
            return null;
        }
        
        public final void setRemoteSurfaceView(@org.jetbrains.annotations.Nullable
        org.webrtc.SurfaceViewRenderer p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final android.content.Intent getScreenPermissionIntent() {
            return null;
        }
        
        public final void setScreenPermissionIntent(@org.jetbrains.annotations.Nullable
        android.content.Intent p0) {
        }
    }
}