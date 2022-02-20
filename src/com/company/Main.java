package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

/*
principal: 100000
anual interest rate: 3.92
period (years): 30
Mortgage: $472.81
*/


public class Main {

    public static void main(String[] args) {


        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("anual interest rate: ");
        float anualInterest = scanner.nextFloat();
        float monthlyInterest = anualInterest / PERCENT/ MONTHS_IN_YEAR;

        System.out.print("period (years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal *
                (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)/ (Math.pow(1 + monthlyInterest, numberOfPayments) -1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}

