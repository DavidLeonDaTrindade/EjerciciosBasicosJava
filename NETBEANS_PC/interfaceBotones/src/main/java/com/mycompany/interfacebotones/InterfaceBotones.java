/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.interfacebotones;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author David
 */
public class InterfaceBotones extends JFrame implements ActionListener {
        JButton boton1;
public InterfaceBotones(){
    setLayout(null);
    boton1 = new JButton("Cerrar");
    boton1.setBounds(300, 250, 100, 30);
    add(boton1);
    boton1.addActionListener(this);
}
public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1){
        System.exit(0);
    }
}
    public static void main(String[] args) {
        //creamos el objeto
        InterfaceBotones botones = new InterfaceBotones();
        //colocamos las coordenadas de la interface grafica
        botones.setBounds(0, 0, 450, 350);
        //este metodo es para que la interface grafica sea visible
        botones.setVisible(true);
        //con este metodo siempre saldra nuestra interface grafica en el centro de la pantalla
        botones.setLocationRelativeTo(null);
        //con este metodo el usuario no puede modificar el tamaño de nuestra interface grafica
        botones.setResizable(false);
    }


}
