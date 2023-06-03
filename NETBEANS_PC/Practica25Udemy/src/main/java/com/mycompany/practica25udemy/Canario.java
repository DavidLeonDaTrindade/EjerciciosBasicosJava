/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica25udemy;

/**
 *
 * @author david
 */
public class Canario implements IAcciones{

    @Override
    public void cantar() {
        System.out.println("El canario canta");
    }

    @Override
    public void andar() {
        System.out.println("El canario anda");
    }
    
}
