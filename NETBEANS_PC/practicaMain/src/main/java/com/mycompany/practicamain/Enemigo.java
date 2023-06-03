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
public class Enemigo extends Personaje implements IEnemigoFinal {
    Enemigo (String nombre, int ki, int vida){
        super(nombre,ki,vida);
    }
    @Override
    protected void ataque(Personaje Goku) {
        this.ki -= 10;
        Goku.vida -=20;
        System.out.println("has atacado tu nuevo ki es " + this.ki + " tu ataque a sido de 20 puntos de daño");
    }

    @Override
    protected void defender(Personaje Vegeta) {
        this.vida += 20;
        System.out.println("has usado defensa tu nueva vida es " + this.vida);
    }
    @Override
    public void ataqueGenkidama(Personaje Goku) {
        this.ki -= 50;
        Goku.vida -= 300;
        System.out.println("has realizado un ataque especial tu nuevo ki es de " +this.ki + " tu ataque resto 300 puntos al enemigo");
    }

    @Override
    public void bolaFinal(Personaje Vegeta) {
        this.ki  -=50;
        Vegeta.vida -=300;
        System.out.println("has realizado un ataque especial tu nuevo ki es de " + this.ki + " tu ataque resto 300 puntos al enemigo");
    }

    
    
   

   
}