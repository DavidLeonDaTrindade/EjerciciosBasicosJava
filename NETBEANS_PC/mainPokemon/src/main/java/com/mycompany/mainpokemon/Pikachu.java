/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainpokemon;

/**
 *
 * @author David
 */
public class Pikachu extends Pokemon implements iElectrico{

    public Pikachu() {
    }
    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Pikachu uso ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Pikachu uso ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Pikachu uso ataque mordisco");
    }

    @Override
    public void atacarImpactrueno() {
       System.out.println("Pikachu uso ataque impactrueno");
    }

    @Override
    public void atacarpunioTrueno() {
        System.out.println("Pikachu uso ataque puñotrueno");
    }
    
}
