/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancosl;

/**
 *
 * @author David
 */
//ATRIBUTOS
public class Banco {
    final String nombre;
    double capital;
    String direccionCentral;
    
    //CONTRUCTOR DONDE FALTA CAPITAL PARA ASIGANR UN VALOR POR DEFECTO
     public Banco(String nombre, String direccionCentral){
        this.nombre = nombre;
        this.capital = 5.2;//CAPITAL POR DEFECTO
        this.direccionCentral = direccionCentral;
                           
    }
    //CONTRUCTOR COMPLETO
    public Banco(String nombre, double capital, String direccionCentral){
        this.nombre = nombre;
        this.capital = capital;
        this.direccionCentral = direccionCentral;                 
    }
    //METODO PARA MOSTRAR EL SALDO
    public void Saldo(){
        System.out.println("El nombre del banco es: " + this.nombre + " y el capital es "+ this.capital + " millones y el banco esta en "+ this.direccionCentral);
    }
   
    
}
