package com.isil.cuentabancaria;

public class Cliente {
    String nombre;
    String apellido;
    boolean esEmpresa;
    int dni;
    long ruc;

    //Constructor
    public Cliente(String nombre, String apellido, boolean esEmpresa, int dni, long ruc) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.esEmpresa = esEmpresa;
        this.dni = dni;
        this.ruc = ruc;
    }

    public Cliente(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        esEmpresa = false;
        ruc = -1;
    }

    public Cliente(String nombre, long ruc) {
        this.nombre = nombre;
        this.ruc = ruc;
        esEmpresa = true;
        dni = -1;
        apellido = "EMPRESA";
    }
}
