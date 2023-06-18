package com.recycleplus.projetorecycleplus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;

import java.util.Arrays;

public class Reciclavel extends AppCompatActivity {

    int[] cardIds = {
            R.id.latas,
            R.id.clipesGrampos,
            R.id.aluminio,
            R.id.plastico,
            R.id.isopor,
            R.id.embalagens,
            R.id.caneta,
            R.id.vidro
    };

    CardView[] cards = new CardView[cardIds.length];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciclavel);

        Toolbar toolbar = findViewById(R.id.toolbarReciclavel);
        ToolbarUtil.setupToolbar(this, toolbar);

        ScrollView scrollView = findViewById(R.id.scrollViewReciclavel);
        scrollView.setScrollBarSize(25);

        for (int i = 0; i < cardIds.length; i++) {
            cards[i] = findViewById(cardIds[i]);
            cards[i].setOnClickListener(new ReciclavelClickListener());
        }
    }

    public class ReciclavelClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent;
            switch (v.getId()) {
                case R.id.latas:
                    intent = new Intent(v.getContext(), Lata.class);
                    break;
                case R.id.clipesGrampos:
                    intent = new Intent(v.getContext(), ClipesGrampos.class);
                    break;
                case R.id.aluminio:
                    intent = new Intent(v.getContext(), Aluminio.class);
                    break;
                case R.id.plastico:
                    intent = new Intent(v.getContext(), Plastico.class);
                    break;
                case R.id.isopor:
                    intent = new Intent(v.getContext(), Isopor.class);
                    break;
                case R.id.embalagens:
                    intent = new Intent(v.getContext(), Embalagem.class);
                    break;
                case R.id.caneta:
                    intent = new Intent(v.getContext(), TuboCaneta.class);
                    break;
                case R.id.vidro:
                    intent = new Intent(v.getContext(), Vidro.class);
                    break;
                default:
                    intent = new Intent(v.getContext(), Reciclavel.class);
            }
            v.getContext().startActivity(intent);
        }
    }
}