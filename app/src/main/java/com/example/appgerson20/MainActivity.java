package com.example.appgerson20;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView Mensaje;
    EditText Nombre;
    Button btnSaludar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Mensaje = findViewById(R.id.Mensaje);
        Nombre = findViewById(R.id.Nombre);
        btnSaludar = findViewById(R.id.btnSaludar);

        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nombreIngresado = Nombre.getText().toString();

                Mensaje.setText("¡Hola, " + nombreIngresado + "! Qué gusto saludarte.");
            }
        });
    }
}