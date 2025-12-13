import java.util.Scanner;

    // Calculate area of a rectangle

public class Exercise01 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        double width;
        double length;
        double area;

        //taking width from the user
        System.out.print("Enter the width of the rectangle (in cm):");
        width = input.nextDouble();

        //taking length from the user
        System.out.print("Enter the length of the rectangle (in cm):");
        length = input.nextDouble();

        //calculating the area
        area = width * length;
        System.out.println("The area of the rectangle is: " + area + " cm²");


        input.close(); // doing this is an ideal process
    }
}
