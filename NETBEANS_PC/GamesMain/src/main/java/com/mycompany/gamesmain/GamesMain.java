
package com.mycompany.gamesmain;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class GamesMain {

    public static void main(String[] args) {
        int opcion;
        boolean salir =true;
        Scanner teclado = new Scanner(System.in);
        JuegoDados juego1 = new JuegoDados();
        JuegoNumeroSecreto juego2 = new JuegoNumeroSecreto();
        JuegoAhorcado juego3 = new JuegoAhorcado();
        do{
            System.out.println("1. Juego de los dados");
            System.out.println("2. Adivina el numero secreto");
            System.out.println("3. Juega al ahorcado");
            System.out.println("4. Salir");
            opcion = teclado.nextInt();
            teclado.nextLine();
            
            switch (opcion){
                case 1:
                    juego1.inicio();
                    juego1.desarrollo();
                    juego1.fin();
                    break;
                case 2:
                    juego2.inicio();
                    juego2.desarrollo();
                    juego2.fin();
                    break;
                case 3:
                    juego3.inicio();
                    juego3.desarrollo();
                    juego3.fin();
                    break;
                case 4:
                    salir = false;
                    break;
            }
        }while(salir);
    }
}
