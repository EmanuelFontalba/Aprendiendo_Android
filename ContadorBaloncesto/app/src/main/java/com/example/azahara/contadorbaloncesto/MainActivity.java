package com.example.azahara.contadorbaloncesto;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                EditText localName = (EditText) findViewById(R.id.editText);
                EditText visitanteName = (EditText) findViewById(R.id.editText2);

                Intent intent = new Intent(MainActivity.this, MarcadorActivity.class);
                Bundle b = new Bundle();
                b.putString("NameLocal", localName.getText().toString());
                b.putString("NameVisit", visitanteName.getText().toString());

                intent.putExtras(b);
                startActivity(intent);
            }
        });


    }
}
