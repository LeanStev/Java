
package com.mycompany.ejercicion_en_clase;

//heredamos los atributos de la clase productos, ya que la clase
//perecederos tiene relacion con la clase productos
public class Perecedero extends Productos {
    
    private int diasPorCaducar;

    public Perecedero(int diasPorCaducar, String nombre, double precio) {
        super(nombre, precio);
        this.diasPorCaducar = diasPorCaducar;
    }

    public Perecedero() {
 
    }

    public int getDiasPorCaducar() {
        return diasPorCaducar;
    }

    public void setDiasPorCaducar(int diasPorCaducar) {
        this.diasPorCaducar = diasPorCaducar;
    }
    
    @Override
    public double calcular(int cantidadDeProductos){
        double subtotal = precio*cantidadDeProductos;
        switch(diasPorCaducar){
            case 1:
                return subtotal*0.25;
               
            case 2:
                return subtotal*0.33;       
            case 3:
                return subtotal*0.5;
            default:
                return precio;
                
        }
//     if (diasPorCaducar==1){
//         return precio*0.25;
//     }
//     else if  (diasPorCaducar==2){
//         return precio*0.25;
//     }
//        return 0;

    }
    
}
