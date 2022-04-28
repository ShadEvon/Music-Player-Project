package com.example.musicplayer;

import android.os.Message;

public abstract class Handler {
    public void sendMessage(Message msg) {
    }

    public abstract boolean handleMessage(Message msg);
}
