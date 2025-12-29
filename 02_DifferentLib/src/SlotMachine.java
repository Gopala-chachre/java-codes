// a slot machine program
// user bet an amount and the slot will show using the emoji
// if any matching pair or triple are there and user get the price money

import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Declare variables

        int balance = 100;
        int bet;
        int payout;
        String[] row;

        // Display welcome message

        System.out.println("+--------------------------+");
        System.out.println("   Welcome to  Java Slots  ");
        System.out.println(" Symbols: ! | @ | # | $ | %");
        System.out.println("+--------------------------+");

        // Play if balance > 0
        while (balance > 0){
            System.out.println("Current balance: ₹" + balance);
            System.out.print("Place your bet amount: ");
            bet = input.nextInt();

            // Enter bet amount
            //      Verify if bet > balance
            //      Verify if bet > 0
            //      Subtract bet From balance

            if (bet > balance){
                System.out.println("\nINSUFFICIENT FUNDS\n");
                continue;
            } else if (bet <= 0){
                System.out.println("\nBET MUST BE GREATER THEN ZERO.\n");
                continue;
            } else{
                balance -= bet;
            }

            // Spin row
            System.out.println("Spinning....");
            row = spinRow();
            printRows(row);

        }



        // Print row

        // Get Payout
        // ask to play again

        // display Exit message
        input.close();
    }

    static String[] spinRow(){

        // {"🐼", "🦄", "🐢", "🐧", "🐬"}
        String[] symbols = {"!", "@", "#", "$", "%"};
        String[] row = new String[3];
        Random rand = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[rand.nextInt(symbols.length)];
        }

        return row;
    }

    static void printRows(String[] row){
        System.out.println("+---------+");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("+---------+");
    }

}
