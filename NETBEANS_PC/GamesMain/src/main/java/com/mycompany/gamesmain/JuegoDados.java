/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamesmain;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class JuegoDados implements IGames {

    @Override
    public void inicio() {
        System.out.println("El juego se esta iniciando...");
        System.out.println("-----------------------------------");
    }

    @Override
    public void desarrollo() {
        String jugador1, jugador2;
        int num1,num2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indica el nombre del primer jugador...");
        jugador1 = teclado.nextLine();
        System.out.println("Indica el nombre del segundo jugador...");
        jugador2 = teclado.nextLine();
        System.out.println("El jugador "+jugador1+" realiza la tirada: ");
        num1 = (int) (Math.random()*7);
        num2 = (int) (Math.random()*7);
        System.out.println("Su numero es " + num1);
        System.out.println("El jugador " + jugador2 + " realiza la tirada");
        System.out.println("Su numero es el " + num2);
        if (num1>num2){
            System.out.println("El ganador es " + jugador1);
        }else if(num1<num2){
        System.out.println("El ganador es " + jugador2);
        }else if(num1 == num2){
            System.out.println("Han sacado el mismo numero han empatado");
        }
    }

    @Override
    public void fin() {
        System.out.println("Fin del juego espero que lo hayas disfrutado");
    }

}
