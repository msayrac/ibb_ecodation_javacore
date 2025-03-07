package com.msayrac._1_part_javatypes;

public class _12_String {
    public static void main(String[] args) {

        String vocabulary = new String("Java Öğreniyorum");


        String vocabulary1 = new String();
        vocabulary1 = " Java Öğreniyorum ";

        System.out.println(5==5);
        System.out.println(vocabulary==vocabulary1);
        System.out.println(vocabulary.equals(vocabulary1));

//        charAt
        System.out.println(vocabulary1.charAt(0));

        System.out.println(vocabulary1.trim());

        System.out.println(vocabulary.toUpperCase());
        System.out.println(vocabulary.toLowerCase());

        System.out.println(vocabulary1.endsWith(" "));

        System.out.println(vocabulary1.substring(2,5));

        //Contains

        String name = "Java Öğreniyorum";

        System.out.println(name.contains("Java"));

        System.out.println("Degistir"+ name.replace("Java",".net"));

        System.out.println(name.concat(" 2025"));

        System.out.println(name.hashCode());














    }
}
