package com.example.wladimir.contador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private TextView txt, txtCiclo;
    private int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        txtCiclo = (TextView) findViewById(R.id.textView);
        txtCiclo.setText("Paso Por el onCreate");
        setContentView(R.layout.activity_main);

        txt = (TextView) findViewById(R.id.txtContador);

        btn = (Button) findViewById(R.id.btnSumar);

        btn.setOnClickListener(new OnClickListener( ) {
            @Override
            public void onClick(View view) {
                contador++;
                txtCiclo.setText("Paso por el onClick");
                txt.setText("Contador: " + contador);
            }

        });

    }
}
