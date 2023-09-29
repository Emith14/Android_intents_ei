package com.example.intents_ei;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

 Button b1,b2,b3,b4,b5,b6,b7,b8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1.findViewById(R.id.btn1);
        b2.findViewById(R.id.btn2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirNavegador();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirMapa();
            }
        });





    }

    public void abrirNavegador() {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/dashboard"));
        startActivity(i);
    }

    public void abrirMapa() {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("25.54389, -103.41898"));
        startActivity(i);
    }

}