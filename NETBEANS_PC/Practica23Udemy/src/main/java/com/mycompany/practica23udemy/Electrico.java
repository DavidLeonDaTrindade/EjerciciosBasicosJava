/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica23udemy;

/**
 *
 * @author david
 */
public class Electrico extends Vehiculo{
    private double precio;
    
    public Electrico(int numBastidor,double peso, double precio){
        super(numBastidor,peso);
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return super.toString() + "Electrico{" + "precio=" + precio + '}';
    }
    
    @Override
    public double impuestoBase(){
        return super.impuestoBase() + 0.09*precio;
    }
    public String mostrarDatosElectrico(){
        return "El impuesto que se paga por el coche de precio " + this.precio + " es de " + this.impuestoBase();
    }
}
