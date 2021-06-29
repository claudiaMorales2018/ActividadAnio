package com.example.actividadanio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Anios extends AppCompatActivity {
 private TextView v1,v2,v3;
    private Object Bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anios);

        v1 =findViewById(R.id.Valor1);
        v2 = findViewById(R.id.Valor2);
        v3= findViewById(R.id.Valor3);
        this.obtnerDatos();
    }

    private void obtnerDatos() {
    }


    public void obtnerDatos(String key){

Bundle bundle = getIntent().getExtras();
 if (bundle!= null ){

     String anio = bundle.getString("año");


 }
else{

     Toast.makeText(this,"datos no ingresados",Toast.LENGTH_SHORT).show();
 }
    }
}