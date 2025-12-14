// sphere operations
// circumference = 2*PI*radius
// area = PI*(radius)²
// volume = (4.0 / 3.0)*PI*(radius)³

import java.util.Scanner;

public class Exercise_02 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        double radius;
        double circumference, area, volume;

        System.out.print("Enter radius value: ");
        radius = input.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = 4.0/3.0 * Math.PI * Math.pow(radius, 3);

        System.out.printf("Circumference of Sphere with radius %.1f is: %.1f\n", radius, circumference);
        System.out.printf("Area of Sphere with radius %.1f is: %.1f\n", radius, area);
        System.out.printf("Volume of Sphere with radius %.1f is: %.1f", radius, volume);

        input.close();
    }
}
