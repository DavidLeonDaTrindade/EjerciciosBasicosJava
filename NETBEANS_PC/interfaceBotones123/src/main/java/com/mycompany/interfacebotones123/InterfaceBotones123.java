/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.interfacebotones123;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author David
 */
public class InterfaceBotones123 extends JFrame implements ActionListener {
    private JButton boton1,boton2,boton3;
    private JLabel label1;
    
    public InterfaceBotones123(){
        setLayout(null);
        boton1 = new JButton("1");
        boton1.setBounds(10,100,90,30);
        add(boton1);
        boton1.addActionListener(this);
        
        boton2 = new JButton("2");
        boton2.setBounds(110,100,90,30);
        add(boton2);
        boton2.addActionListener(this);
        
        boton3 = new JButton("3");
        boton3.setBounds(210,100,90,30);
        add(boton3);
        boton3.addActionListener(this);
        
        label1 = new JLabel("en espera...");
        label1.setBounds(10, 10, 300, 30);
        add(label1);
         }
    
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == boton1){
                label1.setText("has presionado el boton 1");
            }if(e.getSource() == boton2){
                label1.setText("has pulsado el boton 2");
            }if(e.getSource() == boton3){
                label1.setText("has pulsado el boton 3");
            }
        }
        
   
    public static void main(String[] args) {
        InterfaceBotones123 botones = new InterfaceBotones123();
        botones.setBounds(0, 0, 350, 200);
        botones.setVisible(true);
        botones.setResizable(false);
        botones.setLocationRelativeTo(null);
    }
}
