/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica26udemy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author david
 */
public class Almacen {

    private List<Bebidas> contenedor;

    public Almacen() {
        contenedor = new ArrayList<Bebidas>();
    }

    //agregar bebida
    private boolean existeBebida(Bebidas b) {
        for (int i = 0; i < contenedor.size(); i++) {
            if (contenedor.get(i).getIdentificador() == b.getIdentificador()) {
                return true;
            }
        }
        return false;

    }

    public boolean agregarBebida(Bebidas b) {
        boolean existe = existeBebida(b);
        if (existe) {
            return false;

        } else {
            contenedor.add(b);
            return true;
        }
    }

    public boolean elminarBebida(Bebidas b) {
        boolean existe = existeBebida(b);
        if (existe) {
            contenedor.remove(b);
            return true;
        } else {
            return false;
        }
    }

    public double precioTotalMarca(String marca) {
        double precioTotalMarca = 0;
        for (Bebidas b : contenedor) {
            if (b.getMarca().equalsIgnoreCase(marca)){
                precioTotalMarca = b.getPrecio();
            }
        }
        
        return precioTotalMarca;
    }
    
    public double precioTotal(){
        double precioTotal =0;
            for(Bebidas b: contenedor ){
                precioTotal += b.getPrecio();
            }
            return precioTotal;
    }
    public void mostrarInformacion(){
        for (Bebidas b: contenedor){
            System.out.println(b.toString());
        }
    }
}
