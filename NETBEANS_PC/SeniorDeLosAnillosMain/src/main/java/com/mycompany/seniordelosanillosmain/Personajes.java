/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seniordelosanillosmain;

import java.util.Random;

/**
 *
 * @author David
 */
public class Personajes {

    private int vitalidad, fisico, fuerza, resistencia, nivel;
    private String nombre;
    private Random rand = new Random(System.nanoTime());

    // Ataques
    public int ataqueFisico() {
        int aleatorio = rand.nextInt(2);
        return nivel * fisico * aleatorio;
    }

    public int ataqueFuerza() {
        if (resistencia > 0) {
            resistencia--;
            return nivel * fuerza;
        } else {
            return 0;
        }
    }

    public void danio(int vitalidad) {
        this.vitalidad -= vitalidad;
    }

    public int getVitalidad() {
        return vitalidad;
    }

    public void setVitalidad(int vitalidad) {
        this.vitalidad = vitalidad;
    }

    public int getFisico() {
        return fisico;
    }

    public void setFisico(int fisico) {
        this.fisico = fisico;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }

}
