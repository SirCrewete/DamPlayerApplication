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
        Toast.makeText(this,"Procediendo al registro.", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, RegistroActivity.class);
        startActivity(intent);
    }

    public void functionLoginIn(View v){
        Toast.makeText(this,"Registro completado con exito.", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, insideApp.class);
        startActivity(intent);
    }
}
}
