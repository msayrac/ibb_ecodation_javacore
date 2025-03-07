package com.msayrac._1_part_javatypes;

public class _14_Exception {

    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 0;

        try {
            int result = num1 / num2;
            System.out.println(result);
        } catch (ArithmeticException ai) {
//            ai.printStackTrace();
        }
        finally {
            System.out.println("son  satır");
        }

    }

}
