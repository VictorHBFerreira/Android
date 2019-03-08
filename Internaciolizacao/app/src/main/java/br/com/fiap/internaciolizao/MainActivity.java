package br.com.fiap.internaciolizao;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nome, celular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.idNome);
        celular = findViewById(R.id.idCelular);
    }

    public void Salvar(View view) {
        String v_nome = nome.getText().toString();
        String v_celular = celular.getText().toString();
        Toast.makeText(this, getString(R.string.nome)+": "+v_nome+" "+getString(R.string.celular)+
                ": "+v_celular+" "+ getString(R.string.salvo), Toast.LENGTH_LONG).show();
    }
}
