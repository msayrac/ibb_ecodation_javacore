package com.msayrac;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bİr sayı giriniz :");

        int number = scanner.nextInt();
//        int number = 4;

        if (number == 1) {
            System.out.println("sayi 1");
        } else if (number == 2) {
            System.out.println("Sayi 2");
        } else if (number == 3) {
            System.out.println("Sayi 3");

        } else if (number == 4) {
            System.out.println("Sayi 4");

        } else if (number == 5) {
            System.out.println("Sayi 5");
        } else {
            System.out.println(number + " 1<=nmber <=5 dışındadır");
        }


        switch (number) {

            case 1:
                System.out.println("satı 1");
                break;
            case 2:
                System.out.println("sayı 2");
                break;
            case 3:
                System.out.println("sayı 3");
                break;
            case 4:
                System.out.println("Sayi 4");
                break;
            case 5:
                System.out.println("sayi 5");
                break;
            default:
                System.out.println("sayı 1 ve 5 dısındadır");
                break;


        }


    }
}