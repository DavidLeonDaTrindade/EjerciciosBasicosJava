/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamesmain;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class JuegoNumeroSecreto implements IGames {
    
    @Override
    public void inicio() {
        System.out.println("El juego se esta iniciando...");
        System.out.println("-----------------------------------");
    }

    @Override
    public void desarrollo() {
        Scanner teclado = new Scanner(System.in);
        boolean salir = true;//ASIGNAMOS AL LA VARIABLE BOOLEAN EL VALOR DE TRUE
        boolean finalizar = true;//ASIGNAMOS A LA VARIABLE BOOLEAN EL VALOR DE TRUE
        int numeroAleatorio = 0;//ASIGNAMOS LAS VARIABLES DE TIPO ENTERO
        int numeroAcertar = 0;//ASIGNAMOS LAS VARIABLES DE TIPO ENTERO
        int numeroIntroducido = 0;//ASIGNAMOS LAS VARIABLES DE TIPO ENTERO
        int intentosIntroducidos = 0;//ASIGNAMOS LAS VARIABLES DE TIPO ENTERO
        int intentosUsados = 0;//ASIGNAMOS LAS VARIABLES DE TIPO ENTERO
            do {//INICIAMOS EL MENU
            System.out.println("*************************");
            System.out.println("selecciona una opción");//INDICAMOS AL USUARIO QUE SELECCIONE UNA OPCION COMPRENDIDA ENTRE EL 1 Y EL 3
            System.out.println("1 configurar");//EN CONFIGURAR TENDREMOS EL PRIMER VALOR
            System.out.println("2 jugar");//EN JUGAR TENEMOS EL SEGUNDO VALOR
            System.out.println("3 salir");//EN SALIR SE TERMINARIA EL BUCLE Y TERMINARIA EL PROGRAMA
            System.out.println("*************************");
            int opcion = teclado.nextInt();//ALMACENAMOS LA SELECCION DEL USUARIO
            switch (opcion) {//INICIALIZAMOS EL BUCLE CON EL VALOR SELECCIONADO POR EL USUARIO
                case 1://EN EL PRIMER CASE ALMACENAMOS LA CONFIGURACION DE NUESTRO JUEGO
                    System.out.println("introduce el numero máximo de intentos");//IMPRIMIMOS POR CONSOLA CUANTOS INTENTOS QUIERE EL JUGADOR
                    intentosIntroducidos = teclado.nextInt();//ALMACENAMOS EN LA VARIABLE INTENTOS SIN INTRODUCIDOS EL VALOR QUE ELIJA EL USUARIO
                    System.out.println("introduce el numero maximo de tu juego");//SOLICITAMOS EL NUMERO MAXIMO DEL JUEGO
                    numeroAleatorio = teclado.nextInt();//ALMACENAMOS EL NUMERO MAXIMO 
                    break;//CERRAMOS EL CASE 1
                case 2:

                    numeroAcertar = (int) (Math.random() * (numeroAleatorio + 1));//GENERAMOS UN NUMERO ALEATORIO COMPRENDIDO ENTRE 0 Y EL NUMERO QUE ELIJIO EL USUARIO EN EL CAMPO ANTERIOR
                    intentosUsados = 0;//REINICIAMOS LA VARIABLE INTENTOS USADOS 
                    salir = true;//SALIMOS DEL CASO DOS POR QUE YA TENEMOS LO QUE NOS INTERESA QUE ERA ASIGNAR UN VALOR ALEATORIO AL NUMERO A ACERTAR
                    do {
                        if (intentosIntroducidos == intentosUsados) {//SI INTENTOS INTRODUCIDOS ES IGUAL A INTENTOS USADOS EL PROGRAMA FINALIZARA
                            System.out.println("has agotado tus intentos, usaste: " + intentosUsados);//IMPRIMIMOS EL MENSAJE HAS AGOTADO TUS INTENTOS 
                            salir = false;//FINALIZAMOS EL PROGRAMA
                        } else {
                            System.out.println("------------------------");
                            System.out.println("¿Que numero cres que es?");//PREGUNTAMOS AL JUGADOR QUE NUMERO CREE QUE ES
                            numeroIntroducido = teclado.nextInt();//EL JUGADOR INTRODUCE NUMEROS PARA INTENTAR ACEPTAR EL NUMERO ALEATORIO
                            intentosUsados++;//INTENTOS USADOS AUMENTA EN 1 SU VALOR
                            if (numeroIntroducido == numeroAcertar) {//SI EL NUMERO QUE EL USUARIO UTILIZA ES EL MISMO QUE EL GENERADO ALEATORIAMENTE ABRAS GANADO
                                System.out.println("Felicidades has ganado has usado " + intentosUsados + " intentos");//IMPRIME EL RESULTADO DE QUE HAS GANADO CONCATENADO DE LOS INTENTOS 
                                salir = false;//FINALIZA EL PROGRAMA

                            } else if (numeroIntroducido < numeroAcertar) {//AQUI TENEMOS PISTAS SI EL NUMERO INTRODUCIDO ES MENOR AL NUMERO A ACERTAR INDICAMOS AL USUARIO QUE ES NUMERO ES MAYOR
                                System.out.println("el numero es mayor al introducido");//IMPRIME Y DA UNA PEQUEÑA PISTA AL USUARIO
                            } else {//SI EL NUMERO ES MENOR AL INTRODUCIDO LE DAREMOS LA PISTA AL JUGADOR DE QUE EL NUMERO INTRODUCIDO ES MENOR
                                System.out.println("el numero es menor al introducido");//IMPRIME LA PISTA PARA QUE EL JUGADOR SEPA QUE EL NUMERO ES MENOR
                            }
                        }
                    } while (salir);//TERMINA EL CASE 2
                    break;
                case 3:
                    System.out.println("Has decidido salir");//SI EL JUGADOR DECIDE SALIR EL PROGRAMA FINALIZA
                    finalizar = false;
                    break;
                default:
                    System.out.println("Opción incorrecto");//SI DECIDE PONER UN VALOR DIFERENTE A LOS PREVIO DARA UN MENSAJE DE ERROR
                    System.out.println("Elija de nuevo");//INDICAMOS AL USUARIO QUE ELIJA OTRO VALOR
            }
        } while (finalizar);

    }

    @Override
    public void fin() {
        System.out.println("Fin del juego espero que lo hayas disfrutado");
    }

}
