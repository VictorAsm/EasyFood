package com.victor.usuario.easyfood;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MenuRecetasModificar extends AppCompatActivity {

    //Menu donde se pueden agregar y modificar recetas

    BaseDeDatos db;
    ListView listView;
    ArrayList<String> item;
    List<Integer> ids = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_recetas_modificar);

        listView = (ListView) findViewById(R.id.Lista2);

        mostrarNotas();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // La posición donde se hace clic en el elemento de lista se obtiene de la
                // la posición de parámetro de la vista de lista de Android
                int posicion = position;

                //obtengo el valor del string del elemento donde se hizo clic
                String itemValue = (String) listView.getItemAtPosition(position);

                int idReceta = ids.get(position);

                //Con el fin de empezar a mostrar una nueva actividad lo que necesitamos es una intención
                Intent intent = new Intent(getApplicationContext(),ModificarReceta.class);

                intent.putExtra("id", idReceta);
                //intent.putExtra("dato", itemValue);
                // Aquí pasaremos el parámetro de la intención creada previamente
                startActivity(intent);
                finish();
            }
        });
    }

    private void mostrarNotas(){
        db = new BaseDeDatos(this);
        Cursor c = db.ObtenerDatos();
        item = new ArrayList<String>();
        ids = new ArrayList<Integer>();
        String tittle = "";
        if(c.moveToFirst()){

            /*Recorremos todo el cursor hasta que no haya mas registros*/
            do{
                tittle = c.getString(c.getColumnIndex(BaseDeDatos.DatosTabla.COLUMNA_NOMBRES));
                item.add(tittle);
                int id = c.getInt(c.getColumnIndex(BaseDeDatos.DatosTabla.COLUMNA_ID));
                ids.add(id);
            }while(c.moveToNext());
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


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_addData:
                Intent intent = new Intent(MenuRecetasModificar.this, AgregarReceta.class);
                startActivity(intent);
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
