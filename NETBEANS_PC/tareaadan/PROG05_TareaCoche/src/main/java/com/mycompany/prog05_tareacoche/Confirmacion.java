/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog05_tareacoche;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 *
 * @author David
 */

public class Confirmacion {
  private static final Pattern REGEXP = Pattern.compile("[0-9]{8}[A-Z a-z]");
  private static final String DIGITO_CONTROL = "TRWAGMYFPDXBNJZSQVHLCKEtrwagmyfpdxbnjzsqvhlcke";
  private static final String[] INVALIDOS = new String[] { "00000000T", "00000001R", "99999999R" };

    public static boolean kmPositivo(int num) {
        if (num > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean fechaMayor(LocalDate fecha){
        
        LocalDate hoy = LocalDate.now();
        
        if(hoy.isBefore(fecha)){
            return true;
        }else{ 
            return false;
        }
        
    }
    
   
        
    public static boolean validarDNI(String dni) {
    return Arrays.binarySearch(INVALIDOS, dni) < 0 // (1)
	    && REGEXP.matcher(dni).matches() // (2)
        && dni.charAt(8) == DIGITO_CONTROL.charAt(Integer.parseInt(dni.substring(0, 8)) % 23); // (3)
        
        
        
    }
    
}