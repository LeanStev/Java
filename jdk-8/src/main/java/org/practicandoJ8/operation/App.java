package org.practicandoJ8.operation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public void ordenar() {
    	List<String> lista = new ArrayList<>();
    	lista.add("Holajuan");
    	lista.add("Mono");
    	lista.add("Monito");
    	
    	
    	Collections.sort(lista,(String p1, String p2)-> p1.compareTo(p2));
    	
    	for(String elemento : lista) {
    		System.out.println(elemento);
    	}
    }
    
    public void calcular() {
//    	Operation operation = new Operation() {
//    		
//    		@Override
//    		public double calcularPromedio (double n1, double n2) {
//    			return (n1+n2)/2;
//    		}
//    	};
    
    	Operation operation = (double x, double y) -> (x+y)/2;
    	System.out.print(operation.calcularPromedio(2, 5));
    	 

    }
    
	public static void main(String[] args) {
        
    	App app = new App();
    	app.ordenar();
    	
    	app.calcular();
        
    };
};