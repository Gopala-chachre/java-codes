// a slot machine program
// user bet an amount and the slot will show using the emoji
// if any matching pair or triple are there and user get the price money

import java.sql.SQLOutput;
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
        String playAgain;

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
            input.nextLine();

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

            // Print row
            printRows(row);

            // Get Payout
            payout = getPayout(row, bet);

            if (payout > 0){
                System.out.println("You won ₹" + payout);
                balance += payout;
            } else {
                System.out.println("Sorry you lost this round!!");
            }

            // ask to play again
            System.out.print("Do you want to play Again? (Y/N) :");
            playAgain = input.nextLine().toUpperCase();

            if (!playAgain.equals("Y")){
                break;
            }
        }

        // display Exit message
        System.out.println("GAME OVER! Your final balance is: ₹" + balance);
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

    static int getPayout(String[] row, int bet){

        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch(row[0]){
                case "#" -> bet * 3;
                case "!" -> bet * 4;
                case "@" -> bet * 5;
                case "%" -> bet * 10;
                case "$" -> bet * 20;
                default -> 0;
            };
        } else if (row[0].equals(row[1]) || 
                   row[1].equals(row[2])){
            return switch(row[1]){
                case "#" -> bet * 2;
                case "!" -> bet * 3;
                case "@" -> bet * 4;
                case "%" -> bet * 5;
                case "$" -> bet * 10;
                default -> 0;
            };
        } else if (row[0].equals(row[2])) {
            return switch(row[0]){
                case "#" -> bet * 2;
                case "!" -> bet * 3;
                case "@" -> bet * 4;
                case "%" -> bet * 5;
                case "$" -> bet * 10;
                default -> 0;
            };
        }
        return 0;
    }

}
