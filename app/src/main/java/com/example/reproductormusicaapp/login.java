package com.example.reproductormusicaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void functionInside(View v){
        Toast.makeText(this,"INSIDEAPP", Toast.LENGTH_SHORT).show();
        Intent intentInsideApp = new Intent(this, insideApp.class);
        startActivity(intentInsideApp);
    }
}
