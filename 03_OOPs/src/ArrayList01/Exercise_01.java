package ArrayList01;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the number of food you would like: ");
        int numOfFood = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= numOfFood; i++) {
            System.out.print("Enter food number " + i + ": ");
            String food = input.nextLine();
            foods.add(food);
        }

        System.out.println(foods);

        input.close();
    }
}
