/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_geki_interface;
import javax.swing.*;
/**
 *
 * @author David
 */
public class EJERCICIO_GEKI_INTERFACE extends JFrame{
    private JLabel label1;
    
    public EJERCICIO_GEKI_INTERFACE(){
        setLayout(null);
        label1 = new JLabel("LaGeekipedia");
        label1.setBounds(10,20,200,300);
        add(label1);
    }
    
    public static void main(String args[ ]){
        EJERCICIO_GEKI_INTERFACE formulario = new EJERCICIO_GEKI_INTERFACE();
        formulario.setBounds(0,0,400,300);
        formulario.setVisible(true);
        formulario.setLocationRelativeTo(null);
    }
}

   