package br.usjt.deswebmob.pipoca_mobile;


import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Renan Gouveia
 * RA: 816114946
 */

public class ListarFilmesActivity extends AppCompatActivity {

    public static final String FILME = "br.usjt.deswebmob.pipoca_mobile.filme";
    Activity atividade;
    ArrayList<Filme> filmes;
    ArrayList<String> nomes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_filmes);
        atividade = this;
        Intent intent = getIntent();
        String generos = intent.getStringExtra(MainActivity.CHAVE);
        filmes = Catalogo.listarFilmes(generos);
        //nomes = Catalogo.listarNomes(filmes);

        /*
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, nomes);
        */

        ListView listView = (ListView) findViewById(R.id.lista_filmes);

        FilmeAdapter adapter = new FilmeAdapter(this, filmes);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // manda para a tela de detalhe
                Intent intent = new Intent(atividade, DetalheFilmeActivity.class);
                intent.putExtra(FILME, filmes.get(position));

                startActivity(intent);

            }

        });
    }
}

