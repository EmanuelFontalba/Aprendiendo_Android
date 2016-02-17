package com.example.azahara.practicaguiada1;

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

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                TextView vText = (TextView) findViewById(R.id.textView);
                vText.setText("Botón pulsado");
            }
        });

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                TextView vText=(TextView) findViewById(R.id.textView);
                vText.setText("Estado");
            }
        });

    }

}
