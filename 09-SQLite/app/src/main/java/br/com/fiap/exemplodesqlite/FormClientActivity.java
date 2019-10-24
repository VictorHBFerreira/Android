package br.com.fiap.exemplodesqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormClientActivity extends AppCompatActivity {

    EditText edtNome;
    EditText edtEmail;
    MeuDB meuDB;
    Cliente cliente;
    Button btnExcluir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_client);

        meuDB = new MeuDB(this);

        edtNome  = findViewById(R.id.edtNome);
        edtEmail = findViewById(R.id.edtEmail);
        btnExcluir = findViewById(R.id.btnExcluir);

        Bundle extras = getIntent().getExtras();
        if ( extras != null ) {
             cliente = (Cliente)extras.get("cliente");
             if ( cliente != null ) {
                 edtNome.setText( cliente.getNome() );
                 edtEmail.setText( cliente.getEmail() );

                 btnExcluir.setVisibility(View.VISIBLE);
             }
        }
    }

    public void salvar(View view) {
        String nome  = edtNome.getText().toString();
        String email = edtEmail.getText().toString();

        if ( cliente == null ) {
            cliente = new Cliente(nome, email);
            meuDB.inserir(cliente);
        } else {
            cliente.setNome( nome );
            cliente.setEmail( email );

            meuDB.atualizar(cliente);
        }

        Toast.makeText(this, R.string.salvo_sucesso, Toast.LENGTH_SHORT).show();

        finish();
    }

    public void excluir(View view) {
        meuDB.excluir( cliente.getId() );

        Toast.makeText(this, R.string.excluido_com_sucesso, Toast.LENGTH_SHORT).show();

        finish();
    }
}
