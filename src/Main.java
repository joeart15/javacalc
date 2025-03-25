package com.github.joeart15.javacalc;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("5 + 3 = " + calculator.add(5, 3));
        System.out.println("5 - 3 = " + calculator.subtract(5, 3));
        System.out.println("5 * 3 = " + calculator.multiply(5, 3));
        System.out.println("6 / 2 = " + calculator.divide(6, 2));
        System.out.println("7 % 3 = " + calculator.modulus(7, 3));
    }
}
