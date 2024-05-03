package com.codewithkael.firebasevideocall.utils;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/codewithkael/firebasevideocall/utils/AppModule;", "", "()V", "provideContext", "Landroid/content/Context;", "context", "provideDataBaseInstance", "Lcom/google/firebase/database/FirebaseDatabase;", "provideDatabaseReference", "Lcom/google/firebase/database/DatabaseReference;", "db", "provideGson", "Lcom/google/gson/Gson;", "app_debug"})
@dagger.Module
public final class AppModule {
    
    public AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final android.content.Context provideContext(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final com.google.gson.Gson provideGson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final com.google.firebase.database.FirebaseDatabase provideDataBaseInstance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final com.google.firebase.database.DatabaseReference provideDatabaseReference(@org.jetbrains.annotations.NotNull
    com.google.firebase.database.FirebaseDatabase db) {
        return null;
    }
}