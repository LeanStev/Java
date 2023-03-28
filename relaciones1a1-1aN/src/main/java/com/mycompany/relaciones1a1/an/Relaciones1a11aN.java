/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.relaciones1a1.an;

import java.util.ArrayList;
import java.util.List;




public class Relaciones1a11aN {

    public static void main(String[] args) {
       
        Jugadores jugador = new Jugadores();
        Jugadores jugador2 = new Jugadores();
        Jugadores jugador3 = new Jugadores();
        
        jugador.setId(1L);
        jugador.setNombre("Raul");
        jugador.setNickName("Ralux");
        jugador.setLiga("Bronce");
        
         jugador2.setId(2L);
        jugador2.setNombre("Juan");
        jugador2.setNickName("Pan");
        jugador2.setLiga("Platino");
        
         jugador3.setId(3L);
        jugador3.setNombre("Fran");
        jugador3.setNickName("MilanesaRadioactiva");
        jugador3.setLiga("Diamante");
       
        
            ////////////////////////
        
        List<Juegos> listaDeJuegos = new ArrayList<Juegos>();
      
        Juegos juego = new Juegos();
       Juegos juego2 = new Juegos();
       Juegos juego3 = new Juegos();
       Juegos juego4 = new Juegos();
       
       juego.setIdJuego(1L);
       juego.setNombreJuego("League of Legends");
       
       juego2.setIdJuego(2L);
       juego2.setNombreJuego("RockLeague");
       
       juego3.setIdJuego(3L);
       juego3.setNombreJuego("Overwatch");
       
       juego4.setIdJuego(4L);
       juego4.setNombreJuego("Counter Strike GO");
        
       listaDeJuegos.add(juego);
        listaDeJuegos.add(juego2);
         listaDeJuegos.add(juego3);
          listaDeJuegos.add(juego4);
        
       jugador.setListaDeJuegos(listaDeJuegos);
       jugador2.setListaDeJuegos(listaDeJuegos);
       jugador3.setListaDeJuegos(listaDeJuegos);
       
       ////////////////////////
       
        System.out.println("Jugador: " + jugador.getNombre() + " / " + "Liga: " + jugador.getLiga() + " / " + "juegos: "+ jugador.geLlistaDeJuegos() + " " );
         System.out.println("Jugador: " + jugador2.getNombre() + " / " + "Liga: " + jugador2.getLiga() + " / " + "juegos: "+ jugador2.geLlistaDeJuegos() + " " );
          System.out.println("Jugador: " + jugador3.getNombre() + " / " + "Liga: " + jugador3.getLiga() + " / " + "juegos: "+ jugador3.geLlistaDeJuegos() + " " );
       
       
        
        
        
        
        
        
        
        
        
    }
}
