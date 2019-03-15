package br.com.fiap.manipulandoimagens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgPessoa = findViewById(R.id.imgPessoa);
    }

    public void pessoa01(View view) {
        imgPessoa.setImageResource(R.drawable.p1);
    }

    public void pessoa02(View view) {
        imgPessoa.setImageResource(R.drawable.p2);
    }

    public void pessoa03(View view) {
        imgPessoa.setImageResource(R.drawable.p3);
    }
}
