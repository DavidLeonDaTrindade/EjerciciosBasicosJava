/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainpokemon;

/**
 *
 * @author David
 */
public class Squirtle extends Pokemon implements iAgua{

    public Squirtle() {
    }
    
     
    @Override
    protected void atacarPlacaje() {
        System.out.println("Squirtle uso ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
       System.out.println("Squirtle uso ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Squirtle uso ataque mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Squirtle uso ataque hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle uso ataque burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle uso ataque pistolaagua");
    }
    
}
