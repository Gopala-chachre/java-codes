
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

        input.close();
    }
}
