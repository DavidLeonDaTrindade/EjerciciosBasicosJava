/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica24udemy;

/**
 *
 * @author david
 */
public class Senador extends Legislador {
    
    public Senador(){
        
    }
    
    public Senador(String nombre, String apellidos, int edad, boolean casado,String provincia,String partidoPo,int numeroDespacho){
        super(nombre, apellidos,edad,casado,provincia,partidoPo,numeroDespacho);
    }
    @Override
    public void getCamaraEnQueTrabaja() {
        System.out.print("Trabaja en el senado:");
    }
    
}
