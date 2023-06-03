/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasesabstractas;

/**
 *
 * @author david
 */
public class Cuadrado extends Figura {
    private double lado;
    
    public Cuadrado(String nombre,double lado){
        super(nombre);
        this.lado = lado;
    }

    @Override
    public double area() {
        double area = lado * lado;
                return area;
    }

    @Override
    public double perimetro() {
        double perimetro = lado * 4;
        return perimetro;
    }
}
