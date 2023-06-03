/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercado;

import java.util.ArrayList;

/**
 *
 * @author David
 */
public class Stock {
    
    //ATRIBUTOS DE LA CLASE
    String nombre;
    ArrayList<Stock> productos = new ArrayList<>();
    int maximoProductos = 5;
    
   //CONTRUCTOR DEL SUPERMERCADO 
   public Stock(String nombre){
       this.nombre = nombre;
   }
   //CONTRUCTOR DONDE VAMOS AÑADIENDO PRODUCTOS AL ARRAY
   public Stock(String nombre, Stock productos){
       this.nombre = nombre;
       this.productos.add(productos);
   }
   
   public void addProducto(Stock productos){
       if (this.productos.size() < maximoProductos){
           this.productos.add(productos);
               System.out.println("");
               }
       }
   }
   
}
