package com.example.recycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Referencias extends AppCompatActivity {

    private CardView cardLogo, cardTelas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_referencias);

        Toolbar toolbar = findViewById(R.id.toolbar4);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        cardLogo = findViewById(R.id.cardLogo);
        cardTelas = findViewById(R.id.cardTelas);

        cardLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://br.freepik.com/vetores-gratis/sinal-de-reciclagem-verde-ao-redor-da-terra_37408976.htm#query=logo%20reciclagem%20sem%20fundo&;position=16&;from_view=search&;track=ais";
                Intent linkLogo = new Intent(Intent.ACTION_VIEW);
                linkLogo.setData(Uri.parse(url));
                startActivity(linkLogo);
            }
        });

        cardTelas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://storyset.com/people";
                Intent linkImagens = new Intent(Intent.ACTION_VIEW);
                linkImagens.setData(Uri.parse(url));
                startActivity(linkImagens);
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