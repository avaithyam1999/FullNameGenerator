package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the game score in this format: 'Home team':'Visitor Team'|'Home Score':'Visitor Score");
        String userInput = scanner.nextLine();

        System.out.println(pickWinner(userInput));


    }
    public static String pickWinner(String userInput) {
        String splitInput[] = userInput.split("\\|");
        String splitTeams[] = splitInput[0].split("\\:");
        String splitScores[] = splitInput[1].split("\\:");

        int homeScore = Integer.parseInt(splitScores[0]);
        int visitorScore = Integer.parseInt(splitScores[1]);


        if (homeScore > visitorScore) {
            return "The winner is " + splitTeams[0];
        } else if (homeScore < visitorScore) {
            return "The winner is " + splitTeams[1];
        } else {
            return "Tie Game";
        }
    }
}
