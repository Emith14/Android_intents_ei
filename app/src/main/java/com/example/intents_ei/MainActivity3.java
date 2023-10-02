package com.example.intents_ei;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity3 extends AppCompatActivity {

    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        txt = (TextView) findViewById(R.id.txt2);


        new CountDownTimer(3000, 1000) {

            public void onTick(long millisUntilFinished) {
                txt.setText("seconds remaining: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                Intent i= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        }.start();


    }
}