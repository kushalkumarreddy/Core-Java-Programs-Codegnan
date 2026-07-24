package MiniProjects;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        while (true) {

            System.out.println("\n --> ROCK PAPER SCISSORS <--");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice: ");

            int userChoice = sc.nextInt();

            if (userChoice == 4) {
                System.out.println("Thanks for Playing!");
                break;
            }

            if (userChoice < 1 || userChoice > 4) {
                System.out.println("Invalid Choice! Try Again.");
                continue;
            }

            int computerChoice = random.nextInt(3) + 1;

            System.out.println("\nYou Chose      : " + getChoice(userChoice));
            System.out.println("Computer Chose : " + getChoice(computerChoice));

            if (userChoice == computerChoice) {
                System.out.println("Result : Match Draw!");
            } 
            else if ((userChoice == 1 && computerChoice == 3) ||
                     (userChoice == 2 && computerChoice == 1) ||
                     (userChoice == 3 && computerChoice == 2)) {
                System.out.println("Result : You Win!");
            } 
            else {
                System.out.println("Result : Computer Wins!");
            }
        }

        sc.close();
    }

    public static String getChoice(int choice) {

        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "";
        }
    }
}