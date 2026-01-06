package Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {

        // JAVA HANGMAN GAME

        String word = "mustang";

        Scanner input = new Scanner(System.in);
        
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        System.out.println("+-------------------+");
        System.out.println(" Welcome to HANGMAN! ");
        System.out.println("+-------------------+");

        System.out.print("Word: ");
        for (char ch : wordState){
            System.out.print(ch + " ");
        }
        System.out.println();

        System.out.print("Guess a letter: ");
        char guess = input.next().toLowerCase().charAt(0);

        if(word.indexOf(guess) >= 0){
            System.out.println("Correct guess!\n");
        }else {
            System.out.println("Wrong guess!\n");
        }

        input.close();
    }

    static String getHangmanArt(int wrongGuesses){
        return switch (wrongGuesses){
          case 0 -> """
                  
                  
                  
                    """;

            case 1 -> """
                       0
                  
                  
                      """;
            case 2 -> """
                       0
                       |
                  
                      """;
            case 3 -> """
                       0
                      /|
                  
                      """;
            case 4 -> """
                       0
                      /|\\
                  
                      """;
            case 5 -> """
                       0
                      /|\\
                      /
                      """;
            case 6 -> """
                       0
                      /|\\
                      / \\
                      """;
            default -> "";
        };
    }

}
