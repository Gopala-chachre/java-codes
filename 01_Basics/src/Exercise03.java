// a normal calculator program

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2;
        double result;
        char operator;

        System.out.print("Enter the first number: ");
        num1 = input.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, ^): ");
        operator = input.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = input.nextDouble();

        switch (operator){
            case '+' -> System.out.printf("The resultant is : %.2f", num1 + num2);
            case '-' -> System.out.printf("The resultant is : %.2f", num1 - num2);
            case '*' -> System.out.printf("The resultant is : %.2f", num1 * num2);
            case '/' -> {
                if (num2 == 0){
                    System.out.println("cannot divide by Zero.");
                }else{
                    System.out.printf("The resultant is : %.2f", num1 / num2);
                }
            }
            case '^' -> System.out.printf("The resultant is : %.2f", Math.pow(num1, num2));
            default -> System.out.println("You enter wrong operator!");
        }

        input.close();
    }
}
