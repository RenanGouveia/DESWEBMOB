package br.com.renangouveia.pais;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/*
    Renan Gouveia Dutra da Silva
    816114946
 */

public class ListarPaisesActivity extends AppCompatActivity {

    public static final String PAIS = "br.com.renangouveia.pais";

    Activity atividade;
    ArrayList<Pais> paises;
    ArrayList<String> nomes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_paises);
        atividade = this;
        Intent intent = getIntent();
        String continente = intent.getStringExtra(MainActivity.CHAVE);
        paises = Informacao.listarPaises(continente);
        nomes = Informacao.listarNomes(paises);

        ListView listView = (ListView) findViewById(R.id.lista);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, nomes);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Intent intent = new Intent(atividade, DetalhePaisActivity.class);
                intent.putExtra(PAIS, (Parcelable) paises.get(position));

                startActivity(intent);

            }

        });
    }
}
