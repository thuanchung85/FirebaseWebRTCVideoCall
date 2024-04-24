/*
 * Copyright 2024 Signal Messenger, LLC
 * SPDX-License-Identifier: AGPL-3.0-only
 */

package org.thoughtcrime.securesms.PLAYGROUND;

public class myMessage {
  String txt = "String";
  int isMy = 0;

  myMessage(String txt, int isMy){
    this.txt = txt;
    this.isMy = isMy;

  }
  int isMyMessage(){
    return isMy;
  }

}
