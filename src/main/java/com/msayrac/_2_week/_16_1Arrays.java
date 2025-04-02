package com.msayrac._2_week;

import java.util.Scanner;

public class _16_1Arrays {

    public static String[] arrayMethod1() {

        String[] city = new String[6]; // Elemans sayısı : 5
        city[0] = "Malatya";
        city[1] = "Elazığ";
        city[2] = "Bingöl";
        city[3] = "Muş";
        city[5] = "Van";


        return city;
    }

    public static void arrayMethod2() {
        String[] city = arrayMethod1();

        for (String temp : city) {
            System.out.println(temp);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a positfe number : ");
        int number =sc.nextInt();
        int fac=1;

        for (int i = 1; i <= number; i++) {
            fac*=i;
        }
        System.out.println(fac);


    }
}
