package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your full name: ");
        String name = scanner.nextLine();
        String formattedName = parseName(name);
        System.out.println(formattedName);
    }
    public static String parseName(String name) {
        String[] names = name.split("\\s+");
        String formattedName = "";
        if (names.length == 3) {
            String firstName = names[0];
            String middleName = names[1];
            String lastName = names[2];
            formattedName = "First Name: " + firstName + "\nMiddle Name: " + middleName + "\nLast Name: " + lastName;
            return formattedName;
        } else if (names.length == 2) {
            String firstName = names[0];
            String lastName = names[1];
            formattedName = "First Name: " + firstName + "\nLast Name: " + lastName;
            return formattedName;
        }
        else {
            return formattedName;
        }
    }
}
