package com.victor.usuario.easyfood;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BlockDeNotas extends AppCompatActivity {

    EditText EdText;
    Button btnNota;
    BaseDeDatos db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_block_de_notas);

        EdText = (EditText) findViewById(R.id.EdTextNotas);
        btnNota = (Button) findViewById(R.id.FinishNote);

        MostrarNotas();

        btnNota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AgregarNota();
            }
        });

    }

    public void AgregarNota(){
        String text;
        db = new BaseDeDatos(this);
        text = String.valueOf(EdText.getText());
        db.ActualizarNota(1, text);
        Intent intent = new Intent(BlockDeNotas.this, MenuPrincipal.class);
        startActivity(intent);
        finish();
    }

    public void MostrarNotas(){
        db = new BaseDeDatos(this);
        Cursor c = db.MostrarNota(1);
        if(c.moveToFirst()){
            EdText.setText(c.getString(c.getColumnIndex(BaseDeDatos.Anotador.NOTA)));
        }
    }
}