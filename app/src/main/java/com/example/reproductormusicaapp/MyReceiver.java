package com.example.reproductormusicaapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction() != null){
            if (intent.getAction().equals("android.intent.action.HEADSET_PLUS")){
                System.out.println("Evento de auriculares");
            }
        }
    }
}
