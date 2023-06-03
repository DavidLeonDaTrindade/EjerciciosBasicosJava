/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sobrecargaprofesor;
import com.mycompany.sobrecargaprofesor.Profesor;
/**
 *
 * @author David
 */
public class SobrecargaProfesor {

    public static void main(String[] args) {
        Profesor pro1 = new Profesor("Juan", "Lopez", 35, true, true);
        System.out.println("El profesor se llama " + pro1.getNombre() + " su apellido es "+ pro1.getApellidos() + " , tiene " + pro1.getEdad() + " años. ");
        Profesor pro2 = new Profesor();
        pro2.setNombre("Andres");
        pro2.setApellidos("Hernandez");
        pro2.setEdad(40);
        System.out.println("El otro profesor se llama " + pro2.getNombre() + " " + pro2.getApellidos() + " y tiene "+ pro2.getEdad() + " años");
    } 
}
