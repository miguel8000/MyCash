package com.gameon.mycash_carteiradigital.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.gameon.mycash_carteiradigital.R;
import com.gameon.mycash_carteiradigital.helper.DbHelper;

public class CadastroGanhosActivity extends AppCompatActivity {

    private Spinner spinnerCategory;
    private Spinner getSpinnerCategory2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_ganhos);

        //Configurando DropDown das categorias de ganhos
        spinnerCategory = findViewById(R.id.spinnerCategory);

        String[] categorys = getResources().getStringArray(R.array.earning_category);
        ArrayAdapter arrayAdapter = new ArrayAdapter(
                this, android.R.layout.simple_spinner_item, categorys);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCategory.setAdapter(arrayAdapter);

        //Configurando DropDown das categorias de despesas
        getSpinnerCategory2 = findViewById(R.id.spinnerCategory2);
        String[] category2 = getResources().getStringArray(R.array.expenses_category);
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(
                this, android.R.layout.simple_spinner_item, category2);
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        getSpinnerCategory2.setAdapter(arrayAdapter2);
    }
}
