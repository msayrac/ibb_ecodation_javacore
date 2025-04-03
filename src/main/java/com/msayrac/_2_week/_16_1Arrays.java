package com.msayrac._2_week;

import java.util.Scanner;

public class _16_1Arrays {

    public static int recursiveFactorial(int n) {
        if(n==0 || n==1){
            return 1;
        }
        return n*recursiveFactorial(n-1);
    }


    public static void main(String[] args) {

        System.out.println(recursiveFactorial(5));

    }
}
