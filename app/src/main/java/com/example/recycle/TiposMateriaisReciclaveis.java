package com.example.recycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class TiposMateriaisReciclaveis extends AppCompatActivity {

    private Button btnPapel, btnPlastico, btnVidro, btnMetal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipos_materiais_reciclaveis);

        btnPapel = findViewById(R.id.btnPapel);
        btnPlastico = findViewById(R.id.btnPlastico);
        btnVidro = findViewById(R.id.btnVidro);
        btnMetal = findViewById(R.id.btnMetal);


        btnPapel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaPapel = new Intent(TiposMateriaisReciclaveis.this, Papel.class);
                startActivity(telaPapel);
            }
        });

        btnPlastico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaPlastico = new Intent(TiposMateriaisReciclaveis.this, Plastico.class);
                startActivity(telaPlastico);
            }
        });

        btnVidro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaVidro = new Intent(TiposMateriaisReciclaveis.this, Vidro.class);
                startActivity(telaVidro);
            }
        });

        btnMetal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaMetal = new Intent(TiposMateriaisReciclaveis.this, Metal.class);
                startActivity(telaMetal);
            }
        });

    }
}