package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int age = 30;

        printToCommandLine(getPersonOfAge(age));
    }

    private static String getPersonOfAge(int age){
        String person;
        switch (age) {
            case 30:
                person = "gideon";
            case 29:
                person = "jc";
            default:
                person = "no such cunt available";
        }
        return person;
    }

    private static void printToCommandLine(String stringToPrint) {
        System.out.println(stringToPrint);
    }
}
