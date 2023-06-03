/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica23udemy;

/**
 *
 * @author david
 */
public class Combustion extends Vehiculo{
    private int cilindrada;
    
    public Combustion(){
        
    }
    public Combustion(int numBastidor, double peso, int cilindrada){
        super(numBastidor,peso);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() + "Combustion{" + "cilindrada=" + cilindrada + '}';
    }
    @Override
    public double impuestoBase(){
        return super.impuestoBase() + cilindrada*3;
    }
    public String mostrarDatosCombustion(){
        return "El impuesto que se paga por el coche de cilindrada " + this.cilindrada + " es de " + this.impuestoBase();
    }
}
