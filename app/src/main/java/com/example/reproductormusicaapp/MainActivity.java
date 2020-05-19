package com.example.reproductormusicaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText user, pass;
    Button btnEntrar, btnRegistrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ConstraintLayout constraintLayout = findViewById(R.id.layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();
/*
        user = (EditText) findViewById(R.id.);
        pass = (EditText) findViewById(R.id);
        btnEntrar = (Button) findViewById(R.id.btnEntrar);
*/

    }

    public void functionRegister(View v){
       Toast.makeText(this,"TOAST REGISTER", Toast.LENGTH_SHORT).show();
        Intent intentRegister = new Intent(this, RegistroActivity.class);
        startActivity(intentRegister);
    }

    public void functionLoginIn(View v){
        Toast.makeText(this,"TOAST LOGIN", Toast.LENGTH_SHORT).show();
        Intent intentLogin = new Intent(this, login.class);
        startActivity(intentLogin);
    }

    public void cambiarColor(View view){
        Intent intentCambiarColor = new Intent ();
        Toast.makeText(this, "CAMBIANDO COLOR", Toast.LENGTH_SHORT).show();
    }
}

