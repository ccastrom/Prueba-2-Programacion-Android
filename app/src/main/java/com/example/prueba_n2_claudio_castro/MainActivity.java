package com.example.prueba_n2_claudio_castro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private TextView txtUserName, txtPassword,txtMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void getCredenciales(View view){
        String usuario, pass, mensaje;
        txtUserName=(TextView)findViewById(R.id.txtUsuario);
        txtPassword=(TextView)findViewById(R.id.txtPass);
        txtMsg=(TextView)findViewById(R.id.txtMensaje);
        usuario=txtUserName.getText().toString();
        pass=txtPassword.getText().toString();
        System.out.println(usuario+"|"+pass);

       if(usuario.equals("") && pass.equals("")){
           txtMsg.setText("Debe ingresar sus credenciales de acceso");


       }
       if(usuario.equals("Claudio") && pass.equals("123")){
           System.out.println("Credenciales correctas");
           Intent i = new Intent(this,CalcularJarrones_act.class);
           startActivity(i);

       }else{
           txtMsg.setText("Credenciales incorrectas");
       }

    }
    public void jarronesAct(View view){
        Intent i = new Intent(this,jarrones_Act.class);
        startActivity(i);

    }
}