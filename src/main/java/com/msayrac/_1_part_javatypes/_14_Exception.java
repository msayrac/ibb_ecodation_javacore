package com.msayrac._1_part_javatypes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class _14_Exception {

    public static void dateMethod() {

        Date date = new Date();
        System.out.println("1 Ocak 1970 den şu ana kadar geçen mili saniye : " + date.getTime());
        System.out.println("Day : " + date.getDate());
        System.out.println("Month : " + date.getMonth());
        System.out.println("Year : " + date.getYear());
        System.out.println("Hours : " + date.getHours());
    }

    public static String nowFormat1() {

        Date now = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String formatedDate = String.format("Şimdiki Zaman", sdf.format(now));
        return new Date().toString() + " " + formatedDate;


    }


    public static void main(String[] args) {

//        dateMethod();
        System.out.println(nowFormat1());


    }

}
