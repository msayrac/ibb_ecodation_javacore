package com.msayrac._1_part_javatypes;

public class _14_Casting {

    public static void main(String[] args) {

        //    casting bir verinin baska veriye donusmesine casting denir

        int cast1int = 100;
        double cast1double = cast1int;
        System.out.println(cast1double);
        int cast2int = 12152154;
        byte cast2Byte = (byte) cast2int;
        System.out.println(cast2Byte);

        char cast3 = 'A';
        int asciiChar = cast3;
        System.out.println(asciiChar);

        int cast4 = 38;
        char asci4 = (char) cast4;
        System.out.println(asci4);

        String cast5 = "10";
        System.out.println(cast4 + 20);

        int cast5int = Integer.valueOf(cast5);
        System.out.println(cast5int + 10);

        int cast6 = Integer.parseInt(cast5);
        System.out.println(cast6+40);

        int cast7 = 55;
        String cast7string =String.valueOf(cast7);
        System.out.println(cast7string+ " ali");

        String cast8string=String.valueOf(cast7);
        System.out.println(cast8string+ " ****************");

    }


}
