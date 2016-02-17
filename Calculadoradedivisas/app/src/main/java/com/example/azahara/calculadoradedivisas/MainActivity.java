package com.example.azahara.calculadoradedivisas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnusd = (Button) findViewById(R.id.buttonUSD);
        btnusd.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalculoActivity.class);
                Bundle b = new Bundle();
                b.putString("Moneda", "USD");

                intent.putExtras(b);
                startActivity(intent);
            }
        });

        Button btnbgn = (Button) findViewById(R.id.buttonBGN);
        btnbgn.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalculoActivity.class);
                Bundle b = new Bundle();
                b.putString("Moneda", "BGN");

                intent.putExtras(b);
                startActivity(intent);
            }
        });

        Button btnchf = (Button) findViewById(R.id.buttonCHF);
        btnchf.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalculoActivity.class);
                Bundle b = new Bundle();
                b.putString("Moneda", "CHF");

                intent.putExtras(b);
                startActivity(intent);
            }
        });

        Button btnczk = (Button) findViewById(R.id.buttonCZK);
        btnczk.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalculoActivity.class);
                Bundle b = new Bundle();
                b.putString("Moneda", "CZK");

                intent.putExtras(b);
                startActivity(intent);
            }
        });

        Button btndkk = (Button) findViewById(R.id.buttonDKK);
        btndkk.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalculoActivity.class);
                Bundle b = new Bundle();
                b.putString("Moneda", "DKK");

                intent.putExtras(b);
                startActivity(intent);
            }
        });

        Button btngbp = (Button) findViewById(R.id.buttonGBP);
        btngbp.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalculoActivity.class);
                Bundle b = new Bundle();
                b.putString("Moneda", "GBP");

                intent.putExtras(b);
                startActivity(intent);
            }
        });

        Button btnhuf = (Button) findViewById(R.id.buttonHUF);
        btnhuf.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalculoActivity.class);
                Bundle b = new Bundle();
                b.putString("Moneda", "HUF");

                intent.putExtras(b);
                startActivity(intent);
            }
        });

        Button btnjpy = (Button) findViewById(R.id.buttonJPY);
        btnjpy.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalculoActivity.class);
                Bundle b = new Bundle();
                b.putString("Moneda", "JPY");

                intent.putExtras(b);
                startActivity(intent);
            }
        });

        Button btnNOK = (Button) findViewById(R.id.buttonNOK);
        btnNOK.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalculoActivity.class);
                Bundle b = new Bundle();
                b.putString("Moneda", "NOK");

                intent.putExtras(b);
                startActivity(intent);
            }
        });

        Button btnpln = (Button) findViewById(R.id.buttonPLN);
        btnpln.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalculoActivity.class);
                Bundle b = new Bundle();
                b.putString("Moneda", "PLN");

                intent.putExtras(b);
                startActivity(intent);
            }
        });

        Button btnron = (Button) findViewById(R.id.buttonRON);
        btnron.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalculoActivity.class);
                Bundle b = new Bundle();
                b.putString("Moneda", "RON");

                intent.putExtras(b);
                startActivity(intent);
            }
        });

        Button btnsek = (Button) findViewById(R.id.buttonSEK);
        btnsek.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalculoActivity.class);
                Bundle b = new Bundle();
                b.putString("Moneda", "SEK");

                intent.putExtras(b);
                startActivity(intent);
            }
        });


    }
}
