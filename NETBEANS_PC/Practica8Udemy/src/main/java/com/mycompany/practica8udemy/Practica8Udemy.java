/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.practica8udemy;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Practica8Udemy {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double precioProducto = 0;
        double numProductos = 0;
        double descuento = 0;
        double descuento10 = 0;
        double descuento15 = 0;
        System.out.println("Dime el precio del producto:");
        precioProducto = teclado.nextDouble();
        System.out.println("Cuantos quieres comprar");
        numProductos = teclado.nextInt();
        double totalPrecio = precioProducto * numProductos;
        if (totalPrecio < 100) {
            descuento = 0;
            System.out.println("El cliente no tiene derecho a descuento");
        } else if (totalPrecio > 100 && totalPrecio < 200) {
            descuento = (10 * totalPrecio) / 100;
            descuento10 = totalPrecio - descuento;
            System.out.println("El cliente tiene derecho a un descuento de " + descuento + " € la compra le sale " + descuento10 + " €");
        } else if (totalPrecio > 200) {
            descuento = (15 * totalPrecio)/100;
            descuento15 = totalPrecio - descuento;
            System.out.println("El cliente tiene derecho a un descuento de " + descuento + " € la compra le sale " + descuento15 + " €");
        }

    }
}
