/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica23udemy;

/**
 *
 * @author david
 */
public class Practica23Udemy {

    public static void main(String[] args) {
        Electrico ele1 = new Electrico(100, 1500, 3000);
        Electrico ele2 = new Electrico(200, 1600, 7000);
        
        Combustion comb1 = new Combustion(300, 5000, 8000);
        Combustion comb2 = new Combustion(450, 1500, 1000);
        
        System.out.println(ele1.mostrarDatosElectrico());
        System.out.println(ele2.mostrarDatosElectrico());
        System.out.println(comb1.mostrarDatosCombustion());
        System.out.println(comb2.mostrarDatosCombustion());
    }
}
