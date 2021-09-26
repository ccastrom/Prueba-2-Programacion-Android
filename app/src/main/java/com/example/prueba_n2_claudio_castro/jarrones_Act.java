package com.example.prueba_n2_claudio_castro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;
import Class.Cliente;
import Class.Jarron;

public class jarrones_Act extends AppCompatActivity {
    private Spinner spCliente, spMaterial;
    private TextView costoAdicional,costoFinal;
    private RatingBar ratingManoDeObra;
    private Cliente cli = new Cliente();
    private Jarron jar = new Jarron();
    private int resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jarrones);
        getArrayClienteAndJarra();

    }
    public void getArrayClienteAndJarra(){
        spCliente=(Spinner)findViewById(R.id.spinnerClientes);
        spMaterial=(Spinner)findViewById(R.id.spinnerMaterial);
        costoAdicional=(TextView)findViewById(R.id.txtCostoAdicional);
        costoFinal=(TextView)findViewById(R.id.txtCostoFinal);
        ratingManoDeObra=(RatingBar)findViewById(R.id.manoDeObraRating);
        ArrayAdapter adapt= new ArrayAdapter(this, android.R.layout.simple_list_item_1,cli.getNombre());
        spCliente.setAdapter(adapt);

        ArrayAdapter adapt2= new ArrayAdapter(this, android.R.layout.simple_list_item_1,jar.getMaterial());
        spMaterial.setAdapter(adapt2);
        spMaterial.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if(spMaterial.getSelectedItem().toString().equals(jar.getMaterial()[0])) {
                    costoAdicional.setText("El costo adicional es: "+jar.getCostoAdicional()[0]);
                    resultado=jar.calcularCosto(jar.getPrecio()[0],jar.getCostoAdicional()[0]);
                    ratingManoDeObra.setRating(2);

                }
                if(spMaterial.getSelectedItem().toString().equals(jar.getMaterial()[1])) {
                    costoAdicional.setText("El costo adicional es: "+jar.getCostoAdicional()[1]);
                    resultado= jar.calcularCosto(jar.getPrecio()[1],jar.getCostoAdicional()[1]);
                    ratingManoDeObra.setRating(3);
                }
                if(spMaterial.getSelectedItem().toString().equals(jar.getMaterial()[2])) {
                    costoAdicional.setText("El costo adicional es: "+jar.getCostoAdicional()[2]);
                    resultado=jar.calcularCosto(jar.getPrecio()[2],jar.getCostoAdicional()[2]);
                    ratingManoDeObra.setRating(5);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }


        });




    }
    public void costoTotal(View view){
        costoFinal.setText("El costo final es: "+resultado);

    }


}