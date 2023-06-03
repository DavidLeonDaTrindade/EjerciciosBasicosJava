package com.mycompany.clasesabstractas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author david
 */
public abstract class Figura {
    
    private String nombre;
    
    public Figura(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void decirNombre(){
        System.out.println("La figura es un: " + nombre);
    }
    public abstract double area();
    public abstract double perimetro();
   
}
