package com.victor.usuario.easyfood;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MenuRecetas extends AppCompatActivity {

    /*Muestra las recetas disponibles*/

    ListView listView;
    BaseDeDatos db;
    List<String> item = null;
    List<Integer> ids = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_recetas);

        listView = (ListView) findViewById(R.id.Lista);

        mostrarNotas();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // La posición donde se hace clic en el elemento de lista se obtiene de la
                // la posición de parámetro de la vista de lista de Android

                int posicion = position;

                //obtengo el valor del string del elemento donde se hizo clic
                String itemValue = (String) listView.getItemAtPosition(posicion);

                String var = itemValue.toString();
                //Con el fin de empezar a mostrar una nueva actividad lo que necesitamos es una intención


                Intent intent = new Intent(MenuRecetas.this, MostrarReceta.class);
                int idReceta = ids.get(position);
                intent.putExtra("id", idReceta);

                // Aquí pasaremos el parámetro de la intención creada previamente
                startActivity(intent);
                finish();
            }
        });
    }

    private void mostrarNotas() {
        db = new BaseDeDatos(this);
        Cursor c = db.ObtenerDatos();
        item = new ArrayList<String>();
        ids = new ArrayList<Integer>();
        String tittle = "";
        if (c.moveToFirst()) {

            /*Recorremos todo el cursor hasta que no haya mas registros*/
            do {
                tittle = c.getString(c.getColumnIndex(BaseDeDatos.DatosTabla.COLUMNA_NOMBRES));
                item.add(tittle);
                int id = c.getInt(c.getColumnIndex(BaseDeDatos.DatosTabla.COLUMNA_ID));
                ids.add(id);
            } while (c.moveToNext());
        }
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, item){

            public View getView(int position, View convertView, ViewGroup parent){
                // Get the current item from ListView
                View view = super.getView(position,convertView, parent);
                if(position %2 == 1)
                {
                    // Set a background color for ListView regular row/item
                    view.setBackgroundColor(Color.parseColor("#000000"));
                }
                else
                {
                    // Set the background color for alternate row/item
                    view.setBackgroundColor(Color.parseColor("#444343"));
                }
                return view;
            }
        };
        listView.setAdapter(adaptador);
    }
}