package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MostrarSaludoActivity extends AppCompatActivity {

    private String nombre;
    private TextView tunombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_saludo);

        getIntentData();
        setViews();
        setData();

    }

    private void setData() {
        tunombre.setText(nombre);
    }

    private void setViews() {
        tunombre =(TextView) findViewById(R.id.tu_nombre);
    }

    private void getIntentData() {
        Intent intent = getIntent();
        nombre = intent.getStringExtra("nombre");
    }
}