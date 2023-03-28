
package com.mycompany.ejercicion_en_clase;

//    1- Crear una clase Producto que cuente con los siguentes atributos: String nombre,
//    double precio, no olvidarse de agregar métodos getters y setters y redefinir el método 
//    toString(). Crear en esta clase el método calcular() el cual va a recibir por parametro
//    de tipo entero llamado cantidadDeProductos; este metodo tiene que multiplicar el metodo 
//    por la cantidad de productos recibidos.

public class Productos {
    private String nombre;
    protected double precio;

    public Productos(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Productos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    //metodo toString
    @Override
    public String toString() {
        return "Productos{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }

   public double calcular(int cantidadDeProductos){
       return precio*cantidadDeProductos;
   }

  
}
