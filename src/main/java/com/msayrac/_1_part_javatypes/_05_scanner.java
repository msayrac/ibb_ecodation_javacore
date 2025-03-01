package com.msayrac._1_part_javatypes;

import java.util.Scanner;

public class _05_scanner {
    public static void main(String[] args) {

        String name, surname;

        Scanner klavye = new Scanner(System.in);

        System.out.println("Lütfen adınızı giriniz :");
        name = klavye.nextLine();

        System.out.println("Lütfen soyadınızı giriniz :");
        surname = klavye.nextLine();

        //kullanmadıgım scanner nesnesini kapat
        klavye.close();



    }
}
