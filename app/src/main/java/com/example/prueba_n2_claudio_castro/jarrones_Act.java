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

                if(spMaterial.getSelectedItem().toString().equals("Cerámica")) {
                    jar.setPrecio(4500);
                    jar.setCostoAdicional(150);
                    costoAdicional.setText("El costo adicional es: "+jar.getCostoAdicional());
                    resultado=jar.calcularCosto(jar.getPrecio(),jar.getCostoAdicional());
                    ratingManoDeObra.setRating(2);

                }
                if(spMaterial.getSelectedItem().toString().equals("Porcelana")) {
                    jar.setPrecio(12500);
                    jar.setCostoAdicional(350);
                    costoAdicional.setText("El costo adicional es: "+jar.getCostoAdicional());
                    resultado= jar.calcularCosto(jar.getPrecio(),jar.getCostoAdicional());
                    ratingManoDeObra.setRating(3);
                }
                if(spMaterial.getSelectedItem().toString().equals("Vidrio")) {
                    jar.setPrecio(25000);
                    jar.setCostoAdicional(500);
                    costoAdicional.setText("El costo adicional es: "+jar.getCostoAdicional());
                    resultado=jar.calcularCosto(jar.getPrecio(),jar.getCostoAdicional());
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