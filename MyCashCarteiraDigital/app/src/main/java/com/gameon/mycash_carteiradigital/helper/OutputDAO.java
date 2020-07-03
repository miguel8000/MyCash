package com.gameon.mycash_carteiradigital.helper;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.gameon.mycash_carteiradigital.model.Output;

import java.security.cert.CertificateParsingException;
import java.util.List;

public class OutputDAO implements OutputDAOInterface {

    private SQLiteDatabase write;
    private SQLiteDatabase read;

    public OutputDAO(Context context) {
        DbHelper dbHelper = new DbHelper(context);
        write = dbHelper.getWritableDatabase();
        read = dbHelper.getReadableDatabase();
    }

    @Override
    public boolean save(Output output) {

        ContentValues contentValues = new ContentValues();
        contentValues.put("value_output", output.getValueOutput());
        contentValues.put("description_output", output.getDescriptionOutput());
        contentValues.put("date_output", output.getDateOutput());
        contentValues.put("id_cat", output.getIdCategory());

        try{

            Log.i("saveOutput", "Sucesso ao salvar output (gastos)!");
        }catch (Exception e){
            Log.i("saveOutput", "Erro ao salvar output (gastos) : " + e.getMessage());
            return false;
        }

        return true;
    }

    @Override
    public boolean update(Output output) {
        return false;
    }

    @Override
    public boolean delete(Output output) {
        return false;
    }

    @Override
    public List<Output> list() {
        return null;
    }
}
