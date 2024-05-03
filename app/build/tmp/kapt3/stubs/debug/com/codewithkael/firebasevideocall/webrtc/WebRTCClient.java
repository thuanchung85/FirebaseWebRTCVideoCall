package com.codewithkael.firebasevideocall.webrtc;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00cc\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0001pB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020LJ\u000e\u0010M\u001a\u00020J2\u0006\u0010N\u001a\u00020,J\u000e\u0010O\u001a\u00020J2\u0006\u0010N\u001a\u00020,J\u0006\u0010P\u001a\u00020JJ\u0006\u0010Q\u001a\u00020\bJ\u0012\u0010R\u001a\u0004\u0018\u0001072\u0006\u0010S\u001a\u00020TH\u0002J\b\u0010U\u001a\u000209H\u0002J\b\u0010V\u001a\u00020CH\u0002J\u0010\u0010W\u001a\u00020H2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0016\u0010X\u001a\u00020J2\u0006\u0010Y\u001a\u00020.2\u0006\u0010Z\u001a\u00020[J\b\u0010\\\u001a\u00020JH\u0002J\u000e\u0010]\u001a\u00020J2\u0006\u0010^\u001a\u00020.J\u0010\u0010_\u001a\u00020J2\u0006\u0010^\u001a\u00020.H\u0002J\u0016\u0010`\u001a\u00020J2\u0006\u0010F\u001a\u00020,2\u0006\u0010S\u001a\u00020TJ\u000e\u0010a\u001a\u00020J2\u0006\u0010b\u001a\u00020cJ\u0016\u0010d\u001a\u00020J2\u0006\u0010N\u001a\u00020,2\u0006\u0010K\u001a\u00020LJ\u000e\u0010e\u001a\u00020J2\u0006\u0010f\u001a\u00020>J\u0010\u0010g\u001a\u00020J2\u0006\u0010Y\u001a\u00020.H\u0002J\u0018\u0010h\u001a\u00020J2\u0006\u0010Y\u001a\u00020.2\u0006\u0010Z\u001a\u00020[H\u0002J\u0006\u0010i\u001a\u00020JJ\b\u0010j\u001a\u00020JH\u0002J\u0006\u0010k\u001a\u00020JJ\u0006\u0010l\u001a\u00020JJ\u000e\u0010m\u001a\u00020J2\u0006\u0010n\u001a\u00020[J\u000e\u0010o\u001a\u00020J2\u0006\u0010n\u001a\u00020[R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00130\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R#\u0010\u001a\u001a\n \u000e*\u0004\u0018\u00010\u001b0\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010$\u001a\n \u000e*\u0004\u0018\u00010%0%8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b&\u0010\'R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020,X\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u00100\u001a\n \u000e*\u0004\u0018\u00010%0%8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b2\u0010\u001f\u001a\u0004\b1\u0010\'R\u0010\u00103\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u00108\u001a\u0002098BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b<\u0010\u001f\u001a\u0004\b:\u0010;R\u0010\u0010=\u001a\u0004\u0018\u00010>X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020.X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010@\u001a\u0004\u0018\u00010AX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010B\u001a\u0004\u0018\u00010CX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010D\u001a\u0004\u0018\u00010EX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020,X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020HX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006q"}, d2 = {"Lcom/codewithkael/firebasevideocall/webrtc/WebRTCClient;", "", "context", "Landroid/content/Context;", "gson", "Lcom/google/gson/Gson;", "(Landroid/content/Context;Lcom/google/gson/Gson;)V", "adm", "Lorg/webrtc/audio/AudioDeviceModule;", "getAdm", "()Lorg/webrtc/audio/AudioDeviceModule;", "appContext", "eglBaseContext", "Lorg/webrtc/EglBase$Context;", "kotlin.jvm.PlatformType", "executor", "Ljava/util/concurrent/ExecutorService;", "iceServer", "", "Lorg/webrtc/PeerConnection$IceServer;", "listener", "Lcom/codewithkael/firebasevideocall/webrtc/WebRTCClient$Listener;", "getListener", "()Lcom/codewithkael/firebasevideocall/webrtc/WebRTCClient$Listener;", "setListener", "(Lcom/codewithkael/firebasevideocall/webrtc/WebRTCClient$Listener;)V", "localAudioSource", "Lorg/webrtc/AudioSource;", "getLocalAudioSource", "()Lorg/webrtc/AudioSource;", "localAudioSource$delegate", "Lkotlin/Lazy;", "localAudioTrack", "Lorg/webrtc/AudioTrack;", "localScreenShareVideoTrack", "Lorg/webrtc/VideoTrack;", "localScreenVideoSource", "Lorg/webrtc/VideoSource;", "getLocalScreenVideoSource", "()Lorg/webrtc/VideoSource;", "localScreenVideoSource$delegate", "localStream", "Lorg/webrtc/MediaStream;", "localStreamId", "", "localSurfaceView", "Lorg/webrtc/SurfaceViewRenderer;", "localTrackId", "localVideoSource", "getLocalVideoSource", "localVideoSource$delegate", "localVideoTrack", "mediaConstraint", "Lorg/webrtc/MediaConstraints;", "peerConnection", "Lorg/webrtc/PeerConnection;", "peerConnectionFactory", "Lorg/webrtc/PeerConnectionFactory;", "getPeerConnectionFactory", "()Lorg/webrtc/PeerConnectionFactory;", "peerConnectionFactory$delegate", "permissionIntent", "Landroid/content/Intent;", "remoteSurfaceView", "saveRecordedAudioToFile", "Lcom/codewithkael/firebasevideocall/webrtc/RecordedAudioToFileController;", "screenCapturer", "Lorg/webrtc/VideoCapturer;", "surfaceTextureHelper", "Lorg/webrtc/SurfaceTextureHelper;", "username", "videoCapturer", "Lorg/webrtc/CameraVideoCapturer;", "addIceCandidateToPeer", "", "iceCandidate", "Lorg/webrtc/IceCandidate;", "answer", "target", "call", "closeConnection", "createJavaAudioDevice", "createPeerConnection", "observer", "Lorg/webrtc/PeerConnection$Observer;", "createPeerConnectionFactory", "createScreenCapturer", "getVideoCapturer", "initLocalSurfaceView", "localView", "isVideoCall", "", "initPeerConnectionFactory", "initRemoteSurfaceView", "view", "initSurfaceView", "initializeWebrtcClient", "onRemoteSessionReceived", "sessionDescription", "Lorg/webrtc/SessionDescription;", "sendIceCandidate", "setPermissionIntent", "screenPermissionIntent", "startCapturingCamera", "startLocalStreaming", "startScreenCapturing", "stopCapturingCamera", "stopScreenCapturing", "switchCamera", "toggleAudio", "shouldBeMuted", "toggleVideo", "Listener", "app_debug"})
@javax.inject.Singleton
public final class WebRTCClient {
    private final android.content.Context context = null;
    private final com.google.gson.Gson gson = null;
    @org.jetbrains.annotations.Nullable
    private com.codewithkael.firebasevideocall.webrtc.WebRTCClient.Listener listener;
    private java.lang.String username;
    private final org.webrtc.EglBase.Context eglBaseContext = null;
    private final kotlin.Lazy peerConnectionFactory$delegate = null;
    private org.webrtc.PeerConnection peerConnection;
    private final java.util.List<org.webrtc.PeerConnection.IceServer> iceServer = null;
    private final kotlin.Lazy localVideoSource$delegate = null;
    private final kotlin.Lazy localAudioSource$delegate = null;
    private final org.webrtc.CameraVideoCapturer videoCapturer = null;
    private org.webrtc.SurfaceTextureHelper surfaceTextureHelper;
    private final org.webrtc.MediaConstraints mediaConstraint = null;
    private final java.util.concurrent.ExecutorService executor = null;
    private org.webrtc.SurfaceViewRenderer localSurfaceView;
    private org.webrtc.SurfaceViewRenderer remoteSurfaceView;
    private org.webrtc.MediaStream localStream;
    private java.lang.String localTrackId = "";
    private java.lang.String localStreamId = "";
    private org.webrtc.AudioTrack localAudioTrack;
    private org.webrtc.VideoTrack localVideoTrack;
    private android.content.Intent permissionIntent;
    private org.webrtc.VideoCapturer screenCapturer;
    private final kotlin.Lazy localScreenVideoSource$delegate = null;
    private org.webrtc.VideoTrack localScreenShareVideoTrack;
    private com.codewithkael.firebasevideocall.webrtc.RecordedAudioToFileController saveRecordedAudioToFile;
    private final android.content.Context appContext = null;
    @org.jetbrains.annotations.NotNull
    private final org.webrtc.audio.AudioDeviceModule adm = null;
    
    @javax.inject.Inject
    public WebRTCClient(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.google.gson.Gson gson) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.codewithkael.firebasevideocall.webrtc.WebRTCClient.Listener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable
    com.codewithkael.firebasevideocall.webrtc.WebRTCClient.Listener p0) {
    }
    
    private final org.webrtc.PeerConnectionFactory getPeerConnectionFactory() {
        return null;
    }
    
    private final org.webrtc.VideoSource getLocalVideoSource() {
        return null;
    }
    
    private final org.webrtc.AudioSource getLocalAudioSource() {
        return null;
    }
    
    private final org.webrtc.VideoSource getLocalScreenVideoSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.webrtc.audio.AudioDeviceModule getAdm() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.webrtc.audio.AudioDeviceModule createJavaAudioDevice() {
        return null;
    }
    
    private final void initPeerConnectionFactory() {
    }
    
    private final org.webrtc.PeerConnectionFactory createPeerConnectionFactory() {
        return null;
    }
    
    public final void initializeWebrtcClient(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    org.webrtc.PeerConnection.Observer observer) {
    }
    
    private final org.webrtc.PeerConnection createPeerConnection(org.webrtc.PeerConnection.Observer observer) {
        return null;
    }
    
    public final void call(@org.jetbrains.annotations.NotNull
    java.lang.String target) {
    }
    
    public final void answer(@org.jetbrains.annotations.NotNull
    java.lang.String target) {
    }
    
    public final void onRemoteSessionReceived(@org.jetbrains.annotations.NotNull
    org.webrtc.SessionDescription sessionDescription) {
    }
    
    public final void addIceCandidateToPeer(@org.jetbrains.annotations.NotNull
    org.webrtc.IceCandidate iceCandidate) {
    }
    
    public final void sendIceCandidate(@org.jetbrains.annotations.NotNull
    java.lang.String target, @org.jetbrains.annotations.NotNull
    org.webrtc.IceCandidate iceCandidate) {
    }
    
    public final void closeConnection() {
    }
    
    public final void switchCamera() {
    }
    
    public final void toggleAudio(boolean shouldBeMuted) {
    }
    
    public final void toggleVideo(boolean shouldBeMuted) {
    }
    
    private final void initSurfaceView(org.webrtc.SurfaceViewRenderer view) {
    }
    
    public final void initRemoteSurfaceView(@org.jetbrains.annotations.NotNull
    org.webrtc.SurfaceViewRenderer view) {
    }
    
    public final void initLocalSurfaceView(@org.jetbrains.annotations.NotNull
    org.webrtc.SurfaceViewRenderer localView, boolean isVideoCall) {
    }
    
    private final void startLocalStreaming(org.webrtc.SurfaceViewRenderer localView, boolean isVideoCall) {
    }
    
    private final void startCapturingCamera(org.webrtc.SurfaceViewRenderer localView) {
    }
    
    private final org.webrtc.CameraVideoCapturer getVideoCapturer(android.content.Context context) {
        return null;
    }
    
    private final void stopCapturingCamera() {
    }
    
    public final void setPermissionIntent(@org.jetbrains.annotations.NotNull
    android.content.Intent screenPermissionIntent) {
    }
    
    public final void startScreenCapturing() {
    }
    
    public final void stopScreenCapturing() {
    }
    
    private final org.webrtc.VideoCapturer createScreenCapturer() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/codewithkael/firebasevideocall/webrtc/WebRTCClient$Listener;", "", "onTransferEventToSocket", "", "data", "Lcom/codewithkael/firebasevideocall/utils/DataModel;", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void onTransferEventToSocket(@org.jetbrains.annotations.NotNull
        com.codewithkael.firebasevideocall.utils.DataModel data);
    }
}