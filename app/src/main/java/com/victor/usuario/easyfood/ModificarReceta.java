package com.victor.usuario.easyfood;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ModificarReceta extends AppCompatActivity {

    EditText Title, Ingredients, Steps;
    BaseDeDatos db;
    String name, ingredients, steps;
    Button Finished, Delete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final int var = getIntent().getIntExtra("id", -1);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificar_receta);
        Title = (EditText) findViewById(R.id.ShowEditTittle);
        Ingredients = (EditText) findViewById(R.id.ShowEditIngredents);
        Steps = (EditText) findViewById(R.id.ShowEditSteps);

        Finished = (Button) findViewById(R.id.FinishEdit);
        Delete = (Button) findViewById(R.id.DeleteThis);

        mostrarNotas(var);

        Finished.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ModificarNota(var);
            }
        });
        Delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder altdial = new AlertDialog.Builder(ModificarReceta.this);
                altdial.setMessage("¿ Esta seguro que desea borrar la receta?").setCancelable(false).setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        db.BorrarReceta(var);
                        Intent intent = new Intent(ModificarReceta.this, MenuRecetasModificar.class);
                        startActivity(intent);
                        finish();
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
            AlertDialog alert = altdial.create();
                alert.setTitle("Eliminar Receta");
                alert.show();
            }
        });
    }

    private void mostrarNotas(int item) {
        db = new BaseDeDatos(this);
        Cursor c = db.ObtenerDatosReceta(item);

        if (c.moveToFirst()) {

            Title.setText(c.getString(c.getColumnIndex(BaseDeDatos.DatosTabla.COLUMNA_NOMBRES)));
            Ingredients.setText(c.getString(c.getColumnIndex(BaseDeDatos.DatosTabla.COLUMNA_INGREDIENTES)));
            Steps.setText(c.getString(c.getColumnIndex(BaseDeDatos.DatosTabla.COLUMNA_PASOS)));
        }
    }


    private void ModificarNota(int id){

        String t, i, s;
        t = Title.getText().toString();
        i = Ingredients.getText().toString();
        s = Steps.getText().toString();

        db = new BaseDeDatos(this);
        db.ActualizarReceta(id, t, i, s);

        Intent intent = new Intent(ModificarReceta.this, MenuRecetasModificar.class);
        startActivity(intent);
        finish();
    }


}
