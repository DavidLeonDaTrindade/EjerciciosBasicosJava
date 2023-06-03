/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bancosl;
import com.mycompany.bancosl.Banco;
import com.mycompany.bancosl.CuentaCorriente;
/**
 *
 * @author David
 */
public class BancoSl {
//METODO MAIN
    public static void main(String[] args) {
        //OBJETOS TIPOS BANCOS
        Banco banco1 = new Banco("Santander",800,"C/La Ola nº5");
        Banco banco2 = new Banco("CajaSiete", "La Cuesta");
        //OBJETO TIPO CUENTA CORRIENTE
        CuentaCorriente cuenta1 = new CuentaCorriente("David",00120204155,banco1);
        CuentaCorriente cuenta2 = new CuentaCorriente("cecilia", 588462145);
        //METODOS PARA MOSTRAR LOS BANCOS Y LAS CUENTAS DE LOS TITULARES
        banco1.Saldo();
        banco2.Saldo();
        cuenta1.DatosTitular();
        cuenta2.DatosTitular();
    }
    
 
}
