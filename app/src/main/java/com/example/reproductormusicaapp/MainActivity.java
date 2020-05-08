package com.example.reproductormusicaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

