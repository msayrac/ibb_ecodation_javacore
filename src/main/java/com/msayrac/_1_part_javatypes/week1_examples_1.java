package com.msayrac._1_part_javatypes;

import java.util.Scanner;

public class week1_examples_1 {

    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);
        double aValue, bValue, result;

        System.out.println("Please enter a values : ");
        aValue = sc.nextDouble();
        System.out.println("Please enter b values : ");
        bValue = sc.nextDouble();

        result = (-bValue / aValue);

        System.out.println(result);

        sc.close();

    }

}
