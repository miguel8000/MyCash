package com.gameon.mycash_carteiradigital.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.gameon.mycash_carteiradigital.R;

public class LoginActivity extends AppCompatActivity {

    private Button buttonEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_login);

        buttonEnter = findViewById(R.id.buttonEnter);

        buttonEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, CadastroGanhosActivity.class);
                startActivity(intent);
            }
        });

    }
}
