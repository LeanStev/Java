        
package com.mycompany.ejercicion_en_clase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

   /*Debemos entregar un trabajo para una distribuidora de productos
    por lo que vamos a generar un programa que genere diferentes tipos de operaciones.
    Tenemos 2 tipos de productos: Perecederos y No Perecederos.
    
    1- Crear una clase Producto que cuente con los siguentes atributos: String nombre,
    double precio, no olvidarse de agregar métodos getters y setters y redefinir el método 
    toString(). Crear en esta clase el método calcular() el cual va a recibir por parametro
    de tipo entero llamado cantidadDeProductos; este metodo tiene que multiplicar el metodo 
    por la cantidad de productos recibidos.
    
    2-Crear la clase Perecedero que tiene un atributo diasPorCaducar de tipo entero y al igual
    que producto tiene getters, setters, constructor y metodo toString. Esta clase debe ser subclase
    de producto y sobrescribir el metodo calcular(), el cual tiene que hacer lo mismo que la clase Producto
    y adicionalmente reduce el precio segun los diasPorCaducar:
        .- Si le resta un dia para caducar, se reducirá 4 veces el precio final.
        .- Si le restan dos dias para caducar, se reducirá 3 veces el precio final.
        .- Si le restan tres dias para caducar, se reducirá a la mitad el precio final.
    
    3-Crear la clase NoPerecedero, la misma va a tener un atributo llamado "tipo", que es un String
    (crear todos los métodos). En esta clase el método calcular hará lo mismo que en Producto.
    
    4-Crear un array en Main de productos e imprimir el precio total al vender 5 productos de cada tipo.*/
       
    public static void main(String[] args) {
        
        Scanner opcion = new Scanner(System.in);
        Scanner cantidad = new Scanner(System.in);
        double cuenta = 0;
        
      List<Productos> productos = new ArrayList();
      productos.add( new Perecedero(1,"Queso",500));
      productos.add( new NoPerecederos("Enlatados","Lentejas",150));
      productos.add( new Perecedero(2,"Milanesa",900));
      productos.add( new NoPerecederos("Enlatados","Arvejas",200));
      productos.add( new Productos("Coca-Cola",450));
      productos.add (new Perecedero (2,"Pure de tomate",250));
      productos.add(new Productos("chupetin",20));
      
       
        menu(productos);
        Integer opc = opcion.nextInt();
        
        while (opc !=7){
            switch(opc){
                case 0:
                    System.out.println("Ingrese la cantidad:");
                    int cant = cantidad.nextInt();
                    cuenta += productos.get(opc).calcular(cant);
                    break;
                case 1:
                    System.out.println("Ingrese la cantidad:");
                    cant = cantidad.nextInt();
                    cuenta += productos.get(opc).calcular(cant);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad:");
                    cant = cantidad.nextInt();
                    cuenta += productos.get(opc).calcular(cant);
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad:");
                    cant = cantidad.nextInt();
                    cuenta += productos.get(opc).calcular(cant);
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad:");
                    cant = cantidad.nextInt();
                    cuenta += productos.get(opc).calcular(cant);
                    break;
                case 5:
                    System.out.println("Ingrese la cantidad:");
                    cant = cantidad.nextInt();
                    cuenta += productos.get(opc).calcular(cant);
                    break;
                 case 6:
                    System.out.println("Ingrese la cantidad:");
                    cant = cantidad.nextInt();
                    cuenta += productos.get(opc).calcular(cant);
                    break;
                default:
                    break;
            }
            
                menu(productos);
                opc = opcion.nextInt();
            
        }
        
        System.out.println("Usted debe pagar  la cuenta: $"+cuenta);
        
    }
    
    private static void menu(List<Productos> productos){
        for (int i = 0; i < productos.size(); i++) {
                System.out.println(i+"-"+productos.get(i));           
               }
                System.out.println("7-salir");
                System.out.println("Seleccionar un producto mediante el numero que lo antecede");
        
    }
}
