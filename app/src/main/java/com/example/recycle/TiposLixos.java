package com.example.recycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
public class TiposLixos extends AppCompatActivity {

    private Button btnReciclaveis, btnComumRejeitos, btnOrganico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipos_de_lixos);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        btnReciclaveis = findViewById(R.id.btnReciclaveis);
        btnComumRejeitos = findViewById(R.id.btnComumRejeitos);
        btnOrganico = findViewById(R.id.btnOrganico);

        btnReciclaveis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaReciclaveis = new Intent(TiposLixos.this, Reciclavel.class);
                startActivity(telaReciclaveis);
            }
        });

        btnComumRejeitos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaComumRejeitos = new Intent(TiposLixos.this, Comum.class);
                startActivity(telaComumRejeitos);
            }
        });

        btnOrganico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaOrganico = new Intent(TiposLixos.this, Organico.class);
                startActivity(telaOrganico);
            }
        });
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==android.R.id.home) {
            finish();
        }
        return super.onContextItemSelected(item);
    }
}