package com.example.recycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MateriaisReciclaveis extends AppCompatActivity {

    private Button btnTiposMateriaisReciclaveis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materiais_reciclaveis);

        btnTiposMateriaisReciclaveis = findViewById(R.id.btnTiposMateriaisReciclaveis);

        btnTiposMateriaisReciclaveis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent primeiratela = new Intent(MateriaisReciclaveis.this,TiposMateriaisReciclaveis.class);
                startActivity(primeiratela);
            }
        });
    }
}