package com.isil.cuentabancaria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Cliente cliente1, cliente2, cliente3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cliente1 = new Cliente("Juan", "Ramos", 45788526);
        cliente2 = new Cliente("Ricardo", "Milanote", 48599663);
        cliente3 = new Cliente("Marina Caps SRL",
                Long.parseLong("20601592858"));

        CuentaBancaria cb1 = new CuentaBancaria(Long.parseLong("987654321"),
                cliente1, "SOLES", 10000);

        cb1.Depositar(1500);
        cb1.Retirar(3500);
        cb1.Retirar(15000);


        Toast.makeText(this, cb1.MostrarHistorial(), Toast.LENGTH_LONG).show();
        //Toast.makeText(this, cb1.MostrarMonto(), Toast.LENGTH_LONG).show();




    }
}
