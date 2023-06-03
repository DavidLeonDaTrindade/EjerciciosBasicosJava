/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog05_tareacoche;
import java.time.LocalDate;
import com.mycompany.prog05_tareacoche.Confirmacion;
/**
 *
 * @author David
 */
public class Coche {
    String marca;
    String matricula;
    int Kilometros;
    LocalDate fechaMatricula;
    String descripcion;
    double precio;
    String nombrePropietario;
    String dni;
    
    
    public Coche(){
        
    }
    
    public Coche (String marca, String matricula, int Kilometros, LocalDate fechaMatricula, double precio, String nombrePropietario, String dni){
        this.marca = marca;
        this.matricula = matricula;
        this.Kilometros = Kilometros;
        this.fechaMatricula = fechaMatricula;
        this.descripcion = descripcion;
        this.precio = precio;
        this.nombrePropietario = nombrePropietario;
        this.dni = dni;     
    }
     public void Datosmatricula(){
         System.out.println("La matricula del coche es " + this.matricula);
     }
     public void Datoskilometros(){
         System.out.println("El coche tiene " + this.Kilometros + " kilometros");
     }
     public void ActualizarKilometros(int Kilometros){
         this.Kilometros = Kilometros;
     }
     public void Datosantigüedad(){
         System.out.println("La fecha de matriculacion fue en " + this.fechaMatricula);
     }
     public void DatosPropietario(){
         System.out.println("El propietario es " + this.nombrePropietario+ " y su dni es " + this.dni);
     }
      public void DatosDescripcion(){
         System.out.println("La marca del vehiculo es "+ this.marca + " tiene "+ this.Kilometros + " km y cuesta " + this.precio + " €");
     }
       public void DatosPrecio(){
         System.out.println("El precio del coche es  " + this.precio);
     }
}
