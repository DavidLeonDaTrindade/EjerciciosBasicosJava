/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.repasoarrays01;
import javax.swing.JOptionPane;
/**
 *
 * @author David
 */
public class RepasoArrays01 {

    public static void main(String[] args) {
        //longitud del array
        final int LONGITUD = 10;
        //declaramos la array
        int num[ ] = new int [LONGITUD];
        //metodo para rellenar la array
        rellenarArray(num);
        //metodo para mostrar el array por orden
        mostrarArray(num);
    }
    public static void rellenarArray(int lista[ ]){
        for(int i = 0; i<lista.length; i++){
            String texto = JOptionPane.showInputDialog("introduce un numero:");
            lista[i] = Integer.parseInt(texto);
        }
    }
    public static void mostrarArray(int lista[ ]){
        for (int i =0; i<lista.length; i++){
            System.out.println("En el indice " + i + " esta el valor " + lista[i]);
        }
    }
}
