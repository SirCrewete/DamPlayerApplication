package com.example.reproductormusicaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class loggin_exito extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loggin_exito);
    }

    public void funcionLoginnExito(View v){
        Toast.makeText(this,"Registro completado..", Toast.LENGTH_SHORT).show();
        Intent intentLogin = new Intent(this,  insideApp.class);
        startActivity(intentLogin);
    }
}
