package com.example.prueba_n2_claudio_castro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import Class.Jarron;

public class CalcularJarrones_act extends AppCompatActivity {
    private Spinner spJarra;
    private TextView txtResultado,txtOpcion;
    private CheckBox opcion12jarrones,opcion24jarrones;
    private Jarron jar= new Jarron();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular_jarrones);
        spJarra=(Spinner)findViewById(R.id.spinnerJarron);
        txtResultado=(TextView)findViewById(R.id.txtCompraJarrones) ;
        txtOpcion=(TextView)findViewById(R.id.txtOpcion) ;
        opcion12jarrones=(CheckBox)findViewById(R.id.check12jarrones);
        opcion24jarrones=(CheckBox)findViewById(R.id.check24jarrones);
        ArrayAdapter adapt= new ArrayAdapter(this, android.R.layout.simple_list_item_1,jar.getMaterial());
        spJarra.setAdapter(adapt);


    }
    public void opciones(View view) {
        opcion12();
        opcion24();


    }
    public void opcion12(){
        if (opcion12jarrones.isChecked() && opcion24jarrones.isChecked()) {
            txtOpcion.setText("Opción invalida");
        }else{
            txtOpcion.setVisibility(View.INVISIBLE);
            if(opcion12jarrones.isChecked() && spJarra.getSelectedItem().toString().equals(jar.getMaterial()[0])){
                int resultado=jar.calcularCostoUnidades(12,jar.getPrecio()[0]);
                txtResultado.setText("Compraste 12 Jarrones de "+jar.getMaterial()[0]+",su costo es: "+resultado);
            }
            if(opcion12jarrones.isChecked() && spJarra.getSelectedItem().toString().equals(jar.getMaterial()[1])){
                int resultado=jar.calcularCostoUnidades(12,jar.getPrecio()[1]);
                txtResultado.setText("Compraste 12 Jarrones de "+jar.getMaterial()[1]+",su costo es: "+resultado);
            }
            if(opcion12jarrones.isChecked() && spJarra.getSelectedItem().toString().equals(jar.getMaterial()[2])){
                int resultado=jar.calcularCostoUnidades(12,jar.getPrecio()[2]);
                txtResultado.setText("Compraste 12 Jarrones de "+jar.getMaterial()[2]+",su costo es: "+resultado);
            }

        }

    }
    public void opcion24(){
        if (opcion12jarrones.isChecked() && opcion24jarrones.isChecked()) {
            txtOpcion.setText("Opción invalida");
        }else{
            txtOpcion.setVisibility(View.INVISIBLE);
            if(opcion24jarrones.isChecked() && spJarra.getSelectedItem().toString().equals(jar.getMaterial()[0])){
                int resultado=jar.calcularCostoUnidades(24,jar.getPrecio()[0]);
                txtResultado.setText("Compraste 24 Jarrones de "+jar.getMaterial()[0]+",su costo es: "+resultado);
            }
            if(opcion24jarrones.isChecked() && spJarra.getSelectedItem().toString().equals(jar.getMaterial()[1])){
                int resultado=jar.calcularCostoUnidades(24,jar.getPrecio()[1]);
                txtResultado.setText("Compraste 24 Jarrones de "+jar.getMaterial()[1]+",su costo es: "+resultado);
            }
            if(opcion24jarrones.isChecked() && spJarra.getSelectedItem().toString().equals(jar.getMaterial()[2])){
                int resultado=jar.calcularCostoUnidades(24,jar.getPrecio()[2]);
                txtResultado.setText("Compraste 24 Jarrones de "+jar.getMaterial()[2]+",su costo es: "+resultado);
            }

        }

    }


}