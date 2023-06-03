/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica25udemy;

/**
 *
 * @author david
 */
public class Gallo implements IAcciones{

    @Override
    public void cantar() {
        System.out.println("El gallo canta");
    }

    @Override
    public void andar() {
        System.out.println("El gallo anda");
    }
    
}
