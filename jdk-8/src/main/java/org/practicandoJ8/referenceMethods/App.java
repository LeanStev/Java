package org.practicandoJ8.referenceMethods;


import java.util.Arrays;
import java.util.Comparator;

public class App {

    public static void referenciarMetodosStatics() {
        System.out.println("Metodo estatico referenciado");
    }

    public void referenciarMetodoInstanciaObjetoArbitrario(){
        String [] nombres = {"tulio","herman","Alejandro"};
      /*  Arrays.sort(nombres, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });*/

        //Arrays.sort(nombres,(s1,s2 )-> s1.compareToIgnoreCase(s2));
        Arrays.sort(nombres, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(nombres));

    }
    public void referenciaMetodoInstanciaObjetoParticular(){
        System.out.println("Metodo referido de una clase");
    }
    public void referenciarConstructor(){

        IPersona iper = new IPersona(){
            @Override
            public Persona crear (int id, String nombre){
                return new Persona (id,nombre);
            }
        };
        Persona per2 = iper.crear(1,"juan");
        System.out.println(per2.getId()+ " - "+ per2.getNombre());

        IPersona iper2 = (x,y) -> (new Persona(x,y));
        Persona per = iper2.crear(2,"Pablo");
        System.out.println(per.getId()+ " - "+ per.getNombre());

        IPersona iper3 = Persona::new;
        Persona per3  = iper3.crear(3,"segundo");
        System.out.println(per3.getId()+ " - "+ per3.getNombre());








    }
    public void operar() {
        //Operation op = () -> App.referenciarMetodosStatics();
       // op.saludar();

            //Referencia metodo estatico
        Operation op2 = App::referenciarMetodosStatics;
        op2.saludar();




    }

    public static void main(String[] args) {

        App app = new App();
       // app.operar();
       // app.referenciarMetodoInstanciaObjetoArbitrario();

        Operation op = app::referenciaMetodoInstanciaObjetoParticular;
        op.saludar();
        app.referenciarConstructor();

    }
}