package com.example.recycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class EtapasProjetoREGER extends AppCompatActivity {

    private Button btnEtapaUm, btnEtapaDois, btnEtapaTres, btnEtapaQuatro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etapas_projeto_reger);

        btnEtapaUm = findViewById(R.id.btnEtapaUm);
        btnEtapaDois = findViewById(R.id.btnEtapaDois);
        btnEtapaTres = findViewById(R.id.btnEtapaTres);
        btnEtapaQuatro = findViewById(R.id.btnEtapaQuatro);


        btnEtapaUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaPapel = new Intent(EtapasProjetoREGER.this, EtapaUm.class);
                startActivity(telaPapel);
            }
        });

        btnEtapaDois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaPlastico = new Intent(EtapasProjetoREGER.this, EtapaDois.class);
                startActivity(telaPlastico);
            }
        });

        btnEtapaTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaVidro = new Intent(EtapasProjetoREGER.this, EtapaTres.class);
                startActivity(telaVidro);
            }
        });

        btnEtapaQuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaMetal = new Intent(EtapasProjetoREGER.this, EtapaQuatro.class);
                startActivity(telaMetal);
            }
        });

    }
}