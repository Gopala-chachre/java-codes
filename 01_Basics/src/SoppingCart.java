import java.util.Scanner;

// Sopping cart program
/*
hear first what item user want and then how many quantity of that item
then we will calculate it and then the final price.
 */

public class SoppingCart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String item;
        double costOfItem;
        int quantityOfItem;
        double finalPrice;

        System.out.print("What item would you like to buy?: ");
        item = input.nextLine();

        System.out.print("What is the price for each item?: ");
        costOfItem = input.nextDouble();

        System.out.print("How many would you like?: ");
        quantityOfItem = input.nextInt();

        finalPrice = costOfItem * quantityOfItem; // calculating final price
        System.out.println("\nYou have bought " + quantityOfItem + " " + item +"/s");
        System.out.println("Your total is " + finalPrice);

        input.close();
    }

}
