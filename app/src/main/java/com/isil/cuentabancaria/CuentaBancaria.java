package com.isil.cuentabancaria;


import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CuentaBancaria {
    //Atributos
    long numCuenta;
    Cliente cliente;
    String tipoMoneda;
    double monto;
    String historial;

    //Constructor

    public CuentaBancaria(long numCuenta, Cliente cliente, String tipoMoneda, double monto) {
        this.numCuenta = numCuenta;
        this.cliente = cliente;
        this.tipoMoneda = tipoMoneda;
        this.monto = monto;
        historial = "Cuenta creada el "+FechaActual() + "con " + ((tipoMoneda.equals("SOLES"))?"S/.":"$")
                +monto + "\n";
    }

    //Métodos
    void Depositar(double monto){

        //verificamos que el monto sea positivo y != 0
        if(monto<=0) return;

        //incrementamos el monto de la cuenta
        this.monto += monto;

        //verificamos tipo de moneda para el símbolo
        historial += "["+FechaActual()+"] " + "Depósito " + ((tipoMoneda.equals("SOLES"))?"S/.":"$")
        + monto+"\n";
    }

    void Retirar(int monto){
        if(monto <= 0) return;
        this.monto-=monto;
        if(this.monto<0){
            this.monto += monto;
            historial += "["+FechaActual()+"] " + "Saldo Insuficiente\n";
        }else{
            historial += "["+FechaActual()+"] " + "Retiro " + ((tipoMoneda.equals("SOLES"))?"S/.":"$")
                    + monto+"\n";
        }
    }

    String MostrarMonto(){
        return "El monto actual de la cuenta n° "+numCuenta+" es: "+
                (tipoMoneda.equals("SOLES")?"S/.":"$") + monto;
    }

    String MostrarHistorial(){
        return  "Cuenta n° " + numCuenta + "\n"+
                "Cliente: "+ cliente.nombre + " "+cliente.apellido+ "\n"+
                "*******************************" + "\n" +
                historial+"\n"+
                "*******************************" + "\n" +
                "historial creado el "+FechaActual();
    }



    String FechaActual(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

}
