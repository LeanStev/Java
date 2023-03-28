
package com.mycompany.relaciones1a1.an;

import java.util.List;



public class Jugadores {
    
    private Long id;
    private String nombre;
    private String nickName;
    private String liga;
    private List<Juegos> listaDeJuegos;

    
    public Jugadores() {
    }

    public Jugadores(Long id, String nombre, String nickName,String liga , List<Juegos> listaDeJuegos) {
        this.id = id;
        this.nombre = nombre;
        this.nickName = nickName;
        this.liga = liga;
        this.listaDeJuegos = listaDeJuegos;
    }

    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public List<Juegos> geLlistaDeJuegos() {
        return listaDeJuegos;
    }

    public void setListaDeJuegos(List<Juegos> listaDeJuegos) {
        this.listaDeJuegos = listaDeJuegos;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "id=" + id + ", nombre=" + nombre + ", nickName=" + nickName + ", liga=" + liga + ", juegos=" + listaDeJuegos + '}';
    }

    
    
    
    
    
    
    
}
