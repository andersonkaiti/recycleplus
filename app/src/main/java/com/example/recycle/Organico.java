package com.example.recycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Organico extends AppCompatActivity {

    int[] cardIds = {
            R.id.residuoAlimentar,
            R.id.residuoJardinagem,
            R.id.poCafeCoador,
            R.id.saquinhoCha,
            R.id.jornal
    };

    CardView[] cards = new CardView[cardIds.length];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organico);

        Toolbar toolbar = findViewById(R.id.toolbarOrganico);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        for (int i = 0; i < cardIds.length; i++) {
            cards[i] = findViewById(cardIds[i]);
            cards[i].setOnClickListener(new Organico.OrganicoClickListener());
        }
    }

    public class OrganicoClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent;
            switch (v.getId()) {
                case R.id.residuoAlimentar:
                    intent = new Intent(v.getContext(), ResiduoAlimentar.class);
                    break;
                case R.id.residuoJardinagem:
                    intent = new Intent(v.getContext(), ResiduoJardinagem.class);
                    break;
                case R.id.poCafeCoador:
                    intent = new Intent(v.getContext(), PoCafeCoador.class);
                    break;
                case R.id.saquinhoCha:
                    intent = new Intent(v.getContext(), SaquinhoCha.class);
                    break;
                case R.id.jornal:
                    intent = new Intent(v.getContext(), Jornal.class);
                    break;
                default:
                    intent = new Intent(v.getContext(), TelaInformativa.class);
            }
            v.getContext().startActivity(intent);
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==android.R.id.home) {
            finish();
        }
        return super.onContextItemSelected(item);
    }
}