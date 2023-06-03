/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica22udemy;

/**
 *
 * @author david
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    
    public Fecha(){
        
    }
    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        String resultado = "";
        if(dia<10){
            resultado = resultado +"0"+ dia;
            
        }else{
            resultado = resultado + dia;
        }
        resultado = resultado + "/";
        if (mes <10){
            resultado = resultado + "0" + mes;
        }else{
            resultado += mes;
        }
        resultado += "/" + anio;
        return resultado;
    }
    
    
}
