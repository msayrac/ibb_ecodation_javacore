package com.msayrac;

import AracMusteri.Arac;
import AracMusteri.Musteri;
import com.msayrac._1_part_javatypes._01_JavaPsvm;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        Arac arac = new Arac("Toyota", "Corolla", 2022, 110);
//        Musteri musteri = new Musteri("Ahmet", "Yılmaz", 100, arac);
//        arac.bilgileriGoster();
//        musteri.bilgileriGoster();
//        musteri.bakiyeYeterliMi();
//        musteri.bilgileriGoster();
//        musteri.getBakiye();

        Scanner sc = new Scanner(System.in);

        System.out.println("Bir sayı giriniz :");

        int number = sc.nextInt();
//        int number = 1;
        switch (number) {
            case 1:
                System.out.println("Sayı 1 ");
                break;
            case 2:
                System.out.println("sayı 2");
            case 3:
                System.out.println("satı 3");
                break;
            case 4:
                System.out.println("Sayı 4");
                break;
            case 5:
                System.out.println("Sayı 5");
                break;
            default:
                System.out.println("Sayı 1 ve 5 dısındadır");
                break;
        }


    }
}