
// this contains the control Statements
/*
in java there are three types of Control Statements:
1) Selection / Decision-Making Statements
    a) if
    b) if else
    c) else - if
    d) switch

2) Looping Statements
    a) for loop
    b) while loop
    c) do-while loop

3) Jump Statements
    a) break
    b) continue
    c) return
 */

import java.util.Scanner;

public class ControlStatements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // if, if-else, else-if statements
        int age;
        System.out.print("Enter your age: ");
        age = input.nextInt();

        if (age > 65){
            System.out.println("You are a senior!");
        } else if (age >= 18){
            System.out.println("you are adult!");
        } else if (age < 0) {
            System.out.println("you haven't born yet!");

            // while loop = repeat some code forever
            //              while some condition remains true

            String name = "";

            while (name.isEmpty()){
                System.out.print("Enter your name: ");
                name = input.nextLine();
            }

            System.out.println("hello! " + name);

            String response = "";

            while (!response.equals("Q")){
                System.out.println("\n\nYou are playing a game:");
                System.out.print("Press Q to quit: ");
                response = input.next().toUpperCase();
            }

            //same goes for do while

            // for loops = execute some code a CERTAIN amount of time

            for (int i = 0; i < 10; i++){
                System.out.println(i+1 + " times pizza.");
            }
        } else {
            System.out.println("you are a child!");
        }

        // nested if
        boolean isStudent;
        boolean isSenior;
        double price = 59.99;

        System.out.println("are you student (true/false): ");
        isStudent = input.nextBoolean();

        System.out.println("are you a senior (true/false): ");
        isSenior = input.nextBoolean();

        if (isStudent){
            if (isSenior){
                System.out.println("you get a student + senior discount of 19%");
                price *= 0.81;
                System.out.println("So your total amount is: ₹" + price);
            }else {
                System.out.println("you get a student discount of 10%");
                price *= 0.9;
                System.out.println("So your total amount is: ₹" + price);
            }
        }else {
            System.out.println("you get a senior discount of 12%");
            price *= 0.88;
            System.out.println("So your total amount is: ₹" + price);
        }

        // Enhanced switch = A replacement to many else if statements (java14 feature)

        String day;

        System.out.print("Enter the Day: ");
        day = input.nextLine();

        switch (day){
            case "Monday" -> System.out.println("It is a weekday 1.");
            case "Tuesday" -> System.out.println("It is a weekday 2.");
            case "Wednesday" -> System.out.println("It is a weekday 3.");
            case "Thursday" -> System.out.println("It is a weekday 4.");
            case "Friday" -> System.out.println("It is a weekday 5.");
            case "Saturday", "Sunday"
                    -> System.out.println("It is a weekend.");
            default -> System.out.println(day + " is not a day.");
        }

        // break = break out of a loop (stop)
        // continue = skip current iteration of a loop (skip)
        for (int i = 0; i < 10; i++) {

            if (i == 5 ){
                //break;// break the loop
                continue; // skip the 5th loop
            }

            System.out.print(i + " ");
        }

        // nested loop = A loop inside another loop
        //               used often with matrix or DSA

        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        input.close();
    }
}
