package com.epam.conditions;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year < 0 || month < 1 || month > 12) {
            System.out.println("Invalid date");
        } else {
            int daysInMonth;
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                // Leap year
                int[] daysInLeapYear = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                daysInMonth = daysInLeapYear[month];
            } else {
                // Non-leap year
                int[] daysInNonLeapYear = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                daysInMonth = daysInNonLeapYear[month];
            }
            System.out.println("Number of days in the month: " + daysInMonth);
        }
    }
}
