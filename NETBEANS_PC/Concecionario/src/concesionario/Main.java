/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concesionario;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean salir = true;
        Concesionario volkswagen = new Concesionario("volkswagen");
        Scanner sc = new Scanner(System.in);
        int dia, mes, anio;
        LocalDate fechaMatriculacion;
        int kilometros;
        String nombProp, dni;
        int opcion;
        do {
            System.out.println("1 - introducir vehiculo");
            System.out.println("2 - Listar vehiculo");
            System.out.println("3 - actulizar vehiculo");
            System.out.println("4 - borrar vehiculo");
            System.out.println("5 - salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                //introducimos los datos pidiendoselos al usuario y creamos un coche que luego añadimos a la lista que se encuentra dentro del concesionario
                case 1:
                    System.out.println("Introduce matricula");
                    String matricula = sc.nextLine();
                    System.out.println("Introduce marca");
                    String marca = sc.nextLine();
                    System.out.println("Introduce precio");
                    int precio = sc.nextInt();
                    System.out.println("Introduce el dia de la fecha de matriculacion");
                    dia = sc.nextInt();
                    System.out.println("Introduce el mes de la fecha de matriculacion");
                    mes = sc.nextInt();
                    System.out.println("Introduce el año de la fecha de matriculacion");
                    anio = sc.nextInt();
                    fechaMatriculacion = LocalDate.of(anio, mes, dia);
                    System.out.println("Introduce el numero de kilometros: ");
                    kilometros = sc.nextInt();
                    System.out.println("Introduce el nombre del propietario: ");
                    nombProp = sc.next();
                    System.out.println("Introduce el dni del propietario ");
                    dni = sc.next();
                    
                    
                    
                    //Creamos los diferentes con el mismo nombre de variable, lo que nos interesa es hacer un "new" para que nos asiggne un nuevo espacio de memoria
                    Coche coche = new Coche(marca, matricula, kilometros, fechaMatriculacion, precio, nombProp, dni);
                    volkswagen.addCoche(coche);
                    break;

                case 2:
                    volkswagen.listarCoche();
                    break;
                //pedimos que introduzca la matricula para verificar que coche queremos eliminar si existe lo eliminamos
                case 3:
                    System.out.println("Introduzca la matricula del coche que desea actualizar");
                    String matriculaBuscar = sc.next();
                    
                    System.out.println("Introduzca la matricula nueva o la misma si no desea cambiarla");
                    String matriculaNueva = sc.next();
                   
                    System.out.println("Introduzca la marca nueva o la misma si no desea cambiarla");
                    String marcaNueva = sc.next();
                    
                    System.out.println("Introduzca el precio nuevo o el mismo si no desea cambiarlo");
                    double precioNuevo = sc.nextInt();
                    volkswagen.actualizarCoche(matriculaBuscar, matriculaNueva, marcaNueva, precioNuevo);
                    break;

                // caso para eliminar los vehiculos 
                case 4:
                    System.out.println("Introduzca la matricula del coche que desea eliminar");
                    String matriculaBusqueda = sc.nextLine();        
                    volkswagen.eliminarCoche(matriculaBusqueda);
                    break;
                    //caso para poder salir
                case 5:
                    salir = false;
                    break;
                default:
                    throw new AssertionError();
            }
        } while (salir);

        //Esto es un foreach extrae los objetos uno por uno de dentro de una lista en este caso un arrayList
        for (Coche coche1 : volkswagen.coches) {
            System.out.println(coche1.getMarca());
        }

    }

}
