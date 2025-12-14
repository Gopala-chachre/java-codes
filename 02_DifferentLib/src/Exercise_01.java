
// hear we find HYPOTENUSE c = math.sqrt(a² + b²)

import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double height, perpendicular, hypotenuse;

        System.out.print("Enter the value of Height: ");
        height = input.nextDouble();

        System.out.print("Enter the value of Perpendicular: ");
        perpendicular = input.nextDouble();

        hypotenuse = Math.sqrt(Math.pow(height, 2) + Math.pow(perpendicular, 2));

        System.out.println("The hypotenuse of a tringle with height " + height + "cm² and perpendicular " + perpendicular + "cm² is: " + hypotenuse + "cm²");

        input.close();
    }
}
