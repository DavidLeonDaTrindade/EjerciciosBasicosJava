/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainpokemon;

/**
 *
 * @author David
 */
public class Snorlax extends Pokemon implements iSnorlax {

    @Override
    protected void atacarPlacaje() {
        System.out.println("Snorlax uso placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Snorlax uso arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Snorlax uso mordisco");
    }

    @Override
    public void descansar() {
        System.out.println("Snorlax uso descansar");
        System.out.println("zzzZZZzzzZZZ");
    }

    @Override
    public void ronquido() {
       System.out.println("Snorlax uso ronquido");
        System.out.println("El ataque es muy efectivo");
    }
    
}
