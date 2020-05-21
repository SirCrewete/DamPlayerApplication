package com.example.reproductormusicaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class insideApp extends AppCompatActivity {

    MediaPlayer mp;
    int posicion = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inside_app);
        BroadcastReceiver receiver = new MyReceiver();
        IntentFilter filter = new IntentFilter(getIntent().ACTION_HEADSET_PLUG);
        this.registerReceiver(receiver,filter);

        ConstraintLayout constraintLayout = findViewById(R.id.layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();
    }

    public void  FLAG_SHOW_UI(){
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

    public void clickOnHome(View v){
        Intent clickOnHome = new Intent (this, MainActivity.class);
        startActivity(clickOnHome);
    }
}
