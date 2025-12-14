
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

        input.close();
    }
}
