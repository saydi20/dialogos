package com.example.dialogo;

import static com.example.dialogo.R.id.btnRegistrarAsistente;
import static com.example.dialogo.R.id.spinnerConferencias;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {


    private View spinnerconf;
    private Object View;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        spinnerconf = findViewById(R.id.spinnerConferencias);
        View btnRegistrarAs = findViewById(R.id.btnRegistrarAsistente);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.conferencias_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        spinnerConferencias.setAdapter(adapter);



            public void onClick View;
            {
                // Obtener la conferencia seleccionada
                String conferencia = spinnerConferencias.getSelectedItem().toString();

                // Guardar los datos en algún lugar (por ejemplo, en una base de datos o en SharedPreferences)

                // Mostrar mensaje de registro exitoso
                Toast.makeText(MainActivity3.this, "Registro exitoso", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

    }
}