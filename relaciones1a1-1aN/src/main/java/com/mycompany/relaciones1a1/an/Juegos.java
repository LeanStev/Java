
package com.mycompany.relaciones1a1.an;

public class Juegos {
    
    private Long idJuego;
    private String nombreJuego;
   

    public Juegos() {
    }

    public Juegos(Long idJuego, String nombreJuego, String liga) {
        this.idJuego = idJuego;
        this.nombreJuego = nombreJuego;
        
    }

    public Long getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(Long idJuego) {
        this.idJuego = idJuego;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

   

  

    @Override
    public String toString() {
        return nombreJuego ;
    }

    
}
