/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author david
 */
public class Colecciones {
    
    public static void main(String[] args) {

        //set             -->   No admite elementos repetidos
        //HashSet    -->   No van por orden
        Set<String> conjunto1 = new HashSet<String>();
        conjunto1.add("Hola");
        conjunto1.add("adios");
        for (String s : conjunto1) {
            System.out.println(s);
        }

        //list  --> Estan ordenados
        //ArrayList
        List<Libro> conjunto2 = new ArrayList<Libro>();
        Libro libro1 = new Libro();
        Libro libro2 = new Libro();
        conjunto2.add(libro1);
        System.out.println(conjunto2.indexOf(libro1));
        System.out.println(conjunto2.size());
        for (Libro l : conjunto2) {
            System.out.println(l.toString());
        }

        //Map  --> interface Map
        //HashMap
        Map<String, Libro> conjunto3 = new HashMap<String, Libro>();
        conjunto3.put("elemento1", libro1);
        conjunto3.put("elemento2", libro2);
        conjunto3.get("elemento1");
        for (String clave : conjunto3.keySet()) {
            Libro l = (Libro) conjunto3.get(clave);
            System.out.println(l.toString());
        }
    }
}
