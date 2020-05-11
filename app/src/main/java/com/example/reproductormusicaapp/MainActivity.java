package com.example.reproductormusicaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout constraintLayout = findViewById(R.id.layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();
    }

    public void functionRegister(View v){
       Toast.makeText(this,"TOAST REGISTER", Toast.LENGTH_SHORT).show();
        Intent intentRegister = new Intent(this, RegistroActivity.class);
        startActivity(intentRegister);
    }

    public void functionLoginIn(View v){
        Toast.makeText(this,"TOAST LOGIN", Toast.LENGTH_SHORT).show();
        Intent intentLogin = new Intent(this, insideApp.class);
        startActivity(intentLogin);
    }
}

