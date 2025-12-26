// a slot machine program
// user bet an amount and the slot will show using the emoji
// if any matching pair or triple are there and user get the price money

import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Declare variables
        // {"🐼", "🦄", "🐢", "🐧", "🐬"}
        int balance = 100;
        int bet;
        int payout;
        String[] row = {"!", "@", "#", "$", "%"};

        System.out.println("+--------------------------+");
        System.out.println("   Welcome to  Java Slots  ");
        System.out.println(" Symbols: ! | @ | # | $ | %");
        System.out.println("+--------------------------+");

        // Display welcome message

        // Play if balance > 0

        // Enter bet amount
        //      Verify if bet > balance
        //      Verify if bet > 0
        //      Subtract bet From balance

        // Spin row
        // Print row

        // Get Payout
        // ask to play again

        // display Exit message
        input.close();


    }
}
