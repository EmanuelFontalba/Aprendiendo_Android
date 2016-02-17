package com.example.azahara.nuevasactividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Actividad2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        TextView mens = (TextView) findViewById(R.id.mensaje);
        Bundle b = this.getIntent().getExtras();
        mens.setText(b.getString("MENSAJE"));
    }
}
