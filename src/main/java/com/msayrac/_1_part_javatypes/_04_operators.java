package com.msayrac._1_part_javatypes;

public class _04_operators {

    public static void main(String[] args) {
        // Operators
//    + - * / % ++ --
        int number1=10, number2=20;

        int addition =number1 + number2;
        int subtraction =number1 - number2;
        int multiplication =number1 * number2;
        int division =number1 / number2;
        int mod =number1 % number2;

        System.out.println("Toplama :" + addition);
        System.out.println("Çıkarma :" + subtraction);
        System.out.println("Çarpma :" + multiplication);
        System.out.println("Bölme :" + division);
        System.out.println("Kalan :" + mod);

        // Mantıksal Operators : &&=ve ||=veya !=değil

        // ++--> bir artır -- --> bir azalt

        int number11=10;
        number11++;
        int number22=10;
        ++number22;

        System.out.println(number11);
        System.out.println(number22);

        // Math static fonksiyonlar olarak gelir hazır degerler

        System.out.println(Math.min(2,3));
        System.out.println(Math.max(2,3));

        System.out.println(Math.abs(-5));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.sqrt(Math.abs(-25)));
        System.out.println(Math.pow(-2,2));
        System.out.println(Math.floor(4.7));
        System.out.println(Math.ceil(4.7));
        System.out.println(Math.round(10.7));
        System.out.println(Math.round(10.2));

        System.out.println(Math.sin(30));
        System.out.println(Math.cos(30));
        System.out.println(Math.tan(30));

        System.out.println(Math.PI);
        System.out.println(Math.E);


        //Escape character


        System.out.println("This is a \"escape\" character in java");







    }

}
