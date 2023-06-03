/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mainpokemon;

/**
 *
 * @author David
 */
public class MainPokemon {

    public static void main(String[] args) {
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasur bulbasur = new Bulbasur();
        Pikachu pikachu = new Pikachu();
        Snorlax snorlax = new Snorlax();
        
        squirtle.atacarAraniazo();
        squirtle.atacarHidrobomba();
        charmander.atacarAraniazo();
        charmander.atacarLanzallamas();
        bulbasur.atacarAraniazo();
        bulbasur.atacarDrenaje();
        pikachu.atacarAraniazo();
        pikachu.atacarpunioTrueno();
        snorlax.descansar();
        snorlax.ronquido();
    }
}
