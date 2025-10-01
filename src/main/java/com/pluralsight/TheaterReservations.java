package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String usersName = scanner.nextLine();

        System.out.println("What date will you be coming? (MM/DD/YYYY): ");
        String dateAsString = scanner.nextLine();

        System.out.println("How many tickets would you like?: ");
        int ticketNum = scanner.nextInt();

        System.out.println(convertToSentence(usersName, dateAsString, ticketNum));
    }
    public static String convertToSentence(String usersName, String dateAsString, int ticketNum) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(dateAsString, formatter);

        String[] firstAndLast = usersName.split(" ");
        String firstName = firstAndLast[0];
        String lastName = firstAndLast[1];

        if (ticketNum == 1) {
            String formattedSentence = String.format("%d ticket reserved for %s under %s, %s", ticketNum, date, lastName, firstName);
            return formattedSentence;
        } else if (ticketNum > 1) {
            String formattedSentence = String.format("%d tickets reserved for %s under %s, %s", ticketNum, date, lastName, firstName);
            return formattedSentence;
        } else {
            return "you have not entered valid inputs";
        }
    }
}