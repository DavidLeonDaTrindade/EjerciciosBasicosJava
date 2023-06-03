/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cliente;
import java.util.Comparator;

/**
 *
 * @author David
 */
public class compareNombre implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((constructorCliente)o1).nombre.compareTo(((constructorCliente) o2).nombre);
    }

     
}
