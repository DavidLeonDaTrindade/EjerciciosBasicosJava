/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerciciosarraydiscoduro;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class EjerciciosArrayDiscoDuro {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int TAMANIO = teclado.nextInt();
        int num[ ] = new int [TAMANIO];
        
        rellenarArray(num);
        
        mostrarArray(num);
    }
    
    public static void rellenarArray(int lista [ ]){
        for(int i = 0; i<lista.length; i++){
            String texto = JOptionPane.showInputDialog("introduce un numero:");
            lista[i] = Integer.parseInt(texto);
        }
    }
    public static void mostrarArray(int lista[ ]){
        for (int i =0; i< lista.length; i++){
            System.out.println("En el indice " + i + " esta el valor " + lista[i]);
        }
    }
}
