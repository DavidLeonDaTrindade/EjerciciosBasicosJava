/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.practica21udemy;

/**
 *
 * @author david
 */
public class Practica21Udemy {

    public static void main(String[] args) {

        Libro l1 = new Libro(88311, "titulo1", "autor1", 101);
        Libro l2 = new Libro(88312, "titulo2", "autor2", 102);
        Libro l3 = new Libro(88313, "titulo3", "autor3", 103);
        
        //Libro[ ] libros = {l1,l2,l3};
        Libro[] libros = new Libro[3];
        libros[0] = l1;
        libros[1] = l2;
        libros[2] = l3;
        
        Libro mayorPag = l1;
        for(Libro l:libros){
            System.out.println(l.toString());
            if(l.getPaginas()> mayorPag.getPaginas()){
                mayorPag = l;
            }
        }
        System.out.println("El libro con mas paginas es " + mayorPag.getTitulo());
    }
}
