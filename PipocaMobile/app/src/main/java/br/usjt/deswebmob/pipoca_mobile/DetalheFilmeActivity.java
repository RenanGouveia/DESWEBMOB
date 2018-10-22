package br.usjt.deswebmob.pipoca_mobile;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Renan Gouveia
 * RA: 816114946
 */

public class DetalheFilmeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_filme);
        TextView nome = (TextView)findViewById(R.id.nome);
        TextView descricao = (TextView) findViewById(R.id.descricao);
        TextView diretor = (TextView) findViewById(R.id.diretor);
        TextView dtLancamento = (TextView)findViewById(R.id.dtLancamento);
        TextView popularidade = (TextView) findViewById(R.id.popularidade);

        Intent intent = getIntent();
        Filme filme = (Filme)intent.getSerializableExtra(ListarFilmesActivity.FILME);
        nome.setText(filme.getNome());
        descricao.setText(filme.getGenero());
        diretor.setText(filme.getDiretor());
        dtLancamento.setText(filme.getDtLancamento());
        popularidade.setText(filme.getPopularidade().toString());
    }
}
