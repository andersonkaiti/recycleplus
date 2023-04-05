package com.example.recycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SobreProjetoReger extends AppCompatActivity {

    private Button btnEtapasProjetoREGER;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre_projeto_reger);

        btnEtapasProjetoREGER = findViewById(R.id.btnEtapasProjetoREGER);

        btnEtapasProjetoREGER.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaEtapasProjetoREGER = new Intent(SobreProjetoReger.this, EtapasProjetoREGER.class);
                startActivity(telaEtapasProjetoREGER);
            }
        });
    }
}