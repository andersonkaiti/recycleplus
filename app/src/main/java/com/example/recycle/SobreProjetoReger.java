package com.example.recycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;

public class SobreProjetoReger extends AppCompatActivity {

    private Button btnTiposLixos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre_projeto_reger);

        Toolbar toolbar = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        btnTiposLixos = findViewById(R.id.btnTiposLixos);

        btnTiposLixos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaTiposdeLixos = new Intent(SobreProjetoReger.this, TiposLixos.class);
                startActivity(telaTiposdeLixos);
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