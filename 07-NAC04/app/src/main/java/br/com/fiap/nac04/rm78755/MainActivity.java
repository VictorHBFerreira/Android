package br.com.fiap.nac04.rm78755;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    CheckBox chkMadeira;
    CheckBox chkPiso;
    CheckBox chkTijolo;
    CheckBox chkCabo;
    CheckBox chkColuna;
    CheckBox chkFrete;
    EditText edtM2;
    TextView txtTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkMadeira = findViewById(R.id.chkMadeira);
        chkPiso = findViewById(R.id.chkPisoAlbania);
        chkTijolo = findViewById(R.id.chkTijolo);
        chkCabo = findViewById(R.id.chkCaboDeRede);
        chkColuna = findViewById(R.id.chkColunaRomana);
        chkFrete = findViewById(R.id.chkFrete);
        edtM2 = findViewById(R.id.edtM2);
        txtTotal = findViewById(R.id.txtTotal);

    }

    public void calcular(View view) {

        double valor = 0;
        String medida = edtM2.getText().toString();
        double m2 = Double.parseDouble(medida);

        if (chkMadeira.isChecked()){
            valor += 10;
        }
        if (chkPiso.isChecked()){
            valor += 20;
        }
        if (chkTijolo.isChecked()){
            valor += 30;
        }
        if (chkCabo.isChecked()){
            valor += 40;
        }
        if (chkColuna.isChecked()){
            valor += 50;
        }
        valor *= m2;

        if ( chkFrete.isChecked() ) {
            valor *= 1.44;
        }

        txtTotal.setText(String.format("R$ %.2f", valor));

    }
}
