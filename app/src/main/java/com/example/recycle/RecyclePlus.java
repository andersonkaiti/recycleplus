package com.example.recycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class RecyclePlus extends AppCompatActivity {

    private Button btnSobreREGER, btnTiposLixos, btnCreditos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycleplus);

        btnSobreREGER = findViewById(R.id.btnSobreREGER);
        btnTiposLixos = findViewById(R.id.btnTiposLixos);
        btnCreditos = findViewById(R.id.btnCreditos);

        btnSobreREGER.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaSobreREGER = new Intent(RecyclePlus.this, SobreProjetoReger.class);
                startActivity(telaSobreREGER);
            }
        });

        btnTiposLixos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaTiposdeLixos = new Intent(RecyclePlus.this, TiposLixos.class);
                startActivity(telaTiposdeLixos);
            }
        });
        
        btnCreditos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaCreditos = new Intent(RecyclePlus.this, Creditos.class);
                startActivity(telaCreditos);
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