package com.epam.langSyntax;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        // Extract the individual digits
        int digit1 = number % 10;
        int digit2 = (number / 10) % 10;
        int digit3 = (number / 100) % 10;
        int digit4 = number / 1000;

        // Calculate the sum of the digits
        int sum = digit1 + digit2 + digit3 + digit4;
        System.out.println("Sum of digits: " + sum);
    }
}

