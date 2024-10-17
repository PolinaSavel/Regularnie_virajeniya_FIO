package org.example;
//Proverka na validnost telefona
//Proverka na validnost FIO

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vvedite vash nomer telefona pojaluysta v formate: +7 (XXX) XXX-XX-XX ");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        proverkaNomera(number);

        System.out.println("Vvedite vash FIO: ");
        String fIO = scanner.nextLine();
        proverkaFIO(fIO);
    }

    public static void proverkaNomera(String number) {

        boolean proverkaValidnostiNomera = number.matches("(\\+7)\\s([(]*\\d{3}[)]*)\\s(\\d{3}-*\\d{2}-*\\d{2})");

        if (proverkaValidnostiNomera) {
            System.out.println("Vash nomer phone: " + number);
        } else {
            System.out.println(" It is not a phone number! ");
        }
    }

    private static void proverkaFIO(String fIO) {
        boolean proverkaFIO = fIO.matches("([À-ß¨][à-ÿ¸]+(-[À-ß¨][à-ÿ¸]+)?)[ ]([À-ß¨][à-ÿ¸]+)[ ]([À-ß¨][à-ÿ¸]+)");

        if (proverkaFIO) {
            System.out.println("Vashi FIO: " + fIO);
        } else {
            System.out.println(" It is not a FIO! ");
        }
    }
}
