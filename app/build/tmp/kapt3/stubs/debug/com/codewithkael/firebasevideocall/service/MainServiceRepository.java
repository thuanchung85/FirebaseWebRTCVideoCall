package com.codewithkael.firebasevideocall.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\fJ\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0006\u0010\u0012\u001a\u00020\u0006J\u0006\u0010\u0013\u001a\u00020\u0006J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\tJ\u000e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\fJ\u000e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\tJ\u000e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/codewithkael/firebasevideocall/service/MainServiceRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "sendEndCall", "", "setupViews", "videoCall", "", "caller", "target", "", "startService", "username", "startServiceIntent", "intent", "Landroid/content/Intent;", "stopService", "switchCamera", "toggleAudio", "shouldBeMuted", "toggleAudioDevice", "type", "toggleScreenShare", "isStarting", "toggleVideo", "app_debug"})
public final class MainServiceRepository {
    private final android.content.Context context = null;
    
    @javax.inject.Inject
    public MainServiceRepository(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    public final void startService(@org.jetbrains.annotations.NotNull
    java.lang.String username) {
    }
    
    private final void startServiceIntent(android.content.Intent intent) {
    }
    
    public final void setupViews(boolean videoCall, boolean caller, @org.jetbrains.annotations.NotNull
    java.lang.String target) {
    }
    
    public final void sendEndCall() {
    }
    
    public final void switchCamera() {
    }
    
    public final void toggleAudio(boolean shouldBeMuted) {
    }
    
    public final void toggleVideo(boolean shouldBeMuted) {
    }
    
    public final void toggleAudioDevice(@org.jetbrains.annotations.NotNull
    java.lang.String type) {
    }
    
    public final void toggleScreenShare(boolean isStarting) {
    }
    
    public final void stopService() {
    }
}