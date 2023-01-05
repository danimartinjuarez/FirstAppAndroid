package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etSaludo;
    private Button bSaludo;
    private String nombre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setViews();
        setListeners();
    }

    private void setViews() {
        etSaludo = (EditText)findViewById(R.id.et_saludo);
        bSaludo = (Button)findViewById(R.id.b_saludo);
    }

    private void setListeners() {
        bSaludo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombre= etSaludo.getText().toString();
                Intent intent = new Intent(MainActivity.this, MostrarSaludoActivity.class);
                intent.putExtra("nombre", nombre);
                startActivity(intent);
            }
        });
    }



}