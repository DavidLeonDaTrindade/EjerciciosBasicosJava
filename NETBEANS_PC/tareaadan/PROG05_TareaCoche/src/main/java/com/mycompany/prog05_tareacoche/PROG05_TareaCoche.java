/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prog05_tareacoche;
import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDate;
/**
 *
 * @author David
 */
public class PROG05_TareaCoche {

    public static void main(String[] args) {

    	Scanner teclado = new Scanner(System.in);
        //DOS METODOS DE LA CLASE SCANNER PARA EL CORRECTO FUNCIONAMIENTO DEL PROGRAMA
        teclado.useDelimiter("\n");
        teclado.useLocale(Locale.US);
        //VARIABLES DE CONTROL DEL BUCLE + VARIABLE OPCION PARA CONTROLAR EL MENU
        boolean salir = false;
        int opcion;
        Coche coche1 = null;
        //VARIABLES QUE VAMOS A USAR EN EL EJERCICIO
        String marca, matricula, nombreProp, dni, descripcion;
        int kilometros, dia, mes, anio;
        double precio;
        LocalDate fechaMatriculacion;
    	//BUCLE DONDE SE ENCONTRARA TODO EL CUERPO DEL EJERCICIO
    	while (!salir) {
            //INICIO DEL MENU
            try {
                System.out.println("1. Nuevo Vehiculo.");
                System.out.println("2. Ver Matrícula.");
                System.out.println("3. Ver Número de Kilómetros.");
                System.out.println("4. Actualizar Kilómetros.");
                System.out.println("5. Ver años de antigüedad.");
                System.out.println("6. Mostrar propietario.");
                System.out.println("7. Mostrar descripción.");
                System.out.println("8. Mostrar Precio.");
                System.out.println("9. Mostrar datos alumno.");
                System.out.println("10. Salir.");
                System.out.println("Elige una opcion");
                opcion = teclado.nextInt();
                //FIN DEL MENU
				switch (opcion) {
                    case 1:

                        System.out.println("Introduce la marca");
                        marca = teclado.next();

                        System.out.println("Introduce la matricula");
                        matricula = teclado.next();

                        System.out.println("Introduce el numero de km");
                        kilometros = teclado.nextInt();
                        //METODO CREADO PARA QUE SOLO SE LE PUEDAN COLOCAR KM EN POSITIVO
                        if (!Confirmacion.kmPositivo(kilometros)) {
                            throw new Exception("km no es positivo");
                        }

                        System.out.println("Introduce el dia de la fecha de matriculacion");
                        dia = teclado.nextInt();

                        System.out.println("Introduce el mes de la fecha de matriculacion");
                        mes = teclado.nextInt();

                        System.out.println("Introduce el año de la fecha de matriculacion");
                        anio = teclado.nextInt();

                        fechaMatriculacion = LocalDate.of(anio, mes, dia);

                        if (Confirmacion.fechaMayor(fechaMatriculacion)) {
                            throw new Exception("fecha matriculacion es mayor que hoy");
                        }

                        System.out.println("Introduce la descripcion del vehiculo");
                        descripcion = teclado.next();

                        System.out.println("Introduce el nombre del propietario");
                        nombreProp = teclado.next();

                        System.out.println("Introduce el dni del propietario");
                        dni = teclado.next();

                        if (!Confirmacion.validarDNI(dni)) {
                            throw new Exception("DNI no valido");
                        }

                        System.out.println("Introduce el precio");
                        precio = teclado.nextDouble();

                        coche1 = new Coche(marca, matricula, kilometros, fechaMatriculacion, precio,  nombreProp, dni, descripcion);
                        System.out.println("Vehiculo creado");

                        break;

                    case 2:
                        if (coche1 != null) {
                            System.out.println("La matricula es: " + coche1.getMatricula());
                        } else {
                            System.out.println("Debes crear un vehiculo");
                        }
                        break;

                    case 3:

                        if (coche1 != null) {
                            System.out.println("Tiene: " + coche1.getKilometros() + " KM");
                        } else {
                            System.out.println("Debes crear un vehiculo");
                        }
                        break;

                    case 4:

                        if (coche1 != null) {

                            System.out.println("Introduce el numero de km");
                            kilometros = teclado.nextInt();

                            if (!Confirmacion.kmPositivo(kilometros)) {
                                throw new Exception("km no es positivo");
                            }
                            
                            coche1.setKilometros(kilometros);
                            System.out.println("KM actualizados");

                        } else {
                            System.out.println("Debes crear un vehiculo");
                        }

                        break;

                    case 5:
                        
                        if (coche1 != null) {
                            System.out.println("Antiguedad: " + coche1.get_Anios() + " años");
                        } else {
                            System.out.println("Debes crear un vehiculo");
                        }
                        
                        break;

                    case 6:

                        if (coche1 != null) {
                            System.out.println("El propietario es: " + coche1.getNombrePropietario() + " y su DNI es: " + coche1.getDni());
                        } else {
                            System.out.println("Debes crear un vehiculo");
                        }
                        break;

                    case 7:
                        
                        if (coche1 != null) {
                            System.out.println("Descripcion: " + coche1.getDescripcion());
                            System.out.println("Matricula: " + coche1.getMatricula());
                            System.out.println("KM: " + coche1.getKilometros());
                        } else {
                            System.out.println("Debes crear un vehiculo");
                        }
                        
                        break;

                    case 8:

                        if (coche1 != null) {
                            System.out.println("El precio es de : " + coche1.getPrecio() + "€");
                        } else {
                            System.out.println("Debes crear un vehiculo");
                        }
                        break;
                    case 9:
                        if (coche1 == null) {
                            System.out.println("Primero debes crear un coche");
                        } else {
                           coche1.DatosAlumno();
                        }
                    break;
                    case 10:
                        salir = true;
                        break;
                    default:
                        System.out.println("Elige una opcion entre 1 y 10");
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
    

