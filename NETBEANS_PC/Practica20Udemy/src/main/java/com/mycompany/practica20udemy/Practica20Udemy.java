/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.practica20udemy;

/**
 *
 * @author david
 */
public class Practica20Udemy {

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta();
        Cuenta cuenta2 = new Cuenta("Pepe");

        cuenta2.ingresar(165);
        System.out.println("El saldo de " + cuenta2.getTitular() + " tiene " + cuenta2.getCantidad() + "€");
        cuenta2.retirar(160);

        cuenta1.setTitular("Luis");
        cuenta1.setCantidad(500);

        System.out.println("El titular de la 1 cuenta es " + cuenta1.getTitular() + " y tiene " + cuenta1.getCantidad() + "€");

        cuenta1.retirar(510);

        System.out.println(cuenta1.getCantidad());
        System.out.println(cuenta2.getCantidad());
        System.out.println("");
    }

}
