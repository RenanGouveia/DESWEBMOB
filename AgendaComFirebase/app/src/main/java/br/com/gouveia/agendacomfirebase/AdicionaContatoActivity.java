package br.com.gouveia.agendacomfirebase;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AdicionaContatoActivity extends AppCompatActivity {

    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference contatosReference;
    private EditText nomeEditText;
    private EditText emailEditText;
    private EditText foneEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adiciona_contato);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String nome = nomeEditText.getEditableText().toString();

               String fone = foneEditText.getEditableText().toString();

               String email = emailEditText.getEditableText().toString();

               //gerar chave
               String chave = contatosReference.push().getKey();

               //cria um novo contato
               Contato contato =
                       new Contato (chave, nome, fone, email);

               //associa o novo contato à chave
               contatosReference.child(chave).setValue(contato);

                Toast.makeText(AdicionaContatoActivity.this,
                        getString(R.string.contato_adicionado),
                        Toast.LENGTH_SHORT).show();

                finish();
            }
        });

        nomeEditText = findViewById(R.id.nomeEditText);
        foneEditText = findViewById(R.id.foneEditText);
        emailEditText = findViewById(R.id.emailEditText);

        configuraFirebase();
    }

    private void configuraFirebase(){
        firebaseDatabase = FirebaseDatabase.getInstance();
        contatosReference = firebaseDatabase.getReference("contatos");
    }

}
