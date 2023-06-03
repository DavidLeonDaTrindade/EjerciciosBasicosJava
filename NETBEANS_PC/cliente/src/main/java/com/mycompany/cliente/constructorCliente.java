/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cliente;

/**
 *
 * @author David
 */
public class constructorCliente extends Cliente implements Comparable<constructorCliente> {

    String dni, nombre;
    private int edad;
    private double saldo;

    public constructorCliente(String nombre) {
        this.nombre = nombre;
    }

    public constructorCliente(String dni, String nombre, int edad, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.saldo = saldo;
    }

    public String toString() {
        String mensaje = "El cliente se llama " + nombre + " su dni es " + dni + " tiene " + edad + " años y su saldo es de " + saldo + " €";
        return mensaje;
    }

    public boolean equals(Object obj) {
        constructorCliente p = (constructorCliente) obj;
        return p.getDni().equals(this.getDni());
    }

    @Override
    public int compareTo(constructorCliente o) {
        if (this.getEdad() > o.getEdad()) {
            return 1;
        } else if (this.getEdad() < o.getEdad()) {
            return -1;
        } else {
            return 0;
        }
    }
   
    public int compareNombre(Object o1, Object o2) {
        return((constructorCliente) o1).nombre.compareTo(((constructorCliente) o2).nombre);
    }
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
