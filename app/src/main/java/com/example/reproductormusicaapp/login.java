package com.example.reproductormusicaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText datoUsuario = findViewById(R.id.editText);
        final EditText datoPassword = findViewById(R.id.editText6);

        Button btn_login = findViewById(R.id.button4);
        btn_login.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                functionLoginIn(v, datoUsuario, datoPassword);
            }
        });
    }



    public void functionInside(View v){
        Intent intentInsideApp = new Intent(this, insideApp.class);
        startActivity(intentInsideApp);
    }

    public void functionLoginIn(View v, EditText datosUsuario, EditText datosPassword){
        Intent intentLogin = new Intent(this, insideApp.class);
        BaseDeDatos bd = new BaseDeDatos( this, "android", null, 1);
        List<Usuario> listaUsuarios = bd.getData();


        for (int i = 0; i < listaUsuarios.size(); i++){
                System.out.println(listaUsuarios.get(i));
                if (datosUsuario.getText().toString().equals(listaUsuarios.get(i).getNombre()) && datosPassword.getText().toString().equals(listaUsuarios.get(i).getPassword())){
                    startActivity(intentLogin);
                }
        }
    }


}
