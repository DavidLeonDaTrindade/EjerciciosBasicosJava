/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concesionario;

import java.util.ArrayList;

/**
 *
 * @autho David
 */
public class Concesionario {

    //establecemos los atributos de la clase 
    String nombre;
    ArrayList<Coche> coches = new ArrayList<>();
    int maximoCoches = 2;

    //constructor con solo el nombre del concesionario
    public Concesionario(String nombre) {
        this.nombre = nombre;
    }

    //constructor con nombre mas primer coche a introducir
    public Concesionario(String nombre, Coche coche) {
        this.coches.add(coche);
        this.nombre = nombre;
    }

    //Metedo en el que añadimos coches al array establecido en la clase (maximo de coches esteblecido en los atributos)
    public void addCoche(Coche coche) {
        if (this.coches.size() < maximoCoches) {
            this.coches.add(coche);
        } else {
            System.out.println("No disponemos de mas espacio para vehiuculos maximo 50");
        }
    }
    
    //Este metodo permite actualizar un coche pasando todos los datos "esto se podria dividir en metodos como: actualizarMatricula, ActualizarMarca, ActualizarPrecio"
    public void actualizarCoche(String matricula, String matriculaNueva, String marca, double precio){
        for (Coche coche : coches) {
            if (coche.getMatricula().equals(matricula)) {
                coche.setMatricula(matriculaNueva); 
                coche.setMarca(marca);
                coche.setPrecio(precio);
            }else{
                System.out.println("Esa matricula no se encuentra entre nuestros vehiculos");
            }
        }
    }
 
    //Este metodo permite eliminar un coche introduciendo su matricula
    public void eliminarCoche(String matricula) {
        for (Coche coche : this.coches) {
            if (coche.getMatricula().equals(matricula)) {
                this.coches.remove(coche);
                break;
            }else{
                System.out.println("Esa matricula no se encuentra entre nuestros vehiculos");
            }
        }
    }
    
    public void listarCoche(){
        for(int i = 0; i<coches.size(); i++){
            System.out.println("La lista de coches del consecionario es: " + coches.get(i));
        }
    }

}
