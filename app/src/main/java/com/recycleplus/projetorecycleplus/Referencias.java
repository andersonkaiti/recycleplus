package com.recycleplus.projetorecycleplus;

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
        ToolbarUtil.setupToolbar(this, toolbar);

        int[] cardIds = {
                R.id.cardREGER,
                R.id.cardLogo,
                R.id.cardImagensTelas,
                R.id.cardLixoToxico,
                R.id.cardLata,
                R.id.cardClipeGrampo,
                R.id.cardRecipienteAluminioSemResiduo,
                R.id.cardGarrafasPlastico,
                R.id.cardIsopor,
                R.id.cardEmbalagens,
                R.id.cardCaneta,
                R.id.cardGarrafasVidro,
                R.id.cardAdesivo,
                R.id.cardPapelHigienico,
                R.id.cardEmbalagensResiduos,
                R.id.cardGuardanaposUsados,
                R.id.cardEspelho,
                R.id.cardAcrilico,
                R.id.cardLoucas,
                R.id.cardResiduosAlimentares,
                R.id.cardResiduosJardinagem,
                R.id.cardPoCafeCoador,
                R.id.cardSaquinhosCha,
                R.id.cardJornal,
                R.id.cardLixoToxicoText1,
                R.id.cardLixoToxicoText2,
                R.id.cardReciclagem1,
                R.id.cardReciclagem2,
                R.id.cardReciclagem3,
                R.id.cardReciclagem4,
                R.id.cardReciclagem5,
                R.id.cardReciclagem6
        };

        String[] urls = {
                // Projeto REGER
                "https://unisagrado.edu.br/projetos/reger-reducao-na-geracao-de-residuos",

                // https://www.flaticon.com/br/icone-gratis/sinal-de-reciclagem_4511039?term=reciclagem&page=2&position=5&origin=search&related_id=4511039
                "https://www.flaticon.com/br/icones-gratis/reuso",

                // https://storyset.com/illustration/waste-management/cuate
                // https://storyset.com/illustration/waste-management/pana
                "https://storyset.com/people",

                // https://www.flaticon.com/br/icone-gratis/lixo-toxico_8372000?term=lixo+tóxico&page=1&position=22&origin=search&related_id=8372000
                "https://www.flaticon.com/br/icones-gratis/lixo-biomedico",

                // https://www.flaticon.com/free-icon/beer-can_95982?term=can&page=1&position=3&origin=search&related_id=95982
                "https://www.flaticon.com/free-icons/beer-can",

                // https://www.flaticon.com/free-icon/clip_32256?term=clip&page=1&position=69&origin=search&related_id=32256
                "https://www.flaticon.com/free-icons/clip-outline",

                // https://www.flaticon.com/br/icone-gratis/papel-de-aluminio_4038684?term=alumínio&related_id=4038684
                "https://www.flaticon.com/br/icones-gratis/frustrar",

                // https://www.flaticon.com/br/icone-gratis/plastico_1996869?term=plástico&page=1&position=2&origin=search&related_id=1996869
                "https://www.flaticon.com/br/icones-gratis/plastico",

                // https://www.flaticon.com/br/icone-gratis/recipiente-de-comida_3765881?term=isopor&page=1&position=4&origin=search&related_id=3765881
                "https://www.flaticon.com/br/icones-gratis/isopor",

                // https://www.flaticon.com/br/icone-gratis/salgadinhos_3368162?term=salgadinho&page=1&position=1&origin=search&related_id=3368162
                "https://www.flaticon.com/br/icones-gratis/salgadinhos",

                // https://www.flaticon.com/br/icone-gratis/caneta_6000244?term=caneta&related_id=6000244
                "https://www.flaticon.com/br/icones-gratis/lapis",

                // https://www.flaticon.com/br/icone-gratis/garrafas-de-vinho_3437503?term=vidro&page=1&position=6&origin=search&related_id=3437503
                "https://www.flaticon.com/br/icones-gratis/garrafa",

                // https://www.flaticon.com/br/icone-gratis/adesivo_6734443?term=adesivo&page=1&position=10&origin=search&related_id=6734443
                "https://www.flaticon.com/br/icones-gratis/adesivo",

                // https://www.flaticon.com/br/icone-gratis/papel-higienico_293787?term=papel+higiênico&related_id=293787
                "https://www.flaticon.com/br/icones-gratis/papel-higienico",

                // https://www.flaticon.com/free-icon/leftover_6608240
                "https://www.flaticon.com/free-icons/leftover",

                // https://www.flaticon.com/br/icone-gratis/caixa-de-tecido_3170490?term=guardanapo&page=1&position=2&origin=search&related_id=3170490
                "https://www.flaticon.com/br/icones-gratis/papel-higienico",

                // https://www.flaticon.com/br/icone-gratis/espelho_3124756?term=espelho&page=1&position=1&origin=search&related_id=3124756
                "https://www.flaticon.com/br/icones-gratis/espelho",

                // https://www.flaticon.com/br/icone-gratis/vidro_1173937?term=janela&page=1&position=21&origin=search&related_id=1173937
                "https://www.flaticon.com/br/icones-gratis/janela",

                // https://www.flaticon.com/br/icone-gratis/louca_2434997?term=louças&page=1&position=7&origin=search&related_id=2434997
                "https://www.flaticon.com/br/icones-gratis/louca",

                // https://www.flaticon.com/br/icone-gratis/maca_3320348?term=maçã&page=1&position=40&origin=search&related_id=3320348
                "https://www.flaticon.com/br/icones-gratis/maca-mordida",

                // https://www.flaticon.com/br/icone-gratis/jardinagem_1518863?term=jardinagem&page=1&position=1&origin=search&related_id=1518863
                "https://www.flaticon.com/br/icones-gratis/areia",

                // https://www.flaticon.com/br/icone-gratis/coffee-break_2936937?term=coffee&page=1&position=6&origin=search&related_id=2936937
                "https://www.flaticon.com/br/icones-gratis/cafeteria",

                // https://www.flaticon.com/br/icone-gratis/tea-cup_1807582?term=tea&page=1&position=5&origin=search&related_id=1807582
                "https://www.flaticon.com/br/icones-gratis/xicara-de-cha",

                // https://www.flaticon.com/br/icone-gratis/jornal_3208799?term=jornal&page=1&position=5&origin=search&related_id=3208799
                "https://www.flaticon.com/br/icones-gratis/jornal",

                "https://brinstrument.com/fractional-distillation/general-solvent-recycling?gclid=Cj0KCQjw0tKiBhC6ARIsAAOXutns7WEiVbe76gWnKYIlEqGjaJk0JAS8VdTadifLMUtNvOifPBGn3lQaAkYeEALw_wcB",

                "https://a-otc.com/hazardous-waste-disposal-methods/",

                "https://portais.univasf.edu.br/sustentabilidade/noticias-sustentaveis/onde-reciclar-latas-de-aluminio",

                "https://www.reciclasampa.com.br",

                "https://portais.univasf.edu.br/sustentabilidade/noticias-sustentaveis/qual-e-o-processo-de-reciclagem-do-metal",

                "https://web.bndes.gov.br/bib/jspui/handle/1408/3684",

                "https://www.brightmark.com/make-your-mark/learn-how-to-recycle-right?gclid=Cj0KCQjw0tKiBhC6ARIsAAOXutmgFnJ0qUZE8FJeRZwAFqHoeEWuuqiuMlT-AASWq2BkA-KZXewdl2MaAoLkEALw_wcB",

                "https://www.sciencedirect.com/science/article/abs/pii/B9780123964595000143"
        };

        CardView[] cards = new CardView[cardIds.length];
        for (int i = 0; i < cardIds.length; i++) {
            cards[i] = findViewById(cardIds[i]);
            String url = urls[i];
            cards[i].setOnClickListener(new RecycleClickListener(url));
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public class RecycleClickListener implements View.OnClickListener {
        private String url;

        public RecycleClickListener(String url) {
            this.url = url;
        }

        @Override
        public void onClick(View v) {
            Intent link = new Intent(Intent.ACTION_VIEW);
            link.setData(Uri.parse(url));
            v.getContext().startActivity(link);
        }
    }
}