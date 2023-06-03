/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog05_tareacoche;

import java.time.LocalDate;

/**
 *
 * @author David
 */
public class Confirmacion {

    public static boolean kmPositivo(int num) {
        if (num > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean fechaMayor(LocalDate fecha) {
        LocalDate hoy = LocalDate.now();

        if (hoy.isBefore(fecha)) {
            return true;
        } else {
            return false;
        }
    }
}
