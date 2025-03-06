package com.msayrac._1_part_javatypes;

public class _10_loops {

    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            System.out.print(i + "-");

        }

        //sonsuzluk göndüsü
//        for(;;){}
        int i = 0;
        while (i < 5) {
            System.out.println(i + " while");
            i++;
        }

        // do while sart saglansın ya da saglanmasın 1 kere calısır
        i = 10;
        do {
            System.out.println(i + " do while");
            i++;

        } while (i < 5);


    }
}
