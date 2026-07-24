package MiniProjects;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    static int playerWins = 0;
    static int computerWins = 0;
    static int ties = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        while (true) {

            System.out.println("\n====== ROCK PAPER SCISSORS ======");
            System.out.println("1. Play Game");
            System.out.println("2. View Score");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    playGame(sc, random);
                    break;

                case 2:
                    displayScore();
                    break;

                case 3:
                    System.out.println("\nThank you for playing!");
                    displayScore();
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Menu Choice!");
            }
        }
    }

    public static void playGame(Scanner sc, Random random) {

        char[] options = {'R', 'P', 'S'};

        System.out.print("\nEnter R for Rock, P for Paper, S for Scissors: ");
        char player = Character.toUpperCase(sc.next().charAt(0));

        if (player != 'R' && player != 'P' && player != 'S') {
            System.out.println("Invalid Choice! Please enter only R, P, or S.");
            return;
        }

        char computer = options[random.nextInt(3)];

        System.out.println("\nYour Choice     : " + getChoice(player));
        System.out.println("Computer Choice : " + getChoice(computer));

        if (player == computer) {
            System.out.println("Result : It's a Tie!");
            ties++;
        }
        else if ((player == 'R' && computer == 'S') ||
                 (player == 'P' && computer == 'R') ||
                 (player == 'S' && computer == 'P')) {

            System.out.println("Result : You Win!");
            playerWins++;
        }
        else {
            System.out.println("Result : Computer Wins!");
            computerWins++;
        }

        displayScore();
    }

    public static void displayScore() {

        System.out.println("\n========== SCORE BOARD ==========");
        System.out.println("Player Wins   : " + playerWins);
        System.out.println("Computer Wins : " + computerWins);
        System.out.println("Ties          : " + ties);
        System.out.println("=================================");
    }

    public static String getChoice(char choice) {

        switch (choice) {

            case 'R':
                return "Rock";

            case 'P':
                return "Paper";

            case 'S':
                return "Scissors";

            default:
                return "Invalid";
        }
    }
}