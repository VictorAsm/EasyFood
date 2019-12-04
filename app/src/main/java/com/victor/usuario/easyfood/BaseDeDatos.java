package com.victor.usuario.easyfood;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

public class BaseDeDatos extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "BaseDeComidas.db";

    public static class DatosTabla implements BaseColumns {
        public static final String NOMBRE_TABLA = "Comidas";
        public static final String COLUMNA_ID = "id";
        public static final String COLUMNA_NOMBRES = "Titulo";
        public static final String COLUMNA_INGREDIENTES = "Ingredientes";
        public static final String COLUMNA_PASOS = "Pasos";

        private static final String TEXT_TYPE = " TEXT";
        private static final String COMMA_SEP = ",";
        private static final String CREAR_TABLA_1 = "CREATE TABLE "
                + DatosTabla.NOMBRE_TABLA + " ("
                + DatosTabla.COLUMNA_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + DatosTabla.COLUMNA_NOMBRES + TEXT_TYPE + COMMA_SEP
                + DatosTabla.COLUMNA_INGREDIENTES + TEXT_TYPE + COMMA_SEP
                + DatosTabla.COLUMNA_PASOS + TEXT_TYPE + " )";

        private static final String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS " + DatosTabla.NOMBRE_TABLA;
    }

    public static class Anotador {
        public static final String NOMBRE_TABLA = "Notas";
        public static final String COLUMNA_ID = "id";
        public static final String NOTA = "Texto";

        private static final String TEXT_TYPE = " TEXT";

        private static final String CREAR_TABLA_2 = "CREATE TABLE "
                + Anotador.NOMBRE_TABLA + " ("
                + Anotador.COLUMNA_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + Anotador.NOTA + TEXT_TYPE + " )";

        private static final String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS " + Anotador.NOMBRE_TABLA;
    }

    public BaseDeDatos(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override

    public void onCreate(SQLiteDatabase db) {

        RecetasIniciales ri = new RecetasIniciales();

        db.execSQL(DatosTabla.CREAR_TABLA_1);
        db.execSQL(Anotador.CREAR_TABLA_2);

        db.beginTransaction();
        try {
            ContentValues parte1 = ri.AgregarReceta1();
            ContentValues parte2 = ri.AgregarReceta2();
            ContentValues parte3 = ri.AgregarReceta3();
            ContentValues parte4 = ri.AgregarReceta4();
            ContentValues parte5 = ri.AgregarReceta5();
            ContentValues parte6 = ri.AgregarReceta6();
            ContentValues parte7 = ri.AgregarReceta7();
            ContentValues parte8 = ri.AgregarReceta8();
            ContentValues parte9 = ri.AgregarReceta9();
            ContentValues parte10 = ri.AgregarReceta10();

            db.insert(DatosTabla.NOMBRE_TABLA, null, parte1);
            db.insert(DatosTabla.NOMBRE_TABLA, null, parte2);
            db.insert(DatosTabla.NOMBRE_TABLA, null, parte3);
            db.insert(DatosTabla.NOMBRE_TABLA, null, parte4);
            db.insert(DatosTabla.NOMBRE_TABLA, null, parte5);
            db.insert(DatosTabla.NOMBRE_TABLA, null, parte6);
            db.insert(DatosTabla.NOMBRE_TABLA, null, parte7);
            db.insert(DatosTabla.NOMBRE_TABLA, null, parte8);
            db.insert(DatosTabla.NOMBRE_TABLA, null, parte9);
            db.insert(DatosTabla.NOMBRE_TABLA, null, parte10);

            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DatosTabla.SQL_DELETE_ENTRIES);
        db.execSQL(Anotador.SQL_DELETE_ENTRIES);
        onCreate(db);
    }

    public void close() {
        this.close();
    }

    public void AgregarReceta(String nombre, String ingredientes, String pasos) {
        ContentValues partes = new ContentValues();
        partes.put(DatosTabla.COLUMNA_NOMBRES, nombre);
        partes.put(DatosTabla.COLUMNA_INGREDIENTES, ingredientes);
        partes.put(DatosTabla.COLUMNA_PASOS, pasos);
        this.getWritableDatabase().insert(DatosTabla.NOMBRE_TABLA, null, partes);
    }

    public Cursor ObtenerDatos() {
        String columnas[] = {DatosTabla.COLUMNA_NOMBRES, DatosTabla.COLUMNA_INGREDIENTES, DatosTabla.COLUMNA_PASOS, DatosTabla.COLUMNA_ID};
        Cursor c = this.getReadableDatabase().query(DatosTabla.NOMBRE_TABLA, columnas, null, null, null, null, null);
        return c;
    }

    public Cursor ObtenerDatosReceta(int date) {
        String columnas[] = {DatosTabla.COLUMNA_NOMBRES, DatosTabla.COLUMNA_INGREDIENTES, DatosTabla.COLUMNA_PASOS, DatosTabla.COLUMNA_ID};
        String datos[] = {String.valueOf(date)};
        Cursor c = this.getReadableDatabase().query(DatosTabla.NOMBRE_TABLA, columnas, DatosTabla.COLUMNA_ID + " = ?", datos, null, null, null);
        return c;
    }

    public void ActualizarReceta(int id, String nombre, String ingredientes, String pasos) {
        ContentValues partes = new ContentValues();
        partes.put(DatosTabla.COLUMNA_NOMBRES, nombre);
        partes.put(DatosTabla.COLUMNA_INGREDIENTES, ingredientes);
        partes.put(DatosTabla.COLUMNA_PASOS, pasos);
        String[] strArgs = {String.valueOf(id)};
        getWritableDatabase().update(DatosTabla.NOMBRE_TABLA, partes, DatosTabla.COLUMNA_ID + " = ?", strArgs);
    }

    public void BorrarReceta(int id) {
        String selection = DatosTabla.COLUMNA_ID + " = ?";
        String[] selectionArgs = {String.valueOf(id)};
        this.getWritableDatabase().delete(DatosTabla.NOMBRE_TABLA, selection, selectionArgs);
    }

    public void AgregarNota(){
        String nota= "Agregar Nota";
        ContentValues partes = new ContentValues();
        partes.put(Anotador.NOTA, nota);
        this.getWritableDatabase().insert(Anotador.NOMBRE_TABLA, null, partes);
    }

    public void ActualizarNota(int id, String notaN){
        ContentValues partes = new ContentValues();
        partes.put(Anotador.NOTA, notaN);
        String[] strArgs = {String.valueOf(id)};
        getWritableDatabase().update(Anotador.NOMBRE_TABLA, partes, Anotador.COLUMNA_ID + " = ?", strArgs);
    }

    public Cursor MostrarNota(int id){

        String columnas[] = {Anotador.NOTA, Anotador.COLUMNA_ID};
        String datos[] = {String.valueOf(id)};
        Cursor c = this.getReadableDatabase().query(Anotador.NOMBRE_TABLA, columnas, Anotador.COLUMNA_ID + " = ?", datos, null, null, null);
        return c;

    }

}
