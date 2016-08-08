package com.example.wladimir.contador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn, btnR;
    private TextView txt;
    private int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (TextView) findViewById(R.id.txtContador);

        btn = (Button) findViewById(R.id.btnSumar);

        btn.setOnClickListener(new OnClickListener( ) {
            @Override
            public void onClick(View view) {
                contador++;
                txt.setText("Contador: " + contador);
            }

        });

        btnR = (Button) findViewById(R.id.btnRestar);

        btnR.setOnClickListener(new OnClickListener( ) {
            @Override
            public void onClick(View view) {
                contador--;
                txt.setText("Contador: " + contador);
            }

        });
    }
}
