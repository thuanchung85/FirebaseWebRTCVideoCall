package com.codewithkael.firebasevideocall.firebaseClient;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001#B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\nJ\u0014\u0010\u000e\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010J2\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u001a\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\n0\u0015J,\u0010\u0017\u001a\u00020\n2$\u0010\u000b\u001a \u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u001a0\u0019\u0012\u0004\u0012\u00020\n0\u0018J\"\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0\u0018J\u0010\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\bH\u0002J\u000e\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\"R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/codewithkael/firebasevideocall/firebaseClient/FirebaseClient;", "", "dbRef", "Lcom/google/firebase/database/DatabaseReference;", "gson", "Lcom/google/gson/Gson;", "(Lcom/google/firebase/database/DatabaseReference;Lcom/google/gson/Gson;)V", "currentUsername", "", "changeMyStatus", "", "status", "Lcom/codewithkael/firebasevideocall/utils/UserStatus;", "clearLatestEvent", "logOff", "function", "Lkotlin/Function0;", "login", "username", "password", "done", "Lkotlin/Function2;", "", "observeUsersStatus", "Lkotlin/Function1;", "", "Lkotlin/Pair;", "sendMessageToOtherClient", "message", "Lcom/codewithkael/firebasevideocall/utils/DataModel;", "success", "setUsername", "subscribeForLatestEvent", "listener", "Lcom/codewithkael/firebasevideocall/firebaseClient/FirebaseClient$Listener;", "Listener", "app_debug"})
@javax.inject.Singleton
public final class FirebaseClient {
    private final com.google.firebase.database.DatabaseReference dbRef = null;
    private final com.google.gson.Gson gson = null;
    private java.lang.String currentUsername;
    
    @javax.inject.Inject
    public FirebaseClient(@org.jetbrains.annotations.NotNull
    com.google.firebase.database.DatabaseReference dbRef, @org.jetbrains.annotations.NotNull
    com.google.gson.Gson gson) {
        super();
    }
    
    private final void setUsername(java.lang.String username) {
    }
    
    public final void login(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit> done) {
    }
    
    public final void observeUsersStatus(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.util.List<kotlin.Pair<java.lang.String, java.lang.String>>, kotlin.Unit> status) {
    }
    
    public final void subscribeForLatestEvent(@org.jetbrains.annotations.NotNull
    com.codewithkael.firebasevideocall.firebaseClient.FirebaseClient.Listener listener) {
    }
    
    public final void sendMessageToOtherClient(@org.jetbrains.annotations.NotNull
    com.codewithkael.firebasevideocall.utils.DataModel message, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> success) {
    }
    
    public final void changeMyStatus(@org.jetbrains.annotations.NotNull
    com.codewithkael.firebasevideocall.utils.UserStatus status) {
    }
    
    public final void clearLatestEvent() {
    }
    
    public final void logOff(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> function) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/codewithkael/firebasevideocall/firebaseClient/FirebaseClient$Listener;", "", "onLatestEventReceived", "", "event", "Lcom/codewithkael/firebasevideocall/utils/DataModel;", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void onLatestEventReceived(@org.jetbrains.annotations.NotNull
        com.codewithkael.firebasevideocall.utils.DataModel event);
    }
}