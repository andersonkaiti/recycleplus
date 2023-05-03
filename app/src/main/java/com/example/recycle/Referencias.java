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

public class Referencias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_referencias);

        Toolbar toolbar = findViewById(R.id.toolbarReferencias);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        CardView cardLogo = findViewById(R.id.cardLogo);
        CardView cardImagensTelas = findViewById(R.id.cardImagensTelas);
        CardView cardLata = findViewById(R.id.cardLata);
        CardView cardClipeGrampo = findViewById(R.id.cardClipeGrampo);
        CardView cardRecipienteAluminioSemResiduo = findViewById(R.id.cardRecipienteAluminioSemResiduo);
        CardView cardGarrafasPlastico = findViewById(R.id.cardGarrafasPlastico);
        CardView cardIsopor = findViewById(R.id.cardIsopor);
        CardView cardEmbalagens = findViewById(R.id.cardEmbalagens);
        CardView cardCaneta = findViewById(R.id.cardCaneta);
        CardView cardGarrafasVidro = findViewById(R.id.cardGarrafasVidro);
        CardView cardAdesivo = findViewById(R.id.cardAdesivo);
        CardView cardPapelHigienico = findViewById(R.id.cardPapelHigienico);
        CardView cardEmbalagensResiduos = findViewById(R.id.cardEmbalagensResiduos);
        CardView cardGuardanaposUsados = findViewById(R.id.cardGuardanaposUsados);
        CardView cardEspelho = findViewById(R.id.cardEspelho);
        CardView cardAcrilico = findViewById(R.id.cardAcrilico);
        CardView cardLoucas = findViewById(R.id.cardLoucas);
        CardView cardResiduosAlimentares = findViewById(R.id.cardResiduosAlimentares);
        CardView cardResiduosJardinagem = findViewById(R.id.cardResiduosJardinagem);
        CardView cardPoCafeCoador = findViewById(R.id.cardPoCafeCoador);
        CardView cardSaquinhosCha = findViewById(R.id.cardSaquinhosCha);
        CardView cardJornal = findViewById(R.id.cardJornal);

        cardLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // https://www.flaticon.com/br/icone-gratis/sinal-de-reciclagem_4511039?term=reciclagem&page=2&position=5&origin=search&related_id=4511039
                String url = "https://www.flaticon.com/br/icones-gratis/reuso";
                Intent linkLogo = new Intent(Intent.ACTION_VIEW);
                linkLogo.setData(Uri.parse(url));
                startActivity(linkLogo);
            }
        });

        cardImagensTelas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // https://storyset.com/illustration/waste-management/cuate
                // https://storyset.com/illustration/waste-management/pana
                String url = "https://storyset.com/people";
                Intent linkImagensTelas = new Intent(Intent.ACTION_VIEW);
                linkImagensTelas.setData(Uri.parse(url));
                startActivity(linkImagensTelas);
            }
        });

        cardLata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // https://www.flaticon.com/free-icon/beer-can_95982?term=can&page=1&position=3&origin=search&related_id=95982
                String url = "https://www.flaticon.com/free-icons/beer-can";
                Intent linkLata = new Intent(Intent.ACTION_VIEW);
                linkLata.setData(Uri.parse(url));
                startActivity(linkLata);
            }
        });

        cardClipeGrampo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // https://www.flaticon.com/free-icon/clip_32256?term=clip&page=1&position=69&origin=search&related_id=32256
                String url = "https://www.flaticon.com/free-icons/clip-outline";
                Intent linkClipeGrampo = new Intent(Intent.ACTION_VIEW);
                linkClipeGrampo.setData(Uri.parse(url));
                startActivity(linkClipeGrampo);
            }
        });

        cardRecipienteAluminioSemResiduo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // https://www.flaticon.com/br/icone-gratis/papel-de-aluminio_4038684?term=alumínio&related_id=4038684
                String url = "https://www.flaticon.com/br/icones-gratis/frustrar";
                Intent linkRecipienteAluminioSemResiduo = new Intent(Intent.ACTION_VIEW);
                linkRecipienteAluminioSemResiduo.setData(Uri.parse(url));
                startActivity(linkRecipienteAluminioSemResiduo);
            }
        });

        cardGarrafasPlastico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // https://www.flaticon.com/br/icone-gratis/plastico_1996869?term=plástico&page=1&position=2&origin=search&related_id=1996869
                String url = "https://www.flaticon.com/br/icones-gratis/plastico";
                Intent linkGarrafasPlastico = new Intent(Intent.ACTION_VIEW);
                linkGarrafasPlastico.setData(Uri.parse(url));
                startActivity(linkGarrafasPlastico);
            }
        });

        cardIsopor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // https://www.flaticon.com/br/icone-gratis/recipiente-de-comida_3765881?term=isopor&page=1&position=4&origin=search&related_id=3765881
                String url = "https://www.flaticon.com/br/icones-gratis/isopor";
                Intent linkIsopor = new Intent(Intent.ACTION_VIEW);
                linkIsopor.setData(Uri.parse(url));
                startActivity(linkIsopor);
            }
        });

        cardEmbalagens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // https://www.flaticon.com/br/icone-gratis/salgadinhos_3368162?term=salgadinho&page=1&position=1&origin=search&related_id=3368162
                String url = "https://www.flaticon.com/br/icones-gratis/salgadinhos";
                Intent linkEmbalagens = new Intent(Intent.ACTION_VIEW);
                linkEmbalagens.setData(Uri.parse(url));
                startActivity(linkEmbalagens);
            }
        });

        cardCaneta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // https://www.flaticon.com/br/icone-gratis/caneta_6000244?term=caneta&related_id=6000244
                String url = "https://www.flaticon.com/br/icones-gratis/lapis";
                Intent linkCaneta = new Intent(Intent.ACTION_VIEW);
                linkCaneta.setData(Uri.parse(url));
                startActivity(linkCaneta);
            }
        });

        cardGarrafasVidro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // https://www.flaticon.com/br/icone-gratis/garrafas-de-vinho_3437503?term=vidro&page=1&position=6&origin=search&related_id=3437503
                String url = "https://www.flaticon.com/br/icones-gratis/garrafa";
                Intent linkGarrafasVidro = new Intent(Intent.ACTION_VIEW);
                linkGarrafasVidro.setData(Uri.parse(url));
                startActivity(linkGarrafasVidro);
            }
        });

        cardAdesivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // https://www.flaticon.com/br/icone-gratis/adesivo_6734443?term=adesivo&page=1&position=10&origin=search&related_id=6734443
                String url = "https://www.flaticon.com/br/icones-gratis/adesivo";
                Intent linkAdesivo = new Intent(Intent.ACTION_VIEW);
                linkAdesivo.setData(Uri.parse(url));
                startActivity(linkAdesivo);
            }
        });

        cardPapelHigienico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // https://www.flaticon.com/br/icone-gratis/papel-higienico_293787?term=papel+higiênico&related_id=293787
                String url = "https://www.flaticon.com/br/icones-gratis/papel-higienico";
                Intent linkPapelHigienico = new Intent(Intent.ACTION_VIEW);
                linkPapelHigienico.setData(Uri.parse(url));
                startActivity(linkPapelHigienico);
            }
        });

        cardGuardanaposUsados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // https://www.flaticon.com/br/icone-gratis/caixa-de-tecido_3170490?term=guardanapo&page=1&position=2&origin=search&related_id=3170490
                String url = "https://www.flaticon.com/br/icones-gratis/papel-higienico";
                Intent linkGuardanaposUsados = new Intent(Intent.ACTION_VIEW);
                linkGuardanaposUsados.setData(Uri.parse(url));
                startActivity(linkGuardanaposUsados);
            }
        });

        cardEspelho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // https://www.flaticon.com/br/icone-gratis/espelho_3124756?term=espelho&page=1&position=1&origin=search&related_id=3124756
                String url = "https://www.flaticon.com/br/icones-gratis/espelho";
                Intent linkEspelho = new Intent(Intent.ACTION_VIEW);
                linkEspelho.setData(Uri.parse(url));
                startActivity(linkEspelho);
            }
        });

        cardAcrilico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // https://www.flaticon.com/br/icone-gratis/vidro_1173937?term=janela&page=1&position=21&origin=search&related_id=1173937
                String url = "https://www.flaticon.com/br/icones-gratis/janela";
                Intent linkAcrilico = new Intent(Intent.ACTION_VIEW);
                linkAcrilico.setData(Uri.parse(url));
                startActivity(linkAcrilico);
            }
        });

        cardLoucas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // https://www.flaticon.com/br/icone-gratis/louca_2434997?term=louças&page=1&position=7&origin=search&related_id=2434997
                String url = "https://www.flaticon.com/br/icones-gratis/louca";
                Intent linkLoucas = new Intent(Intent.ACTION_VIEW);
                linkLoucas.setData(Uri.parse(url));
                startActivity(linkLoucas);
            }
        });

        cardResiduosAlimentares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // https://www.flaticon.com/br/icone-gratis/maca_3320348?term=maçã&page=1&position=40&origin=search&related_id=3320348
                String url = "https://www.flaticon.com/br/icones-gratis/maca-mordida";
                Intent linkResiduosAlimentares = new Intent(Intent.ACTION_VIEW);
                linkResiduosAlimentares.setData(Uri.parse(url));
                startActivity(linkResiduosAlimentares);
            }
        });

        cardResiduosJardinagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // https://www.flaticon.com/br/icone-gratis/jardinagem_1518863?term=jardinagem&page=1&position=1&origin=search&related_id=1518863
                String url = "https://www.flaticon.com/br/icones-gratis/areia";
                Intent linkResiduosJardinagem = new Intent(Intent.ACTION_VIEW);
                linkResiduosJardinagem.setData(Uri.parse(url));
                startActivity(linkResiduosJardinagem);
            }
        });

        cardPoCafeCoador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // https://www.flaticon.com/br/icone-gratis/coffee-break_2936937?term=coffee&page=1&position=6&origin=search&related_id=2936937
                String url = "https://www.flaticon.com/br/icones-gratis/cafeteria";
                Intent linkPoCafeCoador = new Intent(Intent.ACTION_VIEW);
                linkPoCafeCoador.setData(Uri.parse(url));
                startActivity(linkPoCafeCoador);
            }
        });

        cardSaquinhosCha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // https://www.flaticon.com/br/icone-gratis/tea-cup_1807582?term=tea&page=1&position=5&origin=search&related_id=1807582
                String url = "https://www.flaticon.com/br/icones-gratis/xicara-de-cha";
                Intent linkSaquinhosCha = new Intent(Intent.ACTION_VIEW);
                linkSaquinhosCha.setData(Uri.parse(url));
                startActivity(linkSaquinhosCha);
            }
        });

        cardJornal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // https://www.flaticon.com/br/icone-gratis/jornal_3208799?term=jornal&page=1&position=5&origin=search&related_id=3208799
                String url = "https://www.flaticon.com/br/icones-gratis/jornal";
                Intent linkJornal = new Intent(Intent.ACTION_VIEW);
                linkJornal.setData(Uri.parse(url));
                startActivity(linkJornal);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}