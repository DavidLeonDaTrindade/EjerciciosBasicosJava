/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica26udemy;

/**
 *
 * @author david
 */
public class BebidaAzucarada extends Bebidas{
    private double porAzucar;
    
    public BebidaAzucarada(){
        
    }
    public BebidaAzucarada(int identificador, int capacidad, String marca, double precio,double porAzucar){
        super(identificador, capacidad,marca,precio);
        this.porAzucar = porAzucar;
    }

    @Override
    public String toString() {
        return super.toString()+"BebidaAzucarada{" + "porAzucar=" + porAzucar + '}';
    }
    
}
