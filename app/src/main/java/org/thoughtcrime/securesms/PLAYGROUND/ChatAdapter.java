/*
 * Copyright 2024 Signal Messenger, LLC
 * SPDX-License-Identifier: AGPL-3.0-only
 */

package org.thoughtcrime.securesms.PLAYGROUND;


import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.thoughtcrime.securesms.R;

import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ItemViewHolder> {

  static final int TYPE_MESSAGE_RECEIVE = 1;
  static final int TYPE_MESSAGE_SEND = 2;

  private List<myMessage> myMessageList;

  public ChatAdapter(List<myMessage> messageList) {
    this.myMessageList = messageList;
  }

  @NonNull
  @Override
  public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
  {
    switch (viewType) {
      case TYPE_MESSAGE_RECEIVE:
        View view_receive = LayoutInflater.from(parent.getContext()).inflate(R.layout.chung_item_list_message_receive, parent, false);
        return new ItemViewHolder(view_receive);

      case TYPE_MESSAGE_SEND:
        View view_send = LayoutInflater.from(parent.getContext()).inflate(R.layout.chung_item_list_message_send, parent, false);
        return new ItemViewHolder(view_send);
    }
    return null;
  }

  @Override public int getItemViewType(int position) {
    if (myMessageList.get(position).isMyMessage() == 1) {
      return TYPE_MESSAGE_SEND;
    } else {
      return TYPE_MESSAGE_RECEIVE;
    }
  }

  @Override
  public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
    holder.bind((myMessageList.get(position)));
  }

  @Override
  public int getItemCount() {
    return  myMessageList.size();
  }

  static class ItemViewHolder extends RecyclerView.ViewHolder {
    private TextView textView;

    public ItemViewHolder(@NonNull View itemView) {
      super(itemView);
      textView = itemView.findViewById(R.id.textView);
    }

    public void bind(myMessage item) {
      textView.setText(item.txt);
    }
  }
}
