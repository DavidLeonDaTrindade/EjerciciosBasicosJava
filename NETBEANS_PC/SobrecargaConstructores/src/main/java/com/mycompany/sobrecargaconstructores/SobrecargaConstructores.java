/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sobrecargaconstructores;
import com.mycompany.sobrecargaconstructores.Profesor;
/**
 *
 * @author David
 */
public class SobrecargaConstructores {

    public static void main(String[] args) {
        Profesor matematicas = new Profesor("Juan", "Lopez", 35, true, true);
        Profesor ingles = new Profesor();
        matematicas.DatosProfesor();
        ingles.DatosProfesor();
    }
}
