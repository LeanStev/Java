/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author lean
 */
public class Messi {
    private IEquipo equipo;
    
    public Messi (IEquipo equipo){
        this.equipo= equipo;
    }
    public void mostrarEquipo(){
        equipo.mostrar();
    }
}
