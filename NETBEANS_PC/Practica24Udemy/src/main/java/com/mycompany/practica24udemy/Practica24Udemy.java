/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica24udemy;

/**
 *
 * @author david
 */
public class Practica24Udemy {

    public static void main(String[] args) {
        //creacion del array
        Legislador[ ] legisladores = new Legislador[5];
        //creacion de los objetos con polimorfismo
        Legislador l1 = new Diputado("Juan", "Lopez", 30, true,"Tenerife", "PSOE", 115);
        Legislador l2 = new Senador("Pepe", "Hernandez", 31, true, "Madrid","PP", 40);
        Legislador l3 = new Diputado("Ruyman", "Gonzales", 35, false, "Las Palmas", "CCA",15 );
        Legislador l4 = new Senador("Lolo", "Leon", 48, true, "Cadiz", "AAD", 7);
        Legislador l5 = new Diputado("Mario", "Gonzales", 23, false, "Barcelona","PODEMOS", 0);
        //rellenamos el array
        legisladores[0]=l1;
        legisladores[1]=l2;
        legisladores[2]=l3;
        legisladores[3]=l4;
        legisladores[4]=l5;
        //recorremos el array haciendo uso del metodo camara en que trabaja
        for (Legislador leg: legisladores){
            
            leg.getCamaraEnQueTrabaja();
            System.out.println(leg.getNombre() + " de " + leg.getProvincia() + " y partido " + leg.getPartidoPo());
            
        }
        
        
    }
}
