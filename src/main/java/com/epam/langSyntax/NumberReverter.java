package com.epam.langSyntax;

public class NumberReverter {
    public void revert(int number) {
        // Extract the individual digits
        int digit1 = number % 10;
        int digit2 = (number / 10) % 10;
        int digit3 = number / 100;

        // Revert the number and print it
        int reversedNumber = digit1 * 100 + digit2 * 10 + digit3;
        System.out.println(reversedNumber);
    }
}

