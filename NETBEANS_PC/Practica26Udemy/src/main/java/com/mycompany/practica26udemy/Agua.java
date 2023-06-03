/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica26udemy;

/**
 *
 * @author david
 */
public class Agua extends Bebidas{
    private String origen;
    
    public Agua(){
        
    }
    public Agua(int identificador, int capacidad, String marca, double precio,String origen){
        super(identificador, capacidad, marca,precio);
        this.origen = origen;
    }

    @Override
    public String toString() {
        return super.toString()+"Agua{" + "origen=" + origen + '}';
    }
    
}
