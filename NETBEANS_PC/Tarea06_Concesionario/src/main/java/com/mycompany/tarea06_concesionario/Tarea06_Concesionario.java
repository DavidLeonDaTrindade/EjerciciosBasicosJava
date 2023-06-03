/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tarea06_concesionario;

import java.util.Locale;
import java.util.Scanner;
import com.mycompany.tarea06_concesionario.Vehiculo;
/**
 *
 * @author David
 */
public class Tarea06_Concesionario {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        teclado.useDelimiter("\n");
        teclado.useLocale(Locale.US);
        int opcion;
        int kms;
        
        Concesionario concesionario = new Concesionario();
        String matricula;
        Vehiculo v;
        
        
        while (!salir) {

            System.out.println("1. Nuevo vehiculo");
            System.out.println("2. Listar vehiculo");
            System.out.println("3. Buscar vehiculo");
            System.out.println("4. Modificar vehiculo");
            System.out.println("5. Salir");
            opcion = teclado.nextInt();
            switch (opcion) {

                case 1:

                    break;
                case 2:
                    concesionario.listarVehiculos();
                    break;
                case 3:
                     System.out.println("Inserta la matricula");
                     matricula = teclado.nextLine();
                     
                     v = concesionario.buscaVehiculo(matricula);
                     if (v != null){
                    System.out.println(v.getMarca());
                    System.out.println(v.getMatricula());
                    System.out.println(v.getPrecio());
                }else{
                        System.out.println("No existe el vehiculo con la matricula introducida");
                        }
                    break;
                case 4:
                    System.out.println("Inserta la matricula");
                    matricula = teclado.nextLine();
                    System.out.println("Inserta los nuevos kilometros");
                     kms = teclado.nextInt();
                     if(concesionario.actualizaKms(matricula, kms)){
                      System.out.println("sea ha actualizado correctamente");
                }else{
                        System.out.println("No existe el vehiculo con la matricula introducida");
                        }

                    break;
                case 5:
                    salir = true;
                    break;
            }

        }

    }
}
