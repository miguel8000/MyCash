package com.gameon.mycash_carteiradigital.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.gameon.mycash_carteiradigital.R;
import com.google.android.material.textfield.TextInputEditText;

public class CadastroDespesasActivity extends AppCompatActivity {

    private Spinner getSpinnerCategory;
    private TextInputEditText inputValue;
    private TextInputEditText inputDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_cadastro_despesas);

        inputValue = findViewById(R.id.inputValueInput);
        inputDescription = findViewById(R.id.inputDescriptionInput);
        getSpinnerCategory = findViewById(R.id.spinnerCategoryOutput);

        //Configurar título da toobar
        getSupportActionBar().setTitle("Entrada das despesas");

        //Configurando DropDown das categorias de despesas
        String[] category = getResources().getStringArray(R.array.expenses_category);
        ArrayAdapter arrayAdapter = new ArrayAdapter(
                this, android.R.layout.simple_spinner_item, category);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        getSpinnerCategory.setAdapter(arrayAdapter);
    }

    //Botão para salvar, na toobar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_finish, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.menuFinish){
            //Lógica para salvar os dados após clicar no botão
        }

        return super.onOptionsItemSelected(item);
    }
}
