package com.example.azahara.calculadoradedivisas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);

        Bundle bundle = this.getIntent().getExtras();
        final String moneda = bundle.getString("Moneda");

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                double divisa = 0;
                double resultado = 0;
                EditText text = (EditText) findViewById(R.id.editText);


                switch (moneda){
                    case "USD":
                        divisa=1.0943;break;
                    case "JPY":
                        divisa=132.97;break;
                    case "BGN":
                        divisa=1.95558;break;
                    case "CZK":
                        divisa=27.021;break;
                    case "DKK":
                        divisa=7.4609;break;
                    case "GBP":
                        divisa=0.72350;break;
                    case "HUF":
                        divisa=316.61;break;
                    case "PLN":
                        divisa=4.3389;break;
                    case "RON":
                        divisa=4.5030;break;
                    case "SEK":
                        divisa=9.2761;break;
                    case "CHF":
                        divisa=1.0806;break;
                    case "NOK":
                        divisa=9.4370;break;
                }
                TextView res = (TextView) findViewById(R.id.textViewResultado);

                try {
                    double euros = Double.parseDouble(text.getText().toString());
                    resultado = euros * divisa;
                    resultado *=100;
                    resultado = Math.round(resultado);
                    resultado = resultado/100;
                    res.setText(resultado+" "+moneda);
                }catch (Exception e){
                    res.setText("ERROR: Divisa demasiado grande.");
                }


            }
        });
    }
}
