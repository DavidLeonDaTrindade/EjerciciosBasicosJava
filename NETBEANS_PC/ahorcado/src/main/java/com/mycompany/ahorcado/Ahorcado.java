/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ahorcado;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class Ahorcado {

    public static void main(String[] args) {

        String palabraSecreta = getPalabraSecreta();
        char[] palabraGuiones = getGuionesPalabra(palabraSecreta);
        boolean juegoTerminado = false;
        Scanner teclado = new Scanner(System.in);
        int intentos = 5;

        do {
            System.out.println("Tienes " + intentos + " intentos");
            System.out.println(palabraGuiones);
            System.out.println("Intenda adivinar la palabra secreta: ");
            char letra = teclado.next().charAt(0);
            boolean letraAcertada = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    palabraGuiones[i] = letra;
                    letraAcertada = true;
                }
            }
            if (!letraAcertada) {
                System.out.println("No has acertado la letra");
                --intentos;
                if (intentos == 0) {
                    System.out.println("Has agotado los intentos");
                    juegoTerminado = true;
                }
            } else {
                boolean juegoGanado = !hayGuiones(palabraGuiones);
                if (juegoGanado) {
                    System.out.println("Felicidades has ganado");
                    juegoTerminado = true;
                }
            }
        } while (!juegoTerminado);
        System.out.println("La palabra secreta era " + palabraSecreta);
    }

    static String getPalabraSecreta() {
        String[] palabras = {"casa", "perro", "coche", "gato", "camion", "ordenador", "reloj", "teclado", "portatil"};
        Random r = new Random();
        int n = r.nextInt(palabras.length);
        return palabras[n];
    }

    static char[] getGuionesPalabra(String palabra) {
        int numeroLetras = palabra.length();

        char[] palabraGuiones = new char[numeroLetras];

        for (int i = 0; i < palabraGuiones.length; i++) {
            palabraGuiones[i] = '_';
        }
        return palabraGuiones;
    }

    static boolean hayGuiones(char[] array) {
        for (char l : array) {
            if (l == '_') {
                return true;
            }
        }
        return false;
    }
}
