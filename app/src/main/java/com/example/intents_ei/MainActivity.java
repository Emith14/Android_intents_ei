package com.example.intents_ei;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

 Button b1,b2,b3,b4,b5,b6,b7,b8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        b5 = findViewById(R.id.btn5);
        b6 = findViewById(R.id.btn6);
        b7 = findViewById(R.id.btn7);
        b8 = findViewById(R.id.btn8);



        b1.setOnClickListener(v -> abrirNavegador());

        b2.setOnClickListener(v -> abrirMapa());

        b3.setOnClickListener(v -> abrirCamara());

        b4.setOnClickListener(v -> abrirContactos());


        b5.setOnClickListener(v -> exp());

        b6.setOnClickListener(v -> abririnicio());


        b7.setOnClickListener(v -> envCorreo());

        b8.setOnClickListener(v -> llamar());




    }

    public void abrirNavegador(){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/dashboard"));
        startActivity(i);
    }

    public void abrirMapa() {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:25.54389,-103.41898"));

        startActivity(i);
    }

    public void abrirContactos() {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people"));
        startActivity(i);
    }

    public void abrirCamara() {
        Intent i = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(i);
    }

    public void exp(){
        Intent i= new Intent(this,MainActivity2.class);
        startActivity(i);
    }

    public void abririnicio(){
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        startActivity(intent);
    }

    public void envCorreo(){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"jakiepapeleria@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto del correo");
        intent.putExtra(Intent.EXTRA_TEXT, "Este es el contenido del correo.");
        startActivity(Intent.createChooser(intent, "Enviar correo electrónico"));

    }

    public void llamar(){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+52 8713982854"));
        startActivity(intent);
    }

}