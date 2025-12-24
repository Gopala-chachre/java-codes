// a simple Rock Paper Scissors game

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        String[] choice = {"rock", "paper", "scissors"};
        String userChoice;
        String compChoice;
        String playAgain = "yes";

        do {
            System.out.print("Enter your move ('rock, paper, scissors): ");
            userChoice = input.nextLine().toLowerCase();

            if(!userChoice.equals("rock") &&
                    !userChoice.equals("paper") &&
                    !userChoice.equals("scissors")){
                System.out.println("Invalid choice!!!");
                continue;
            }
            compChoice = choice[rand.nextInt(0,3)];
            System.out.println("Computer choice: " + compChoice);

            if(userChoice.equals(compChoice)){
                System.out.println("It's a tie!!");
            } else if ((userChoice.equals("rock") && compChoice.equals("scissors")) ||
                    (userChoice.equals("paper") && compChoice.equals("rock")) ||
                    (userChoice.equals("scissors") && compChoice.equals("paper"))) {
                System.out.println("You win!!");
            } else {
                System.out.println("You lose!!!");
            }

            System.out.print("Play again? (yes/no): ");
            playAgain = input.nextLine().toLowerCase();
        } while (playAgain.equals("yes"));

        System.out.println("+----------------------+");
        System.out.println("| Thanks for playing!! |");

        input.close();
    }
}
