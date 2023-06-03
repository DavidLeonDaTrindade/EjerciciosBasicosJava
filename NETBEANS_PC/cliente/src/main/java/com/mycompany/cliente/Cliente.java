/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/**
 *
 * @author David
 */
public class Cliente {

    public static void main(String[] args) {
        constructorCliente [ ] listaClientes = new constructorCliente[5];
                
        listaClientes[0] = new constructorCliente("78631018k", "Juan", 80, 1500);
        listaClientes[1] = new constructorCliente("78631017k", "Pepe", 20, 100);
        listaClientes[2] = new constructorCliente("75631018k", "Ana", 35, 1400);
        listaClientes[3] = new constructorCliente("78451018k", "Pedro", 25, 800);
        listaClientes[4] = new constructorCliente("78631000k", "Maria", 55, 300);
        
        
        
        Arrays.sort(listaClientes);
        System.out.println("Por edad: " );
       
        
        for(constructorCliente c :listaClientes){
            System.out.print(c.getNombre());
            System.out.println("-->"+c.getEdad());
        }
        Arrays.sort(listaClientes, new compareNombre());
            for(constructorCliente n : listaClientes){
                System.out.println("Por nombre: " + n.getNombre());
            }
        
        
        
    }
}
