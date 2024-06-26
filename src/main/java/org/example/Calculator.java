package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) throws WrondInputException {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter first number: ");

    try {
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        System.out.println(a + b);
    } catch (InputMismatchException ex) {
        throw new WrondInputException("Invalid input. Please enter an integer.");
    }
}
}