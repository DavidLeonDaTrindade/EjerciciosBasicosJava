/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica26udemy;

/**
 *
 * @author david
 */
public class Bebidas {
    private int identificador;
    private int capacidad;
    private String marca;
    private double precio;
    
    public Bebidas(){
        
    }
    public Bebidas(int identificador, int capacidad, String marca, double precio ){
        this.identificador = identificador;
        this.capacidad = capacidad;
        this.marca = marca;
        this.precio = precio;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Bebidas{" + "identificador=" + identificador + ", capacidad=" + capacidad + ", marca=" + marca + ", precio=" + precio + '}';
    }
    
            
}
