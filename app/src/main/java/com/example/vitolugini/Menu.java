package com.example.vitolugini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Menu extends AppCompatActivity {
    TextView mensaje;
    String NombreUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        mensaje=(TextView) findViewById(R.id.TextView2);

        Bundle extras = getIntent().getExtras();
        NombreUser = extras.getString("NombreUser");
        mensaje.setText(

                        "Hola estimado " + NombreUser + "¿Que te podemos llevar hasta tu casa este dia?"
        );


    }


    public void PizzaBoton (View view){
        Intent botonpizza = new Intent(this, MenuPizza.class);
        startActivity(botonpizza);
    }

    public void PepsiBoton (View view){
        Intent botonpepsi = new Intent(this, MenuPepsi.class);
        startActivity(botonpepsi);
    }

    public void Anterior (View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);

    }

}