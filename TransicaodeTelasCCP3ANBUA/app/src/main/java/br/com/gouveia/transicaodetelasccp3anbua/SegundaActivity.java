package br.com.gouveia.transicaodetelasccp3anbua;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ciclodevida", "SegundaActivity:onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ciclodevida", "SegundaActivity:onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ciclodevida", "SegundaActivity:onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ciclodevida", "SegundaActivity:onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ciclodevida", "SegundaActivity:onStart");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("ciclodevida", "SegundaActivity:onCreate");
        setContentView(R.layout.activity_segunda);
        Intent intent = getIntent();
        String mensagem  =
                intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(mensagem);
        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
        layout.addView(textView);
    }
}
