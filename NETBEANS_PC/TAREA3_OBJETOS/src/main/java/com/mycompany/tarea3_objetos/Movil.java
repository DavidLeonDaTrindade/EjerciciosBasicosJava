/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea3_objetos;

/**
 *
 * @author David
 */
public class Movil {
    //ATRIBUTOS
    boolean teclado;
    String t_pantalla;
    String SO;
    String proveedor;
    //METODOS
    public Movil(){
        this.teclado = true;
    }
    public void HacerLlamada(){
        System.out.println("Hacer llamada");
    }
    public void ColgarLlamada(){
        System.out.println("colgar llamada");
    }
    public void EnviarSms(){
        System.out.println("Enviar Sms");
    }
            
}
