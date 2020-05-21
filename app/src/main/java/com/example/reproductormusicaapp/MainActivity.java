package com.example.reproductormusicaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText user, pass, datosUsuario, datosPassword;
    Button btnEntrar, btnRegistrar;


    @SuppressLint("WrongViewCast")
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
        intentRegister.putExtra("1", "1");
        intentRegister.putExtra("2", "2");
        intentRegister.putExtra("3", "3");
        intentRegister.putExtra("4", "4");
        intentRegister.putExtra("5", "5");

        startActivity(intentRegister);
    }

    public void functionLoginIn(View v){
        Toast.makeText(this,"TOAST LOGIN", Toast.LENGTH_SHORT).show();
        Intent intentLogin = new Intent(this, login.class);
        if (datosUsuario.equals("") && datosPassword.equals("")){
            startActivity(intentLogin);
        }else{
            Toast.makeText(this, "Usuario o contraseña incorrecta.", Toast.LENGTH_SHORT).show();
        }

    }
}

