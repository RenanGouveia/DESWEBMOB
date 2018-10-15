package br.com.renangouveia.pais;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;


/*
    Renan Gouveia Dutra da Silva
    816114946
 */
public class MainActivity extends AppCompatActivity {

    Spinner selecionarContinente;
    public static final String CHAVE = "br.com.renangouveia.pais.txtContinente";
    String continente = "Todos";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        selecionarContinente = (Spinner)findViewById(R.id.spinnerContinente);
        selecionarContinente.setOnItemSelectedListener(new PaisSelecionado());
    }

    public void listarPaises(View view){
        Intent intent = new Intent(this, ListarPaisesActivity.class);

        intent.putExtra(CHAVE, continente);
        startActivity(intent);
    }

    private class PaisSelecionado implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            continente = (String) parent.getItemAtPosition(position);
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }
}
