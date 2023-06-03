/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica24udemy;

/**
 *
 * @author david
 */
public abstract class Legislador extends Persona{
    private String provincia;
    private String partidoPo;
    private int numeroDespacho;
    
    public Legislador(){
        
    }
    public Legislador(String nombre,String apellidos, int edad, boolean casado,String provincia,String partidoPo,int numeroDespacho){
        super(nombre,apellidos,edad,casado);
        this.provincia = provincia;
        this.partidoPo = partidoPo;
        this.numeroDespacho = numeroDespacho;
    }
    public abstract  void getCamaraEnQueTrabaja();

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPartidoPo() {
        return partidoPo;
    }

    public void setPartidoPo(String partidoPo) {
        this.partidoPo = partidoPo;
    }

    public int getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setNumeroDespacho(int numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }
    
    
}
