package com.example.recycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SobreProjetoReger extends AppCompatActivity {

    private Button btnTiposLixos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre_projeto_reger);

        btnTiposLixos = findViewById(R.id.btnTiposLixos);

        btnTiposLixos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaTiposdeLixos = new Intent(SobreProjetoReger.this, TiposLixos.class);
                startActivity(telaTiposdeLixos);
            }
        });
    }
}