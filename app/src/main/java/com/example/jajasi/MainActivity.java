package com.example.jajasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    //Atributos -> Componentes Visuales
    private EditText etNombre,etApellido, etCelular;
    private Button btnRegistrar;
    private Switch swEstudiante;

    private Estudiante estudiante;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarVistas();
    }

    private void  inicializarVistas(){
        etNombre=findViewById(R.id.etNombre);
        etApellido=findViewById(R.id.etApellido);
        etCelular=findViewById(R.id.etCelular);
        btnRegistrar=findViewById(R.id.btnRegistrar);
        swEstudiante=findViewById(R.id.swEstudiante);
    }
    private void ObtenerInformacion(){
        String nombre= etNombre.getText().toString();
        String apellido= etApellido.getText().toString();
        int celular = Integer.parseInt(etCelular.getText().toString());
        boolean esEstudiante=swEstudiante.isChecked();
        estudiante=new Estudiante(nombre, apellido, celular, esEstudiante);
    }
}