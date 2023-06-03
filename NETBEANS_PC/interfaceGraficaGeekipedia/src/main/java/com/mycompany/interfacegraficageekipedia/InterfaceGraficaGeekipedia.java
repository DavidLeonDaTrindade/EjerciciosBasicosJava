/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.interfacegraficageekipedia;
import javax.swing.*;//importamos todos los elementos de la libreria
/**
 *
 * @author David
 */
public class InterfaceGraficaGeekipedia extends JFrame {
    private JLabel label1;
    private JLabel label2;
    
    
    public InterfaceGraficaGeekipedia(){
        setLayout(null);//metodo para poder colocar elementos dentro de la interface
        //añadir comentario o etiquetas en la interface grafica
        label1 = new JLabel("Interface Grafica");
        label1.setBounds(10, 20, 300, 30);
        add(label1);
        label2 = new JLabel("Version 1.0");
        label2.setBounds(10, 100, 100, 30);
        add(label2);
                
    }

    public static void main(String[] args) {
        //creamos el objeto 
        InterfaceGraficaGeekipedia InterfaceGraficaGeekipedia1 = new InterfaceGraficaGeekipedia();
        //colocamos las coordenadas de la interface grafica
        InterfaceGraficaGeekipedia1.setBounds(650, 300,800 , 650 );
        //este metodo es para que la interface grafica se muestre 
        InterfaceGraficaGeekipedia1.setVisible(true);
        //con este metodo indicamos que siempre salga en el centro de la pantalla
        InterfaceGraficaGeekipedia1.setLocationRelativeTo(null);
        //este metodo es para que no se pueda modificar la interface en tamaño pero si en posicion
        InterfaceGraficaGeekipedia1.setResizable(false);
    }
}
