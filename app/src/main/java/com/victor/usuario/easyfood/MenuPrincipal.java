package com.victor.usuario.easyfood;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MenuPrincipal extends AppCompatActivity implements View.OnClickListener{

    /*En este activity tenemos todos los botones que muestran las opciones disponibles para que el
    * usuario pueda elegir una*/

    Button boton1, boton2, boton3;
    BaseDeDatos db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        //Para leer las recetas
        boton1 = (Button) findViewById(R.id.button);

        //Elegir receta para modificarla posteriormente
        boton2 = (Button) findViewById(R.id.button2);

        //Lista de ingredientes
        boton3 = (Button) findViewById(R.id.button3);

        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
        boton3.setOnClickListener(this);

        db = new BaseDeDatos(this);
        db.AgregarNota();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                Intent intent =  new Intent(MenuPrincipal.this, MenuRecetas.class);
                startActivity(intent);
                break;
            case R.id.button2:
                Intent intent1 = new Intent(MenuPrincipal.this, MenuRecetasModificar.class);
                startActivity(intent1);
                break;
            case R.id.button3:
                Intent intent2 = new Intent(MenuPrincipal.this, BlockDeNotas.class);
                startActivity(intent2);
                break;
        }
    }

}