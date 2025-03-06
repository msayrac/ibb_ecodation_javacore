package com.msayrac._1_part_javatypes;

import java.util.Scanner;

public class _11_Return_Continue_break {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number ");
        int number = sc.nextInt();

//        int number = 100;
        int sum = 0;

        for (int i = 1; i <= number + 1; i++) {

            if (i == 47) {
                System.out.println(i + " Verdiginiz sayıda toplamaya dahil edilmedi");
                continue; // 47 toplama dahil etme
            }

            if (i > 100) {
                System.out.println("Verdiginiz sayı 100 den buyuk old ıcın sadeece 1 ile 100 e kadar topkama yapabılır");
                break;
            }
            sum += i;
        }

        if(sum%2==0){
            System.out.println(sum +" even");
        }else{
            System.out.println(sum +" odd");
        }




    }
}
