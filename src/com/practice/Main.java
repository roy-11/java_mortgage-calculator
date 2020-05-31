package com.practice;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("ローンの金額: ");
        int principal = scanner.nextInt();

        System.out.print("年利: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("期間(年数): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest,numberOfPayments))
                / (Math.pow(1 + monthlyInterest,numberOfPayments));

        String mortageFormatted = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("住宅ローン: " + mortageFormatted);
    }
}
