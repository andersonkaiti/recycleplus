package com.example.recycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Creditos extends AppCompatActivity {

    private Button btnReferencias;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);

        btnReferencias = findViewById(R.id.btnReferencias);

        btnReferencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaReferencias = new Intent(Creditos.this, Referencias.class);
                startActivity(telaReferencias);
            }
        });
    }
}