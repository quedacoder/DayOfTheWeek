package com.quedacoder;

public class Main {

    public static void main(String[] args) {
        printDayOfTheWeek(5);
        printDayOfTheWeek(0);
        printDayOfTheWeek(3);
    }

    public static void printDayOfTheWeek(int day) {

        String dayString = "Invalid Value";

        switch (day) {
            case 0:
                dayString = "Sunday";
                break;
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            default:
                dayString = "Invalid Value";
                break;
        }

        System.out.println(dayString);
    }
}
