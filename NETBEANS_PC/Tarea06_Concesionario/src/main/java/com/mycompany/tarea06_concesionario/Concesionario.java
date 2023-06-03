/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea06_concesionario;

/**
 *
 * @author David
 */
public class Concesionario {
        
    private Vehiculo[] vehiculos;
    private int numVehiculos;
    
    public Concesionario(){
        this.numVehiculos = 0;
        this.vehiculos = new Vehiculo[50];
    }
    
    public Vehiculo buscaVehiculo(String matricula){
        for (int i = 0; i < numVehiculos; i++){
            Vehiculo v = this.vehiculos[i];
            
            if(v.getMatricula().equals(matricula)) {
               return v;
            }
        }
        return null;
    }
    
    public int insertarVehiculo(Vehiculo v){
        if (this.numVehiculos == this.vehiculos.length){
            return -1;
        }
        if ( this.buscaVehiculo(v.getMatricula()) != null){
            return -2;
        }
        else{
            this.vehiculos[this.numVehiculos] = v;
            this.numVehiculos++;
            return 0;
        }
    }
    
    public void listarVehiculos(){
         for (int i = 0; i < numVehiculos; i++){
            Vehiculo v = this.vehiculos[i];
             System.out.println(v.toString());
        } 
    }
    
    public boolean actualizaKms(String matricula, int kms){
          for (int i = 0; i < numVehiculos; i++){
            Vehiculo v = this.vehiculos[i];
            
            if(v.getMatricula().equals(matricula)) {
                v.setKilometros(kms);
               return true;
            }
        }
           return false;
    }
    
   
}
