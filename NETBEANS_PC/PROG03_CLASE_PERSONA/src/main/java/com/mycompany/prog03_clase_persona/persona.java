/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog03_clase_persona;

/**
 *
 * @author David
 *///ATRIBUTOS
public class persona {
    String nombre;
    int edad;
    float altura;
    
    String consultaNombre(){
        return nombre;
    }
    
    void cambiaNombre(String nom){
        nombre=nom;
    }
    //CONSTRUCTOR
    public persona(String nombre, int edad, float altura){
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + '}';
    }
    
}
