/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasesabstractas;

/**
 *
 * @author david
 */
public class Triangulo extends Figura {
    private double lado;
    private double altura;
    
    public Triangulo(String nombre,double lado, double altura){
        super(nombre);
        this.lado = lado;
        this.altura = altura;
    }

    @Override
    public double area() {
        return (lado*altura)/2;
    }

    @Override
    public double perimetro() {
        return lado * 3;
    }
}
