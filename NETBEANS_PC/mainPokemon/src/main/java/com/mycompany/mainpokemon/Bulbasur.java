/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainpokemon;

/**
 *
 * @author David
 */
public class Bulbasur extends Pokemon implements iPlanta {

    public Bulbasur() {
    }
    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Bulbasur usa ataqueplacaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Bulbasur usa ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Bulbasur usa ataque mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Bulbasur uso ataque drenaje");
    }

    @Override
    public void atacarParalizar() {
       System.out.println("Bulbasur uso ataque paralizante");
    }
    
}
