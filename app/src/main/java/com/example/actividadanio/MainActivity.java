package com.example.actividadanio;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText Anio;

    Button verificar;

    TextView respuesta;

    AlertDialog.Builder dialogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Anio = (EditText) findViewById(R.id.edtxtAnio);
        verificar = (Button) findViewById(R.id.btnVerificar);
        respuesta = (TextView) findViewById(R.id.resultado);




        verificar.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

        if(verificar.getText().toString().equals("Limpiar")){
            Anio.setText("");
            respuesta.setText("");
            Anio.setEnabled(true);
            Anio.requestFocus();
            verificar.setText("Verificar");

            }else{
                if(Anio.getText().length() == 0){
                    dialogo = new AlertDialog.Builder(MainActivity.this);
                    dialogo.setTitle("Error");
                    dialogo.setMessage("Debe ingresar el cociente 'año'");
                    dialogo.setCancelable(false);
                    dialogo.setPositiveButton("Cerrar", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogo, int id) {
                            dialogo.cancel();
                            Anio.setText("");
                            Anio.requestFocus();
                        }
                    });
                    dialogo.show();
                }else{
                    int anio = Integer.parseInt(Anio.getText().toString());
                    if(anio % 4 == 0  &&  (anio % 100 != 0  ||  anio % 400 == 0)){
                        respuesta.setText("El año " + Anio.getText() + " es bisiesto");
                    }else{
                        respuesta.setText("El año " + Anio.getText() + " no es bisiesto");
                    }
                }
                Anio.setEnabled(false);
                verificar.setText("Limpiar");
            }
            }
    });

    }
}