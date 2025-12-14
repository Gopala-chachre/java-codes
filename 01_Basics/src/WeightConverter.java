// WEIGHT CONVERSION PROGRAM
// convert weight to lbs to kgs or vise versa

import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double weight, newWeight;
        int choice;

        System.out.println("------Weight Conversion Program------");
        System.out.print("1: Covert lbs to kgs\n2: Covert kgs to lbs\nChoose an Option: ");
        choice = input.nextInt();

        if (choice == 1){
            System.out.print("\nEnter the Weight in lbs: ");
            weight = input.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is: %.1f", newWeight);
        } else if (choice == 2) {
            System.out.print("\nEnter the Weight in kgs: ");
            weight = input.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is: %.1f", newWeight);
        }else {
            System.out.println("You entered Wrong choice.");
        }

        input.close();
    }
}
