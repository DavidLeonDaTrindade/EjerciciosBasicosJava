/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica20udemy;

/**
 *
 * @author david
 */
public class Cuenta {
    private String titular;
    private double cantidad;
    
    public Cuenta(){
        
    }
    public Cuenta(String titular){
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

   
    public void ingresar(double cantidad){
        if(cantidad >0){
            this.cantidad = this.cantidad + cantidad;
        }
    }
    public void retirar(double cantidad){
        
        this.cantidad = this.cantidad - cantidad;
            if(this.cantidad<=0){
                this.cantidad =0;
            }
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }
    
}
