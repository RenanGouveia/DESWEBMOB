package br.usjt.deswebmob.pipoca_mobile;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

/**
 * Renan Gouveia
 * RA: 816114946
 */

public class MainActivity extends AppCompatActivity {

    Spinner spinnerGenero;
    public static final String CHAVE = "br.usjt.deswebmob.pipoca_mobile.txtGeneros";
    String genero = "Todos";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerGenero = (Spinner)findViewById(R.id.spinnerGenero);
        spinnerGenero.setOnItemSelectedListener(new FilmeSelecionado());

    }

    public void listarFilmes(View view){
        Intent intent = new Intent(this, ListarFilmesActivity.class);
        intent.putExtra(CHAVE, genero);
        startActivity(intent);
    }

    private class FilmeSelecionado implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            genero = (String) parent.getItemAtPosition(position);
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }

}
