package com.stev;

import java.time.LocalDate;
import java.util.*;

public class App {

    //Invertir una cadena
    private void m1InvertirString(String text){
        /*String[] array = text.split("");
        StringBuilder newtext = new StringBuilder();

        for (int i = array.length; i >0; i--){
            newtext.append(array[i-1]);
        }
        System.out.println(newtext);*/

        /*String newtext = new StringBuilder(text).reverse().toString();
        System.out.println(newtext);*/

    }

    private void m2IsCapicua(int number){
       /* String numberText = String.valueOf(number);
        String reverseNumber = new StringBuilder(numberText).reverse().toString();

        if (numberText.equals(reverseNumber)){
            System.out.println("El numero es capicua");
        }else {
            System.out.println("El numero no es capicua");
        }*/
    }

    //Que me diga cuantos caracteres se repite en un string
    private void m3CountCharTimes(String text){
       /* int i,lenght,counter[] = new int [256];

        lenght = text.length();
        for (i = 0; i < lenght; i++){
            counter[text.charAt(i)]++;
        }
        for (i = 0; i < 256; i++){
            if (counter[i] != 0){
                System.out.println((char)i + ": " + counter[i] );
            }
        }*/
    }
    private void m4CharRepeat(String text){
     /*   int i,lenght,counter[] = new int [256];

        lenght = text.length();
        for (i = 0; i < lenght; i++){
            counter[text.charAt(i)]++;
        }
        for (i = 0; i < 256; i++){
            if (counter[i] > 1){
                System.out.println((char)i + ": " + counter[i] );
            }
        }*/
    }

    private void m5IsMultipleof2(int number){
       /* if (number % 2 == 0){
            System.out.println("el numero es multiplo de 2");
        }else {
            System.out.println("El numero no es multiplo de 2");
        }*/
    }

    private void m6Isbiciesto(int year){
   /*     boolean isLoopYear =  LocalDate.of(year, 1,1).isLeapYear();
        System.out.println(isLoopYear);*/
    }

    private void m7RandomString(String text){
       /* String [] array = text.split("");
        List<String> list = Arrays.asList(array);
        Collections.shuffle(list);
        list.forEach(System.out::println);*/
    }

    private void m8OnlyNotDuplicate(List<Integer> list){
      /*  Set<Integer> set = new HashSet<>(list);
        set.forEach(System.out::println);*/

    }

    private void m9HayVolca(String text){
        String[] array = text.split("");
        boolean isPresent = false;
        for ( String s : array){
            if(s.equals("a")|| s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")){
                isPresent = true;
                break;
            }

        } System.out.println(isPresent);
        //otra forma
        boolean result = text.matches(".*[aeiou].*");
        System.out.printf(String.valueOf(result));

    }

    private void m10Palindrome(String text){
        String numberText = String.valueOf(text);
        String reverseNumber = new StringBuilder(numberText).reverse().toString();

        if (numberText.equals(reverseNumber)){
            System.out.println("la palabra es palindromo");
        }else {
            System.out.println("La palabra no es palindromo");
        }
    }

    public static void main(String[] args) {

        App app = new App();
        //app.m1InvertirString("juan");
        //app.m2IsCapicua(353);
        //app.m3CountCharTimes("trestristestigrestragantrigoenuntrigal");
        //app.m4CharRepeat("saramalacara");
        //app.m5IsMultipleof2(17);
        //app.m6Isbiciesto(2020);
        //app.m7RandomString("VillaVicencio");
        //app.m8OnlyNotDuplicate(Arrays.asList(1,5,3,1,5,4,1,8,1,3,5,4,9));
        //app.m9HayVolca("jsjs");
        app.m10Palindrome("");

    }

}
