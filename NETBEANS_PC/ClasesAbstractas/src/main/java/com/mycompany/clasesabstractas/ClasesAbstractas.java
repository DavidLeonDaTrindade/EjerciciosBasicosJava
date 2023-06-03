/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.clasesabstractas;

/**
 *
 * @author david
 */
public class ClasesAbstractas {

    public static void main(String[] args) {
        /*Figura f1 = new Figura("Triangulo");
        Figura f2 = new Figura("Cuadrado");
        f1.decirNombre();
        f2.decirNombre();*/

        Cuadrado c1 = new Cuadrado("Cuadrado", 5);
        Triangulo t1 = new Triangulo("triangulo", 3, 5);

        System.out.println(c1.area());
        System.out.println(c1.perimetro());

        System.out.println(t1.area());
        System.out.println(t1.perimetro());

        Figura f = new Cuadrado("cuadrado", 6);
        Figura f2 = new Triangulo("triangulo", 2, 5);
        Figura f3 = new Triangulo("triangulo", 6, 5);
        Figura f4 = new Triangulo("triangulo", 1, 5);
        Figura f5 = new Cuadrado("cuadrado1", 3);
        Figura[] figuras = new Figura[5];

        System.out.println(f.area());
        
        figuras[0] = f;
        figuras[1] =f2;
        figuras[2] =f3;
        figuras[3] =f4;
        figuras[4] =f5;
        System.out.println("#######################");
        for(Figura fig: figuras){
            System.out.println(fig.perimetro());
        }
        
    }
}
