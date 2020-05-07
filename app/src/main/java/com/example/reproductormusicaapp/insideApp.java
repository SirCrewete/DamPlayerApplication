package com.example.reproductormusicaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class insideApp extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inside_app);
    }

    public void onClickComenzar(View v){
        startService(new Intent(getBaseContext(), MyService.class));
    }

    public void onClickParar(View v){
        stopService(new Intent(getBaseContext(), MyService.class));
    }

}
