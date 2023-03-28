
package com.mycompany.ejercicion_en_clase;


public class NoPerecederos extends Productos {
    private String tipo;

    public NoPerecederos(String tipo, String nombre, double precio) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    public NoPerecederos() {
     
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    
    
}
