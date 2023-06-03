/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clases_openbootcamp_1;

/**
 *
 * @author David
 */
public class Animal {
    private String raza;
    private String nombre;
    private int edad;
    
    public Animal (String nuevoNombre){
        nombre = nuevoNombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int nuevaEdad){
        edad = nuevaEdad;
    }
    public String getNombre(){
        return nombre;
    }
    public String getRaza(){
        return raza;
    }
    public void setRaza(String nuevaRaza){
        raza = nuevaRaza;
    }
}
