/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sobrecargaconstructores;

/**
 *
 * @author David
 */
public class Profesor {
    String nombre;
    String apellidos;
    int edad;
    boolean casado;
    boolean especialista;
    
    public Profesor(String nombre, String apellidos, int edad, boolean casado, boolean especialista){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.casado = casado;
        this.especialista = especialista;
    } 
    public Profesor(){
        
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }
    
    public boolean getCasado(){
        return casado;
    }
    
    public boolean getEspecialista(){
        return especialista;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public void setEspecialista(boolean especialista) {
        this.especialista = especialista;
    }

     public void DatosProfesor() {
        if (this.nombre == null) {
            System.out.println("El profesor no existe");
        } else {
            System.out.println("El nombre del profesor de matematicas es "+ this.nombre +" el apellido es "+ this.apellidos + " y tiene " + this.edad + " años" );
        }
    }
    
}
