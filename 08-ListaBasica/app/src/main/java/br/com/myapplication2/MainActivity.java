package br.com.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Contato> contatos;
    ListView lstContatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contatos = GeraContatos.geraContatos();
        lstContatos = (ListView) findViewById(R.id.lstContatos);
        ContatosAdapter contatosAdapter = new ContatosAdapter(this, contatos);
        lstContatos.setAdapter(contatosAdapter);
    }

}
