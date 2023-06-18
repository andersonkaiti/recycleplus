package com.recycleplus.projetorecycleplus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;

public class Comum extends AppCompatActivity {

    int[] cardIds = {
            R.id.adesivo,
            R.id.papelHigienico,
            R.id.embalagemResiduo,
            R.id.guardanapoUsado,
            R.id.espelhoAmpola,
            R.id.acrilico,
            R.id.louca
    };

    CardView[] cards = new CardView[cardIds.length];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comum_rejeito);

        Toolbar toolbar = findViewById(R.id.toolbarComumRejeito);
        ToolbarUtil.setupToolbar(this, toolbar);

        ScrollView scrollView = findViewById(R.id.scrollViewComumRejeito);
        scrollView.setScrollBarSize(25);

        for (int i = 0; i < cardIds.length; i++) {
            cards[i] = findViewById(cardIds[i]);
            cards[i].setOnClickListener(new Comum.ComumClickListener());
        }
    }

    public class ComumClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent;
            switch (v.getId()) {
                case R.id.adesivo:
                    intent = new Intent(v.getContext(), ProdutosColantes.class);
                    break;
                case R.id.papelHigienico:
                    intent = new Intent(v.getContext(), PapelHigienico.class);
                    break;
                case R.id.embalagemResiduo:
                    intent = new Intent(v.getContext(), EmbalagemResiduo.class);
                    break;
                case R.id.guardanapoUsado:
                    intent = new Intent(v.getContext(), Guardanapo.class);
                    break;
                case R.id.espelhoAmpola:
                    intent = new Intent(v.getContext(), EspelhoAmpolas.class);
                    break;
                case R.id.acrilico:
                    intent = new Intent(v.getContext(), Acrilico.class);
                    break;
                case R.id.louca:
                    intent = new Intent(v.getContext(), Louca.class);
                    break;
                default:
                    intent = new Intent(v.getContext(), Comum.class);
            }
            v.getContext().startActivity(intent);
        }
    }
}