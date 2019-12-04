package com.victor.usuario.easyfood;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MostrarReceta extends AppCompatActivity {


    TextView titulo, ingredents, steps;
    BaseDeDatos db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_receta);

        int id = getIntent().getIntExtra("id", -1);

        titulo = (TextView) findViewById(R.id.ShowTittle);
        ingredents = (TextView) findViewById(R.id.ShowIngredents);
        steps = (TextView) findViewById(R.id.ShowSteps);

        mostrarNotas(id);

    }

    private void mostrarNotas(int item){

        db = new BaseDeDatos(this);
        Cursor c = db.ObtenerDatosReceta(item);

        if(c.moveToFirst()){

            titulo.setText(c.getString(c.getColumnIndex(BaseDeDatos.DatosTabla.COLUMNA_NOMBRES)));
            ingredents.setText(c.getString(c.getColumnIndex(BaseDeDatos.DatosTabla.COLUMNA_INGREDIENTES)));
            steps.setText(c.getString(c.getColumnIndex(BaseDeDatos.DatosTabla.COLUMNA_PASOS)));
        }
    }

}
