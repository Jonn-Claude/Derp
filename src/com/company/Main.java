package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int age = 29;

        printToCommandLine(getPersonOfAge(age));
    }

    private static String getPersonOfAge(int age){
        return switch (age) {
            case 30 -> "gideon";
            case 29 -> "jc";
            default -> "no such cunt available";
        };
    }

    private static void printToCommandLine(String stringToPrint) {
        System.out.println(stringToPrint);
    }
}
