/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancosl;

import com.mycompany.bancosl.Banco;

/**
 *
 * @author David
 */
public class CuentaCorriente {
//ATRIBUTOS DE LA CUENTACORRIENTE
    String Titular;
    int NumeroCC;
    Banco Banco;

    //CONTRUCTOR INCOMPLETO DONDE EL BANCO PUEDE SER DE TIPO NULL
    public CuentaCorriente(String Titular, int NumeroCC) {
        this.Titular = Titular;
        this.NumeroCC = NumeroCC;
        this.Banco = null;
    }
//CONTRUCTOR COMPLETO DONDE CADA OBJETO TIENE QUE SER CREADO CON TODOS LOS ATRIBUTOS

    public CuentaCorriente(String Titular, int NumeroCC, Banco Banco) {
        this.Titular = Titular;
        this.NumeroCC = NumeroCC;
        this.Banco = Banco;
    }
//METODO PARA DETERMINAR SI LA CUENTA CORRIENTE TIENE O NO ASOCIADA UN BANCO
    public void DatosTitular() {
        if (this.Banco == null) {
            System.out.println("El nombre del titulas es: " + this.Titular + " el numero de cuenta es " + this.NumeroCC + " y no esta asociado a ningun banco");
        } else {
            System.out.println("El nombre del titulas es: " + this.Titular + " el numero de cuenta es " + this.NumeroCC + " y el banco asociado es " + this.Banco.nombre);
        }
    }
}
