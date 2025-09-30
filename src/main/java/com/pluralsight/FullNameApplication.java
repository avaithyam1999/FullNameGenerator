package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your First Name: ");
        String firstName = scanner.nextLine();
        firstName = firstName.trim();

        System.out.println("Enter your Middle Name if you have one: ");
        String middleName = scanner.nextLine();
        middleName = middleName.trim();

        System.out.println("Enter your Last Name: ");
        String lastName = scanner.nextLine();
        lastName = lastName.trim();

        System.out.println("Enter your suffix if you have one: ");
        String suffix = scanner.nextLine();
        suffix = suffix.trim();

        System.out.println("Your full name is " + joinedName(firstName, middleName, lastName, suffix));
    }
    public static String joinedName(String firstName, String middleName, String lastName, String suffix) {
        if (suffix.isEmpty() && middleName.isEmpty()) {
            return firstName + " " + lastName;
        }
        else if (suffix.isEmpty()) {
            return firstName + " " + middleName + " " + lastName;
        }
        else if (middleName.isEmpty()) {
            return firstName + " " + lastName + ", " + suffix;
        }
        else {
            return firstName + " " + middleName + " " + lastName + ", " + suffix;
        }
    }
}
