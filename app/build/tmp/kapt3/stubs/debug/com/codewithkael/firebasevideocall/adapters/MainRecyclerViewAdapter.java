package com.codewithkael.firebasevideocall.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J \u0010\u0014\u001a\u00020\r2\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b0\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0006\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/codewithkael/firebasevideocall/adapters/MainRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/codewithkael/firebasevideocall/adapters/MainRecyclerViewAdapter$MainRecyclerViewHolder;", "listener", "Lcom/codewithkael/firebasevideocall/adapters/MainRecyclerViewAdapter$Listener;", "(Lcom/codewithkael/firebasevideocall/adapters/MainRecyclerViewAdapter$Listener;)V", "usersList", "", "Lkotlin/Pair;", "", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateList", "list", "Listener", "MainRecyclerViewHolder", "app_debug"})
public final class MainRecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.codewithkael.firebasevideocall.adapters.MainRecyclerViewAdapter.MainRecyclerViewHolder> {
    private final com.codewithkael.firebasevideocall.adapters.MainRecyclerViewAdapter.Listener listener = null;
    private java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> usersList;
    
    public MainRecyclerViewAdapter(@org.jetbrains.annotations.NotNull
    com.codewithkael.firebasevideocall.adapters.MainRecyclerViewAdapter.Listener listener) {
        super();
    }
    
    public final void updateList(@org.jetbrains.annotations.NotNull
    java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.codewithkael.firebasevideocall.adapters.MainRecyclerViewAdapter.MainRecyclerViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.codewithkael.firebasevideocall.adapters.MainRecyclerViewAdapter.MainRecyclerViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/codewithkael/firebasevideocall/adapters/MainRecyclerViewAdapter$Listener;", "", "onAudioCallClicked", "", "username", "", "onVideoCallClicked", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void onVideoCallClicked(@org.jetbrains.annotations.NotNull
        java.lang.String username);
        
        public abstract void onAudioCallClicked(@org.jetbrains.annotations.NotNull
        java.lang.String username);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004JB\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/codewithkael/firebasevideocall/adapters/MainRecyclerViewAdapter$MainRecyclerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/codewithkael/firebasevideocall/databinding/ItemMainRecyclerViewBinding;", "(Lcom/codewithkael/firebasevideocall/databinding/ItemMainRecyclerViewBinding;)V", "context", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "bind", "", "user", "Lkotlin/Pair;", "", "videoCallClicked", "Lkotlin/Function1;", "audioCallClicked", "app_debug"})
    public static final class MainRecyclerViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.codewithkael.firebasevideocall.databinding.ItemMainRecyclerViewBinding binding = null;
        private final android.content.Context context = null;
        
        public MainRecyclerViewHolder(@org.jetbrains.annotations.NotNull
        com.codewithkael.firebasevideocall.databinding.ItemMainRecyclerViewBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        kotlin.Pair<java.lang.String, java.lang.String> user, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> videoCallClicked, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> audioCallClicked) {
        }
    }
}