package com.example.recycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RecyclePlus extends AppCompatActivity {

    private Button btnMateriaisReciclaveis, btnQuiz, btnCreditos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycleplus);

        btnMateriaisReciclaveis = findViewById(R.id.btnMateriaisReciclaveis);
        btnQuiz = findViewById(R.id.btnQuiz);
        btnCreditos = findViewById(R.id.btnCreditos);

        btnMateriaisReciclaveis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaMateriaisReciclaveis = new Intent(RecyclePlus.this, MateriaisReciclaveis.class);
                startActivity(telaMateriaisReciclaveis);
            }
        });

        btnQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaQuiz = new Intent(RecyclePlus.this, Quiz.class);
                startActivity(telaQuiz);
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