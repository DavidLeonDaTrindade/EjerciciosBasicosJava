/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainpokemon;

/**
 *
 * @author David
 */
public class Charmander extends Pokemon implements iFuego {

    public Charmander() {
    }
    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Charmander uso ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Charmander uso ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Charmander uso ataque mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Charmander uso ataque puñofuego");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Charmander uso ataque lanzallamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander uso ataque ascuas");
    }
    
}
