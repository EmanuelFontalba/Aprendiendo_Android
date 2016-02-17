package com.example.azahara.gridlayoutsanimales;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton b1, b2, b3;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (ImageButton) findViewById(R.id.bCaballo);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp != null) {
                    mp.stop();
                }
                mp = MediaPlayer.create(MainActivity.this, R.raw.caballo);
                mp.seekTo(0);
                mp.start();
            }
        });

        b2 = (ImageButton) findViewById(R.id.bCastor);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp!=null){
                    mp.stop();
                }
                mp=MediaPlayer.create(MainActivity.this, R.raw.castor);
                mp.seekTo(0);
                mp.start();
            }
        });

        b3 = (ImageButton) findViewById(R.id.bGaviota);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp!=null){
                    mp.stop();
                }
                mp=MediaPlayer.create(MainActivity.this, R.raw.gaviota);
                mp.seekTo(0);
                mp.start();
            }
        });
    }
}
