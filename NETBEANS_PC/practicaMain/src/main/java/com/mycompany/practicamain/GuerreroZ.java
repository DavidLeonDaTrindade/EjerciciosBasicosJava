/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicamain;

/**
 *
 * @author David
 */
//clase hijo de personaje hereda con extends los atributos y metodos de personaje
public class GuerreroZ extends Personaje implements IAliado{
   public GuerreroZ(String nombre, int ki,int vida){
        super(nombre,ki,vida);
    }
  

    @Override
    protected void ataque(Personaje Vegeta) {
        this.ki -= 10;
        Vegeta.vida -=20;
        System.out.println("has atacado tu nuevo ki es " + this.ki + " tu ataque a sido de 20 puntos de daño");
    }

    @Override
    protected void defender(Personaje Goku) {
        this.vida += 20;
        System.out.println("has usado defensa tu nueva vida es " + this.vida);
    }

    @Override
    public void genkidama(Personaje Freezer) {
        this.ki -=40;
        Freezer.vida -= 500;
        System.out.println("has usado un ataque especial le ha restado 500 puntos a "+ Freezer.nombre+" la nueva vida es " +  Freezer.vida + " puntos");
    }

    @Override
    public void kamehameha(Personaje Freezer) {
        this.ki -= 50;
        Freezer.vida -=400; 
        System.out.println("has usado un ataque especial le ha restado 400 puntos a "+ Freezer.nombre+" la nueva vida es " +  Freezer.vida + " puntos");
    }
    
}
