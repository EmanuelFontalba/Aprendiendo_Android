package com.example.azahara.nuevasactividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.enviar);
        btn.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                TextView mnj = (TextView) findViewById(R.id.textView);
                Intent intent = new Intent(MainActivity.this, Actividad2.class);
                Bundle bundle = new Bundle();
                bundle.putString("MENSAJE",mnj.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
