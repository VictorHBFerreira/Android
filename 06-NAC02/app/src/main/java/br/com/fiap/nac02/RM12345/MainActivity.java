package br.com.fiap.nac02.RM12345;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rdgOpcoes;
    EditText edtMedida;
    CheckBox chkFrete;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdgOpcoes = findViewById(R.id.rdgOpcoes);
        edtMedida = findViewById(R.id.edtMedida);
        chkFrete  = findViewById(R.id.chkFrete);
        txtResultado = findViewById(R.id.txtResultado);
    }

    public void calcular(View view) {
        String medida = edtMedida.getText().toString();
        if ( medida.trim().equals("") ) {
            Toast.makeText(this, R.string.informe_corretamente, Toast.LENGTH_SHORT).show();
            return;
        }

        Double m2 = 0D;

        try {
             m2 = Double.parseDouble(medida);
        } catch (Exception e) {
            Toast.makeText(this, R.string.informe_corretamente, Toast.LENGTH_SHORT).show();
            return;
        }

        int selecionado = rdgOpcoes.getCheckedRadioButtonId();

        double valor = 0;

        switch (selecionado) {
            case R.id.rdbPisoBranco:
                valor = 24.9;
                break;
            case R.id.rdbPisoAlbania:
                valor = 11.9;
                break;
            case R.id.rdbPorcelanato:
                valor = 39.9;
                break;
            case R.id.rdbRevestimento:
                valor = 16.9;
                break;
        }

        valor *= m2;

        if ( chkFrete.isChecked() ) {
            valor *= 1.3;
        }

        txtResultado.setText( String.format("R$ %.2f", valor));
    }
}
