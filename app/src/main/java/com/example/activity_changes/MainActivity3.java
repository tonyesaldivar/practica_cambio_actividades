package com.example.activity_changes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    //Método para usar el botón Anterior para cambiar al primer Activity
    public void act2(View view){
        Intent intent2 = new Intent(this, MainActivity2.class);
        startActivity(intent2);
    }
    //Método para usar el botón Anterior para cambiar al primer Activity
    public void act1(View view){
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }
}