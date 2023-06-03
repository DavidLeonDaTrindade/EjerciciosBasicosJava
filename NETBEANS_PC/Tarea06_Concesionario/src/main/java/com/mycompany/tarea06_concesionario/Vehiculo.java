/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea06_concesionario;
import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author David
 */
public class Vehiculo {
    private String marca;
    private String matricula;
    private int kilometros;
    private LocalDate fechaMatricula;
    private String descripcion;
    private double precio;
    private String nombrePropietario;
    private String dni;
    
    
    
    public Vehiculo() {
    }

    public Vehiculo(String marca, String matricula, int kilometros, LocalDate fechaMatricula, double precio, String nombrePropietario, String dni, String descripcion){
        this.marca = marca;
        this.matricula = matricula;
        this.kilometros = kilometros;
        this.fechaMatricula = fechaMatricula;
        this.precio = precio;
        this.nombrePropietario = nombrePropietario;
        this.dni = dni;
        this.descripcion = descripcion;     
    }

     public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public LocalDate getFechaMatriculacion() {
        return fechaMatricula;
    }

    public void setFechaMatriculacion(LocalDate fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public void DatosAlumno(){
        System.out.println("David Leon 1º Daw");
    }
    
    public int get_Anios(){
        
        LocalDate fecha1 = this.fechaMatricula;
        LocalDate fecha2 = LocalDate.now();
        
        Period p = Period.between(fecha1, fecha2);
        
        return p.getYears();
    }
        
   
    
        
    

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", matricula=" + matricula + ", kilometros=" + kilometros + ", descripcion=" + descripcion + ", precio=" + precio + ", nombrePropietario=" + nombrePropietario + ", dni=" + dni + '}';
    }
}
