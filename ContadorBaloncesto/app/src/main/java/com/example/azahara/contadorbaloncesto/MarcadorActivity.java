package com.example.azahara.contadorbaloncesto;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MarcadorActivity extends AppCompatActivity {

    public Equipo local= new Equipo();
    public Equipo visitante = new Equipo();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marcador);

        TextView localName = (TextView) findViewById(R.id.textViewLocal);
        TextView visitName = (TextView) findViewById(R.id.textViewVisitante);
        Bundle bundle = this.getIntent().getExtras();
        localName.setText(bundle.getString("NameLocal"));
        visitName.setText(bundle.getString("NameVisit"));

        Button boton3Local = (Button) findViewById(R.id.boton3Local);
        boton3Local.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                local.triple();
                TextView marcadorLocal = (TextView) findViewById(R.id.resultadoLocal);
                String resultado = "" + local.getResultado();
                marcadorLocal.setText(resultado);
            }
        });

        Button boton2Local = (Button) findViewById(R.id.boton2Local);
        boton2Local.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                local.doble();
                TextView marcadorLocal = (TextView) findViewById(R.id.resultadoLocal);
                String resultado = "" + local.getResultado();
                marcadorLocal.setText(resultado);
            }
        });

        Button boton1Local = (Button) findViewById(R.id.boton1Local);
        boton1Local.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                local.uno();
                TextView marcadorLocal = (TextView) findViewById(R.id.resultadoLocal);
                String resultado = "" + local.getResultado();
                marcadorLocal.setText(resultado);
            }
        });

        Button boton3Visitante = (Button) findViewById(R.id.boton3Visitante);
        boton3Visitante.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                visitante.triple();
                TextView marcadorVisitante = (TextView) findViewById(R.id.resultadoVisitante);
                String resultado = "" + visitante.getResultado();
                marcadorVisitante.setText(resultado);
            }
        });

        Button boton2Visitante = (Button) findViewById(R.id.boton2Visitante);
        boton2Visitante.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                visitante.doble();
                TextView marcadorVisitante = (TextView) findViewById(R.id.resultadoVisitante);
                String resultado = "" + visitante.getResultado();
                marcadorVisitante.setText(resultado);
            }
        });

        Button boton1Visitante = (Button) findViewById(R.id.boton1Visitante);
        boton1Visitante.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                visitante.uno();
                TextView marcadorVisitante = (TextView) findViewById(R.id.resultadoVisitante);
                String resultado = "" + visitante.getResultado();
                marcadorVisitante.setText(resultado);
            }
        });

        Button menosVisitante = (Button) findViewById(R.id.menosVisitante);
        menosVisitante.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                visitante.menosUno();
                TextView marcadorVisitante = (TextView) findViewById(R.id.resultadoVisitante);
                String resultado = "" + visitante.getResultado();
                marcadorVisitante.setText(resultado);
            }
        });

        Button masVisitante = (Button) findViewById(R.id.masVisitante);
        masVisitante.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                visitante.masUno();
                TextView marcadorVisitante = (TextView) findViewById(R.id.resultadoVisitante);
                String resultado = "" + visitante.getResultado();
                marcadorVisitante.setText(resultado);
            }
        });

        Button menosLocal = (Button) findViewById(R.id.menosLocal);
        menosLocal.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                local.menosUno();
                TextView marcadorLocal = (TextView) findViewById(R.id.resultadoLocal);
                String resultado = "" + local.getResultado();
                marcadorLocal.setText(resultado);
            }
        });

        Button masLocal = (Button) findViewById(R.id.masLocal);
        masLocal.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                local.masUno();
                TextView marcadorLocal = (TextView) findViewById(R.id.resultadoLocal);
                String resultado = "" + local.getResultado();
                marcadorLocal.setText(resultado);
            }
        });
    }
}
