package com.codewithkael.firebasevideocall.webrtc;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016\u00a8\u0006\f"}, d2 = {"Lcom/codewithkael/firebasevideocall/webrtc/MySdpObserver;", "Lorg/webrtc/SdpObserver;", "()V", "onCreateFailure", "", "p0", "", "onCreateSuccess", "desc", "Lorg/webrtc/SessionDescription;", "onSetFailure", "onSetSuccess", "app_debug"})
public class MySdpObserver implements org.webrtc.SdpObserver {
    
    public MySdpObserver() {
        super();
    }
    
    @java.lang.Override
    public void onCreateSuccess(@org.jetbrains.annotations.Nullable
    org.webrtc.SessionDescription desc) {
    }
    
    @java.lang.Override
    public void onSetSuccess() {
    }
    
    @java.lang.Override
    public void onCreateFailure(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @java.lang.Override
    public void onSetFailure(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
}