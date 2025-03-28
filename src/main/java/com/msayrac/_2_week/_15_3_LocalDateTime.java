package com.msayrac._2_week;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class _15_3_LocalDateTime {

    public static void localDateFormatMethod() {

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("Şu andaki zaman : " + now);

        System.out.println(" Formatted Zaman : "+ now.format(formatter));


    }


    public static void main(String[] args) {


        Formatter data= new Formatter();

        data.format("Merhaba : %s , Yas %d","Ali",44);

        System.out.println(data);
        data.close();

//        Garbage Collector

    }


}
