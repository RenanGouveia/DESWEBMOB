package br.com.gouveia.transicaodetelasccp3anbua;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "br.com.gouveia.transicaodetelasccp3anbua.MESSAGE";

    private EditText mensagemEditText;

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ciclodevida", "MainActivity:onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ciclodevida", "MainActivity:onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ciclodevida", "MainActivity:onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ciclodevida", "MainActivity:onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ciclodevida", "MainActivity:onStart");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("ciclodevida", "MainActivity:onCreate");

        setContentView(R.layout.activity_main);
        mensagemEditText =
                findViewById(R.id.mensagemEditText);

    }

    public void enviarMensagem(View view) {
        String mensagem =
            mensagemEditText.getEditableText().toString();
            Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, SegundaActivity.class);
            intent.putExtra(EXTRA_MESSAGE, mensagem);
            startActivity(intent);

    }
}
