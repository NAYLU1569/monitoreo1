package com.example.monitoreo;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button; //

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Conecta con activity_main.xml

        // Asignación de botones desde el XML
        Button btnVolquetas = findViewById(R.id.btnVolquetas);
        Button btnChoferes = findViewById(R.id.btnChoferes);

        // Acción para el botón de Volquetas
        btnVolquetas.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, VolquetasActivity.class); //
            startActivity(intent);
        });

        // Acción para el botón de Choferes
        btnChoferes.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ChoferesActivity.class); //
            startActivity(intent);
        });
    }
}