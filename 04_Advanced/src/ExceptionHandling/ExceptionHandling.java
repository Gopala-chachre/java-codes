package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

        // Exception = An event that interrupts the normal flow of program
        //             (Dividing by zero, file not found, mismatch input type)
        //             Surround any dangerous code with try{} block
        //             try{}. catch{}, finally{}

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            System.out.println(num);
        }
        catch (InputMismatchException e){
            System.out.println("This is not a number!!!");
        }
        catch (ArithmeticException e){
            System.out.println("you can't divide by zero!");
        }
        catch (Exception e){
            // it takes all type of exception
            // like a Safety net, always put at the last
            System.out.println("Somethings went wrong");
        }

        // it is optional
        //finally is always execute weather there is an Exception or not
        finally {
            input.close();
            System.out.println("This always executes.");
        }

    }
}
