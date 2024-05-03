package com.codewithkael.firebasevideocall.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001<B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0006\u0010\u0017\u001a\u00020\u0014J\u0006\u0010\u0018\u001a\u00020\u0014J\u0016\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0010J\u000e\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0012J\u0014\u0010 \u001a\u00020\u00142\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00140\"J2\u0010#\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00122\u001a\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00140&J,\u0010\'\u001a\u00020\u00142$\u0010\u0015\u001a \u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120*0)\u0012\u0004\u0012\u00020\u00140(J\u0010\u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020-H\u0016J*\u0010.\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00140(J\u0006\u00100\u001a\u00020\u0014J\u000e\u00101\u001a\u00020\u00142\u0006\u00102\u001a\u000203J\u000e\u00104\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u00105\u001a\u00020\u0014J\u0006\u00106\u001a\u00020\u0014J\u000e\u00107\u001a\u00020\u00142\u0006\u00108\u001a\u00020\u001cJ\u000e\u00109\u001a\u00020\u00142\u0006\u0010:\u001a\u00020\u001cJ\u000e\u0010;\u001a\u00020\u00142\u0006\u00108\u001a\u00020\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006="}, d2 = {"Lcom/codewithkael/firebasevideocall/repository/MainRepository;", "Lcom/codewithkael/firebasevideocall/webrtc/WebRTCClient$Listener;", "firebaseClient", "Lcom/codewithkael/firebasevideocall/firebaseClient/FirebaseClient;", "webRTCClient", "Lcom/codewithkael/firebasevideocall/webrtc/WebRTCClient;", "gson", "Lcom/google/gson/Gson;", "(Lcom/codewithkael/firebasevideocall/firebaseClient/FirebaseClient;Lcom/codewithkael/firebasevideocall/webrtc/WebRTCClient;Lcom/google/gson/Gson;)V", "listener", "Lcom/codewithkael/firebasevideocall/repository/MainRepository$Listener;", "getListener", "()Lcom/codewithkael/firebasevideocall/repository/MainRepository$Listener;", "setListener", "(Lcom/codewithkael/firebasevideocall/repository/MainRepository$Listener;)V", "remoteView", "Lorg/webrtc/SurfaceViewRenderer;", "target", "", "changeMyStatus", "", "status", "Lcom/codewithkael/firebasevideocall/utils/UserStatus;", "endCall", "initFirebase", "initLocalSurfaceView", "view", "isVideoCall", "", "initRemoteSurfaceView", "initWebrtcClient", "username", "logOff", "function", "Lkotlin/Function0;", "login", "password", "isDone", "Lkotlin/Function2;", "observeUsersStatus", "Lkotlin/Function1;", "", "Lkotlin/Pair;", "onTransferEventToSocket", "data", "Lcom/codewithkael/firebasevideocall/utils/DataModel;", "sendConnectionRequest", "success", "sendEndCall", "setScreenCaptureIntent", "screenPermissionIntent", "Landroid/content/Intent;", "setTarget", "startCall", "switchCamera", "toggleAudio", "shouldBeMuted", "toggleScreenShare", "isStarting", "toggleVideo", "Listener", "app_debug"})
@javax.inject.Singleton
public final class MainRepository implements com.codewithkael.firebasevideocall.webrtc.WebRTCClient.Listener {
    private final com.codewithkael.firebasevideocall.firebaseClient.FirebaseClient firebaseClient = null;
    private final com.codewithkael.firebasevideocall.webrtc.WebRTCClient webRTCClient = null;
    private final com.google.gson.Gson gson = null;
    private java.lang.String target;
    @org.jetbrains.annotations.Nullable
    private com.codewithkael.firebasevideocall.repository.MainRepository.Listener listener;
    private org.webrtc.SurfaceViewRenderer remoteView;
    
    @javax.inject.Inject
    public MainRepository(@org.jetbrains.annotations.NotNull
    com.codewithkael.firebasevideocall.firebaseClient.FirebaseClient firebaseClient, @org.jetbrains.annotations.NotNull
    com.codewithkael.firebasevideocall.webrtc.WebRTCClient webRTCClient, @org.jetbrains.annotations.NotNull
    com.google.gson.Gson gson) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.codewithkael.firebasevideocall.repository.MainRepository.Listener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable
    com.codewithkael.firebasevideocall.repository.MainRepository.Listener p0) {
    }
    
    public final void login(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit> isDone) {
    }
    
    public final void observeUsersStatus(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.util.List<kotlin.Pair<java.lang.String, java.lang.String>>, kotlin.Unit> status) {
    }
    
    public final void initFirebase() {
    }
    
    public final void sendConnectionRequest(@org.jetbrains.annotations.NotNull
    java.lang.String target, boolean isVideoCall, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> success) {
    }
    
    public final void setTarget(@org.jetbrains.annotations.NotNull
    java.lang.String target) {
    }
    
    public final void initWebrtcClient(@org.jetbrains.annotations.NotNull
    java.lang.String username) {
    }
    
    public final void initLocalSurfaceView(@org.jetbrains.annotations.NotNull
    org.webrtc.SurfaceViewRenderer view, boolean isVideoCall) {
    }
    
    public final void initRemoteSurfaceView(@org.jetbrains.annotations.NotNull
    org.webrtc.SurfaceViewRenderer view) {
    }
    
    public final void startCall() {
    }
    
    public final void endCall() {
    }
    
    public final void sendEndCall() {
    }
    
    private final void changeMyStatus(com.codewithkael.firebasevideocall.utils.UserStatus status) {
    }
    
    public final void toggleAudio(boolean shouldBeMuted) {
    }
    
    public final void toggleVideo(boolean shouldBeMuted) {
    }
    
    public final void switchCamera() {
    }
    
    @java.lang.Override
    public void onTransferEventToSocket(@org.jetbrains.annotations.NotNull
    com.codewithkael.firebasevideocall.utils.DataModel data) {
    }
    
    public final void setScreenCaptureIntent(@org.jetbrains.annotations.NotNull
    android.content.Intent screenPermissionIntent) {
    }
    
    public final void toggleScreenShare(boolean isStarting) {
    }
    
    public final void logOff(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> function) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/codewithkael/firebasevideocall/repository/MainRepository$Listener;", "", "endCall", "", "onLatestEventReceived", "data", "Lcom/codewithkael/firebasevideocall/utils/DataModel;", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void onLatestEventReceived(@org.jetbrains.annotations.NotNull
        com.codewithkael.firebasevideocall.utils.DataModel data);
        
        public abstract void endCall();
    }
}