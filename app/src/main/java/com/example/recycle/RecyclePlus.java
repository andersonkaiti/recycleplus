package com.example.recycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RecyclePlus extends AppCompatActivity {

    private Button btnSobreREGER, btnEtapasProjetoREGER, btnCreditos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycleplus);

        btnSobreREGER = findViewById(R.id.btnSobreREGER);
        btnEtapasProjetoREGER = findViewById(R.id.btnEtapasProjetoREGER);
        btnCreditos = findViewById(R.id.btnCreditos);

        btnSobreREGER.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaSobreREGER = new Intent(RecyclePlus.this, SobreProjetoReger.class);
                startActivity(telaSobreREGER);
            }
        });

        btnEtapasProjetoREGER.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaEtapasProjetoREGER = new Intent(RecyclePlus.this, EtapasProjetoREGER.class);
                startActivity(telaEtapasProjetoREGER);
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
}