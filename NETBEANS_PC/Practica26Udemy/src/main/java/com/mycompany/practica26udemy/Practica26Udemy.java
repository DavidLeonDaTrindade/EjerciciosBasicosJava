/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica26udemy;

/**
 *
 * @author david
 */
public class Practica26Udemy {

    public static void main(String[] args) {
        Agua agua1 = new Agua(1, 300,"bezoya", 1.50, "Manatial");
        Agua agua2 = new Agua(2, 290,"fonteide", 1.40, "Manatial");
        BebidaAzucarada bebida1 = new BebidaAzucarada(3, 330,"Coca-Cola", 2, 20);
        BebidaAzucarada bebida2 = new BebidaAzucarada(4, 330,"Pepsi", 2.50, 25);
    
        Almacen almacen = new Almacen();
        almacen.agregarBebida(agua1);
        almacen.agregarBebida(agua2);
        almacen.agregarBebida(bebida1);
        almacen.agregarBebida(bebida2);
        
        System.out.println(almacen.precioTotalMarca("bezoya"));
        System.out.println(almacen.precioTotal());
        almacen.mostrarInformacion();
    }
}
