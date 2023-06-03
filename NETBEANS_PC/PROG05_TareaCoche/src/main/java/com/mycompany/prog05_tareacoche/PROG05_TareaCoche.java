/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prog05_tareacoche;
import java.util.Scanner;
import com.mycompany.prog05_tareacoche.Coche;
import com.mycompany.prog05_tareacoche.Confirmacion;
import java.time.LocalDate;
import java.time.Month;
/**
 *
 * @author David
 */
public class PROG05_TareaCoche {

    public static void main(String[] args) {
        boolean finalizar = true;
        Scanner teclado = new Scanner(System.in);
        Coche coche1 = new Coche ();
        int dia, mes, anio;
       
        
        do{
            System.out.println("*************************");
            System.out.println("selecciona una opción");
            System.out.println("1. Nuevo Vehiculo");
            System.out.println("2. Ver Matricula");
            System.out.println("3. Ver numero de kilometros");
            System.out.println("4. Actualizar kilometros");
            System.out.println("5. Ver años de antigüedad");
            System.out.println("6. Mostrar propietario");
            System.out.println("7. Mostrar descripcion");
            System.out.println("8. Mostrar precio");
            System.out.println("9. Salir");
            System.out.println("*************************");
            int opcion = teclado.nextInt();
            
            switch (opcion){
                case 1:
                    
                    try {
                    teclado.nextLine();
                    System.out.println("Introduce la marca del coche:");
                    coche1.marca = teclado.nextLine();
                    
                     System.out.println("la marca es "+ coche1.marca);    
                    
                   
                    System.out.println("Introduce la matricula:");
                    coche1.matricula = teclado.nextLine();
                    System.out.println("Introduce los kilometros:");
                    coche1.Kilometros = teclado.nextInt();
                    
                    if(!Confirmacion.kmPositivo(coche1.Kilometros)){
                        throw new Exception("Los kilometros introducidos no son positivos");
                    }
                    System.out.println("Introduce el dia de matriculacion:");
                    dia = teclado.nextInt();
                    System.out.println("Introduce el mes de de matriculacion");
                    mes = teclado.nextInt();
                    System.out.println("introduce el año de matriculacion");
                    anio = teclado.nextInt();
                    
                    coche1.fechaMatricula = LocalDate.of(anio, mes,dia);
                   
                    System.out.println("Introduce el precio del coche:");
                    coche1.precio = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Introduce el nombre del propietario:");
                    coche1.nombrePropietario = teclado.nextLine();
                    System.out.println("Introduce el dni del propietario:");
                    coche1.dni = teclado.nextLine();
                    }catch(Exception e){
                        
                    }
                    
                    
                break;
                
                case 2:
                    if( coche1.marca == null){
                        System.out.println("Primero debes crear un coche");
                    }else
                    coche1.Datosmatricula();
                break;
                
                case 3:
                    if(coche1.Kilometros == 0){
                        System.out.println("Primero debes crear un coche");
                    }else
                    coche1.Datoskilometros();
                break;
                
                case 4:
                    System.out.println("Actualiza los kilometros ");
                break;
                
                case 5:
                    coche1.Datosantigüedad();
                break;
                
                case 6:
                    coche1.DatosPropietario();
                break;
                
                case 7:
                    coche1.DatosDescripcion();
                break;
                
                case 8:
                    coche1.DatosPrecio();
                break;
                
                case 9:
                    System.out.println("Has decidido salir");
                    finalizar = false;
                break;
                default:
                    System.out.println("Numero incorrecto");
                    System.out.println("Elija otro numero");
                    
       
            }
        }while(finalizar);
  }
}
    

