package Polymorphism.Runtime_poly;

import java.util.Scanner;

public class RuntimePoly {
    public static void main(String[] args) {

        // Runtime Polymorphism = When the method that gets executed is decided
        //                        at runtime bases on the actual type of the objects.

        Scanner input = new Scanner(System.in);

        Animal animal;

        System.out.print("Would you like a dog or a cat? (1-> dog | 2-> cat): ");
        int choice = input.nextInt();

        if (choice == 1){
            animal = new Dog();
            animal.speak();
        } else if (choice == 2) {
            animal =  new Cat();
            animal.speak();
        } else {
            System.out.println("Invalid choice.");
        }


        input.close();
    }
}
