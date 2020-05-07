package com.example.reproductormusicaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class insideApp extends AppCompatActivity {

    MediaPlayer mp;
    int posicion = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inside_app);
    }

    public void clickOnStart(View v) {
        mp = MediaPlayer.create(this, R.raw.hammer);
        mp.start();
    }

    public void clickOnStop(View v){
        if(mp != null) {
            mp.stop();
        }
    }
}
