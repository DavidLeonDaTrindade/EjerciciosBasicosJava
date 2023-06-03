/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_geki_ernesto;

/**
 *
 * @author David
 */
public class EJERCICIO_GEKI_ERNESTO {

    public static void main(String[] args) {
        int i;
            System.out.println("serie con for: ");
            for(i = 1; i <= 10; i++){//ESTRUCTURA DEL FOR DONDE INICIA INDICA LA CONDICION Y EL INCREMENTO
                 if(i<10){//ESTRUCTURA DE IF DENTRO DEL FOR PARA INDICAR QUE MIENTRAS SEA MENOR A 10 IMPRIMA EL VALOR DE LA I MAS LA ,
                     System.out.print(i + ",");//IMPRIME VALOR DE I MAS LA ,
                 } else {//CUANDO EL VALOR DE I ES MAYOR O IGUAL A 10 ENTRA EL ELSE POR LO TANTO SOLO IMPRIME EL VALOR DE I SIN LA COMA
                     System.out.print(i);//IMPRIME EN CONSOLA EL VALOR DE I
                 }
            }
         i = 1;   //VOLVEMOS A INDICAR QUE I VALE 1
         System.out.println("");//PONEMOS ESTO PARA TENER UN SALTO DE LINEA
         
         System.out.println("serie con while: ");//INDICAMOS QUE VAMOS A REALIZAR LA SERIE CON WHILE
         while(i <= 10) {// INDICAMOS LA CONDICION DEL WHILE QUE ES MENOR O IGUAL A 10
             if(i < 10){//COLOCAMOS UN IF DENTRO DEL WHILE PARA QUE SIEMPRE QUE I SEA MENOR A 10 IMPRIMA EL VALOR DE LA I MAS LA ,
                 System.out.print(i + ",");//IMPRIME EL VALOR DE LA I MAS LA ,
             } else {//CUANDO EL VALOR DE I SEA IGUAL A 10 ENTRA EL ELSE Y SOLO IMPRIME EL VALOR DE LA I
                 System.out.print(i);//IMPRIME EL VALOR DE LA I
             }
             i++;//COMO EN LOS METODOS WHILE EL INCREMENTO VA FUERA AQUI LE INDICAMOS QUE I SUMA DE UNO EN UNO
           }
         i = 1;//VOLVEMOS A DECIR QUE EL VALOR DE I ES 1 
         System.out.println(" ");
          System.out.println("serie con do-while: ");//DECIMOS AL USUARIO QUE VAMOS A USAR LA ESTRUCTURA DO-WHILE
          do{//INICIAMOS LA ESTRUCTURA DO
           if(i < 10){//LE DECIMOS AL PROGRAMA CON UN IF QUE MIENTRAS EL VALOR SEA MENOR A 10 DEBE IMPRIMIR I MAS LA ,
                 System.out.print(i + ",");// LE DECIMOS AL PROGRAMA QUE IMPRIMA LA I MAS LA ,
             } else {//CON EL ELSE INDICAMOS QUE CUANDO EL VALOR DE I SEA MAYOR A 10 SOLO IMPRIMA EL VALOR DE LA I SIN LA COMA
                 System.out.print(i);// IMPRIME LA COMA
             }
             i++;//COLOCAMOS EL INCREMENTO DEL  WHILE-DO
          }while( i <= 10 );//INDICAMOS QUE EL EJERCICIO TERMINA CUANDO EL VALOR DE LA I SEA MAYOR O IGUAL A 10
        }
    }

