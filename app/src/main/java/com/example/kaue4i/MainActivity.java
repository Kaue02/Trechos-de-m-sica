package com.example.kaue4i;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void caraOuCoroa(View v){
        int number = new Random().nextInt(5);
        ArrayList<String> musica = new ArrayList<>();
        ArrayList<String> titulo = new ArrayList<>();
        musica.add("Nóis, nóis é o terror do Kama Sutra (nóis é o terror do Kama Sutra)\n" +
                "Aquariano nato quebra a cama dessas puta'\n" +
                "Comi sua amiga, me desculpa (comi sua amiga, me desculpa)\n" +
                "BH é pequeno, minhas mulher até anda junta");
        titulo.add("Aquariano Nato");
        musica.add("Eu tentei\n" +
                "Não ser moleque com você, eu tentei\n" +
                "Mas quem não erra em 2023?\n" +
                "'Tava tudo perfeito esse ano\n" +
                "Até tu virar minha ex");
        titulo.add("A Internet É Toxica");
        musica.add("Não dou confiança pra ficante\n" +
                "Mas esqueci de falar pra ela\n" +
                "Que um lance é um lance\n" +
                "Nossa paixão foi muito curta\n" +
                "Ontem eu era o amor da sua vida\n" +
                "Hoje sou um filho da puta\n" +
                "Xingar minha mãe vai ganhar multa\n" +
                "Não vai ter seu homem, nem pedido de desculpa");
        titulo.add("De 10 Mulher 11 É Maluca");
        titulo.add("É o Rei do Sexo");
        musica.add("É o rei do sexo bruto\n" +
                "Na cama, sou seu puto\n" +
                "Tu me pede, eu te chupo\n" +
                "Tu de quatro, eu machuco\n" +
                "Vem com a porra da xereca pronta pro vuco-vuco (vuco-vuco, vuco-vuco)\n" +
                "É o rei do sexo bruto (ai)");
        titulo.add("Amantes da Foda");
        musica.add("Chegou sexta-feira, é dia de torrar malote\n" +
                "Só placo no bolso parecendo um carro forte\n" +
                "Peça na cintura pra qualquer B.O. que der\n" +
                "Mas o que a gente quer mesmo é cachorrada com as mulher");


        TextView tvLetra = findViewById(R.id.letra);
        TextView tvTitulo = findViewById(R.id.titulo);

        tvLetra.setText(musica.get(number));
        tvTitulo.setText(titulo.get(number));

    }

}