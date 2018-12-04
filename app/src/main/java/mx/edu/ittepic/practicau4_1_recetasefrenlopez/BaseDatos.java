package mx.edu.ittepic.practicau4_1_recetasefrenlopez;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class BaseDatos extends SQLiteOpenHelper {

    public BaseDatos(Context context, String name,SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //crear tabla
        // SQLITE contruye objetos que son capaces de realizar cualquier trassacion
        db.execSQL( "CREATE TABLE RECETA(ID INTEGER PRIMARY KEY,NOMBRE VARCHAR(200), INGREDIENTES VARCHAR(1000), PREPARACION VARCHAR (1000),OBSERVACIONES VARCHAR(500) )" );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
