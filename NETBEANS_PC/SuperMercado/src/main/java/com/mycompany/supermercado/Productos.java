/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercado;

/**
 *
 * @author David
 */
public class Productos {
   private String nombreRefresco, nombreAgua, nombreLeche, marca;
   private int tamaño;
   
   //CONTRUCTOR DEL REFRESCO
   public Productos(String nombreRefresco, int tamaño){
       this.nombreRefresco = nombreRefresco;
       this.tamaño = tamaño;
  }     
   //CONSTRUCTOR DEL AGUA
   public Productos (String nombreAgua,String marca, int tamaño){
       this.nombreAgua = nombreAgua;
       this.marca = marca;
       this.tamaño = tamaño;
   }
   //CONTRUCTOR DE LA LECHE
   public Productos (String nombreLeche, String marca){
       this.nombreLeche = nombreLeche;
       this.marca = marca;
   }
//METODOS GETTERS AND SETTERS
    public String getNombreRefresco() {
        return nombreRefresco;
    }

    public void setNombreRefresco(String nombreRefresco) {
        this.nombreRefresco = nombreRefresco;
    }

    public String getNombreAgua() {
        return nombreAgua;
    }

    public void setNombreAgua(String nombreAgua) {
        this.nombreAgua = nombreAgua;
    }

    public String getNombreLeche() {
        return nombreLeche;
    }

    public void setNombreLeche(String nombreLeche) {
        this.nombreLeche = nombreLeche;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
   
   
    
   
}
