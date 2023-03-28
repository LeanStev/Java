package org.lambaANDapistream;



import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.lambaANDapistream.model.Person;
import org.lambaANDapistream.model.Product;

public class App {
    public static void main(String[] args) {

        Person p1 = new Person(1,"Leandro", LocalDate.of(1995,12,25));
        Person p2 = new Person(2,"Juan", LocalDate.of(1997,7,20));
        Person p3 = new Person(3,"Franco", LocalDate.of(1999,1,14));
        Person p4 = new Person(4,"Roberto", LocalDate.of(2009,3,9));
        Person p5 = new Person(5,"Jartin", LocalDate.of(2010,9,3));

        Product pr1 = new Product(1,"Atun", (long) 15.20);
        Product pr2 = new Product(2,"Arroz", (long) 15.20);
        Product pr3 = new Product(3,"Pollo", (long) 24.20);
        Product pr4 = new Product(4,"Tomate", (long) 35.20);
        Product pr5 = new Product(4,"Tomate", (long) 35.20);

        List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5);
        List<Product> products = Arrays.asList(pr1,pr2,pr3,pr4,pr5);

        //Programacio imperativa
      /*  for (int i = 0; i<persons.size(); i++){
            System.out.println(persons.get(i));
        }

        for (Person p : persons) {
            System.out.println(p);

        }*/
        //Expresion lambda

           //persons.forEach(p -> System.out.println(p) );
          System.out.println("\n");
        //Metodos a referencia, programacion reactiva
          //persons.forEach(System.out::println);


 // 1-Filter (param : predicate)
        List<Person> filteredList = persons.stream()
                .filter(p -> App.getAge(p.getBirthDate())>=18)
                .collect(Collectors.toList());

        //App.printList(filteredList);

// 2-Map (param : function) Metodo map transforma los elemenos del stream, de la coleccion
        // transforma los datos de un tipo A a un tipo B

        Function<String, String> stevFunction = name -> "stev " + name;
        List<String> filteredList2 = persons.stream()
                //.filter(p -> getAge(p.getBirthDate()) >=18)
                //.map(p -> App.getAge(p.getBirthDate()))
                //.map(p -> p.getName())
                .map(Person::getName)
                .map(stevFunction)
                .collect(Collectors.toList());
            //filteredList2.forEach(System.out::println);

        //Sorted (Param : Comparator)Compara 2 tipos de parametros de un objeto
        // Requiere crear un Comparator para que generar la comparacion fuera del stream
        Comparator<Person> byNameAsc = (Person obj1,Person obj2) -> obj1.getName().compareTo(obj2.getName());
        Comparator<Person> byNameDes = (Person obj1,Person obj2) -> obj2.getName().compareTo(obj1.getName());
        List<Person> filteredList3 = persons.stream()
                .sorted(byNameDes)
                .sorted(byNameAsc)
                .collect(Collectors.toList());
            //filteredList3.forEach(System.out::println);

//Math
        Predicate <Person> mathCondition = p-> p.getName().startsWith("K");

        //anyMath: No evalua todo el contenido del stream, termina en la concidencia<<<
        boolean rpta1 = persons.stream()
                .anyMatch(mathCondition);
            //System.out.println(rpta1);

        //allMath: Evalua que todos empiecen con el parametro que establezco "J"
        boolean rpta2 = persons.stream()
                .allMatch(mathCondition);
            //System.out.println(rpta2);

        //noneMath: Evalua que ninguno conincida con el parametro que le paso "K"
        boolean rpta3 = persons.stream()
                .noneMatch(mathCondition);
            //System.out.println(rpta3);

//Skip / Limit : Sirve por ej para hacer paginacion
        int pageNumber = 2;
        int pageSize = 2;
        List<Person> filteredList4 =  persons.stream()
                .skip(pageNumber* pageSize)
                .limit(pageSize)
                .collect(Collectors.toList());

            //filteredList4.forEach(System.out::println);

//Collectors
        //GroupBy
        //Dependiendo de que queres retornar en el Map aclaramos el tipo de retorno
    Map<String, List<Product>> collect1 =  products.stream()
                .filter(p-> p.getProductPrice() > 20)
                .collect(Collectors.groupingBy(Product ::getProductName));

            //System.out.println(collect1);

        //Counting
        //usamos groupBy y le decimos que haga un contador cuando se repita un objeto.
                Map<String,Long> collect2 = products.stream()
                        .collect(Collectors.groupingBy(
                        Product::getProductName,Collectors.counting()
                        ));
            //System.out.println(collect2);

        //Agrupando por nombre y sumando
        Map<String,Long> collect3 = products.stream()
                .collect(Collectors.groupingBy(
                        Product::getProductName,
                        Collectors.summingLong(Product::getProductPrice)
                        )
                    );
            //System.out.println(collect3);

        //Obteniendo suma y resumen : Retorna un SumamryStatics
           LongSummaryStatistics result =  products.stream()
                .collect(Collectors.summarizingLong(Product::getProductPrice));
        System.out.println(result);

//Reduce: Retorna un opcional
        Optional<Long> suma =  products.stream()
                .map(Product::getProductPrice)
                .reduce(Long::sum);

        System.out.println("La suma de los productos son: " + suma.get());


    }



    public static int getAge(LocalDate birthDate){
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public static void printList (List<?> list){
        list.forEach(System.out::println);
    }

}