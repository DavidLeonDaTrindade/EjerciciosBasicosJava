/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicamain;

/**
 *
 * @author David
 */
//clase abstracta padre
public abstract class Personaje {
    //atributos de la clase
    protected String nombre;
    protected int ki;
    protected int vida;

    public Personaje(String nombre, int ki, int vida) {
        this.nombre = nombre;
        this.ki = ki;
        this.vida = vida;
    }
    public Personaje(){
        
    } 
    //metodos abstractos 
    protected abstract void ataque(Personaje objetivo);
    protected abstract void defender(Personaje objetivo);
    
    public int getKi() {
        return ki;
    }
    public void setKi(int ki) {
        this.ki = ki;
    }
}
