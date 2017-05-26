package com.example.yawar.historypet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Inicio extends AppCompatActivity {
    protected EditText email, pass;
    protected TextView txtSub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        getSupportActionBar().hide();
        email=(EditText)findViewById(R.id.correo);
        pass=(EditText)findViewById(R.id.contraseña);
        txtSub = (TextView)findViewById(R.id.crearUser);

    }
    public void inicio(View view){
        String corr=email.getText().toString();
        String pasw=pass.getText().toString();
        if(corr.compareTo("yawarvs@gmail.com")==0 && pasw.compareTo("hola123")==0){
            Intent i=new Intent(this,Entrar.class);
            startActivity(i);
            finish();
            Toast t = Toast.makeText(this,"Se inició correctamente", Toast.LENGTH_SHORT);
            t.show();
        }
        else{
            Toast t = Toast.makeText(this,"Usuario incorrecto", Toast.LENGTH_SHORT);
            t.show();
        }
    }
    public void crear(View view){
        Toast t = Toast.makeText(this,"Creando usuario...", Toast.LENGTH_SHORT);
        t.show();
        Intent i=new Intent(this,Registro.class);
        startActivity(i);
    }



}
