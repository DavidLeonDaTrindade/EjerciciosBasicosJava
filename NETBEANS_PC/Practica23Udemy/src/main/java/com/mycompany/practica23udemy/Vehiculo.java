/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica23udemy;

/**
 *
 * @author david
 */
public class Vehiculo {
    private int numBastidos;
    private double peso;
    
    public Vehiculo(){
        
    }
    public Vehiculo(int numBastidor, double peso){
        this.numBastidos = numBastidor;
        this.peso = peso;
    }
    public double impuestoBase(){
        return 0.45 * peso; 
    }

    public int getNumBastidos() {
        return numBastidos;
    }

    public void setNumBastidos(int numBastidos) {
        this.numBastidos = numBastidos;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "numBastidos=" + numBastidos + ", peso=" + peso + '}';
    }
    
    
}
