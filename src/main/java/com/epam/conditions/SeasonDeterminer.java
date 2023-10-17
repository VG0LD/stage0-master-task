package com.epam.conditions;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Wrong month number");
        } else {
            String season;
            if (monthNumber >= 3 && monthNumber <= 5) {
                season = "Spring";
            } else if (monthNumber >= 6 && monthNumber <= 8) {
                season = "Summer";
            } else if (monthNumber >= 9 && monthNumber <= 11) {
                season = "Autumn";
            } else {
                season = "Winter";
            }
            System.out.println(season);
        }
    }
}
