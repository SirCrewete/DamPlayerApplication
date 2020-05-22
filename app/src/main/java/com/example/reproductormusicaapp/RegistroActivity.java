package com.example.reproductormusicaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegistroActivity extends AppCompatActivity {

    TextView textViewExtras;
    EditText nombre;
    EditText apellido;
    EditText nombreUsuario;
    EditText password;
    EditText email;
    Button register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        textViewExtras = findViewById(R.id.textView_extras);
        Bundle extras = getIntent().getExtras();
        if (extras != null){
                String text = extras.getString("name");
                text+= extras.getString("1");
                text+= extras.getString("2");
                text+= extras.getString("3");
                text+= extras.getString("4");
                text+= extras.getString("5");
            textViewExtras.setText(text);
        }

        nombre = findViewById(R.id.editText4);
        apellido = findViewById(R.id.nombreDeUsuarioRegistro);
        nombreUsuario = findViewById(R.id.editText2);
        password = findViewById(R.id.editText5);
        email = findViewById(R.id.registroEmail);
        register = findViewById(R.id.button3);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               registerUser();
            }
        });



        ConstraintLayout constraintLayout = findViewById(R.id.layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();
    }

    public void funcionRegistrarse(View v){
        Toast.makeText(this,"Registrandose..", Toast.LENGTH_SHORT).show();
        Intent intentLogin = new Intent(this,  loggin_exito.class);
        startActivity(intentLogin);
    }

    private void registerUser(){
        BaseDeDatos bd = new BaseDeDatos( this, "android", null, 1);
        bd.insertData(nombre.getText().toString(),apellido.getText().toString(),nombreUsuario.getText().toString(),password.getText().toString(),email.getText().toString());
        bd.getData();
    }
}
