package com.kiranthepro;

import java.util.Scanner;

public class Main {

    static final double VAT = 1.20;

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        doCalculation(scanner);
    }

    public static void doCalculation(Scanner scanner) {
        System.out.println("Enter an amount: ");
        double amount = scanner.nextFloat();
        System.out.println("Your price + VAT is £" + amount*VAT);
        checkForAnother(scanner);
    }

    public static void checkForAnother(Scanner scanner) {
        System.out.println("Do another calculation? (y/n)");
        String input = scanner.next();

        if (input.equalsIgnoreCase("y")) {
            doCalculation(scanner);
        } else if (input.equalsIgnoreCase("n")) {
            System.out.println("Okay, goodbye.");
        } else {
            System.out.println("Oops, not understood: Please type either 'y' or 'n'. Try again: ");
            checkForAnother(scanner);
        }
    }
}
