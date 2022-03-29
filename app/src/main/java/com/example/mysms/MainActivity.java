package com.example.mysms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chamaNormal(View v) {
        Intent i;
        i = new Intent( this, NormalActivity.class);
        startActivity(i);
    }

    public void chamaMensagem(View v) {
        Intent i;
        i = new Intent(this, MensagemActivity.class);
        startActivity(i);
    }

}