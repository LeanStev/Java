/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author lean
 */
public class Main {
    
   public static void main (String[]args){ 
       
       Messi m = new Messi (new Manchester());
       m.mostrarEquipo();
       
       Messi ms = new Messi (new Juventus());
       ms.mostrarEquipo();
   }
    
}
