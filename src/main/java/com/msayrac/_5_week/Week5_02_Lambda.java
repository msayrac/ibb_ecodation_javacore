package com.msayrac._5_week;

@FunctionalInterface
interface MyFunctionalInterface {
    void showMessage(String message);
}


public class Week5_02_Lambda {
    public static void main(String[] args) {

        MyFunctionalInterface messagePrinter = (String message) -> System.out.println("Mesaj : " + message);
        messagePrinter.showMessage("Merhaba Lambda!");

    }


}
