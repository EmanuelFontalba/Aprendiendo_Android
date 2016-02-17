package com.example.azahara.sumadosnumeros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numero1;
    EditText numero2;
    Button sumar;
    TextView resultadoText;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = (EditText) findViewById(R.id.editNumero1);
        numero2 = (EditText) findViewById(R.id.editNumero2);
        sumar = (Button) findViewById(R.id.button);
        resultadoText = (TextView) findViewById(R.id.textView2);
        resultado = (TextView) findViewById(R.id.resultado);

        sumar.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                int sumando1 = Integer.parseInt(numero1.getText().toString());
                int sumando2 = Integer.parseInt(numero2.getText().toString());
                int suma = sumando1 + sumando2;
                resultado.setText("Resultado: "+suma);
                resultadoText.setVisibility(View.VISIBLE);
                resultado.setVisibility(View.VISIBLE);
            }
        });
    }
}
