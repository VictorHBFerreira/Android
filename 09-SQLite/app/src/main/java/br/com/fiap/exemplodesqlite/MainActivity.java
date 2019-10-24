package br.com.fiap.exemplodesqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lstClientes;
    List<Cliente> clientes;
    MeuDB meuDB;
    ArrayAdapter<Cliente> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        meuDB = new MeuDB(this);

        lstClientes = findViewById(R.id.lstClientes);
        lstClientes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Cliente cliente = clientes.get(position);

                Intent it = new Intent(MainActivity.this,
                                                    FormClientActivity.class);
                it.putExtra("cliente", cliente);

                startActivity(it);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        clientes = meuDB.buscarTodos();

        adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, clientes);

        lstClientes.setAdapter(adapter);
    }

    public void inserir(View view) {
        Intent it = new Intent(this, FormClientActivity.class);
        startActivity(it);
    }
}
