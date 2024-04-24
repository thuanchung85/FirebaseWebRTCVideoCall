/*
 * Copyright 2024 Signal Messenger, LLC
 * SPDX-License-Identifier: AGPL-3.0-only
 */

package org.thoughtcrime.securesms.PLAYGROUND;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.thoughtcrime.securesms.R;

import java.util.ArrayList;
import java.util.List;

public class PLAYGROUND_Activity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private ChatAdapter chatAdapter;
    private List<myMessage> messageList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chung_test_playground_containview); // Set the content view to the blank layout

        messageList = new ArrayList<>();
        messageList.add(new myMessage("Hello, this is a test message.", 1));
        messageList.add(new myMessage("This is another test message.", 0));
        messageList.add(new myMessage("This is a third test message.", 1));

        chatAdapter = new ChatAdapter(messageList);
        recyclerView = findViewById(R.id.PG_recyclerView);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter(chatAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
}