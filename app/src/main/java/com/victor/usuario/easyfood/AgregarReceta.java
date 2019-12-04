package com.victor.usuario.easyfood;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AgregarReceta extends AppCompatActivity {

    Button botonTerminarR;
    EditText Titulo, Ingredientes, Pasos;
    BaseDeDatos db;
    String name, parts, steps;

    /*En este activity se colocan los datos de la receta para añadirlo posteriormente a la base
    * de datos para su posterior uso*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_receta);
        botonTerminarR = (Button) findViewById(R.id.Boton);

        Titulo = (EditText) findViewById(R.id.etTitulo);
        Ingredientes = (EditText) findViewById(R.id.etIngredientes);
        Pasos = (EditText) findViewById(R.id.etPasos);

        botonTerminarR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addDatos();
            }
        });
    }

    private void addDatos() {
        name = Titulo.getText().toString();
        parts = Ingredientes.getText().toString();
        steps = Pasos.getText().toString();
        db = new BaseDeDatos(this);

        if (name.equals("") || parts.equals("") || steps.equals("")) {
            Toast.makeText(this, "Ha dejado campos vacios",
                    Toast.LENGTH_LONG).show();
        }else{
            db.AgregarReceta(name, parts, steps);
            Intent intent = new Intent(AgregarReceta.this, MenuRecetas.class);
            startActivity(intent);
            finish();
        }
    }


}
