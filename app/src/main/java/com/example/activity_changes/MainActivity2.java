package com.example.activity_changes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    //Método para usar el botón Anterior para cambiar al primer Activity

    public void act3(View view){
        Intent intent3 = new Intent(this, MainActivity3.class);
        startActivity(intent3);
    }
    public void act1(View view){
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }

}