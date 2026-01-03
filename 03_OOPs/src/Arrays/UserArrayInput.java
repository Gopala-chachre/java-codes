import java.util.Scanner;

public class UserArrayInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int size;
        System.out.print("What No. of food you want?: ");
        size = input.nextInt();
        input.nextLine();

        String[] foods = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter a food: ");
            foods[i] = input.nextLine();
        }

        System.out.println("Your order is:");
        for (String str : foods) {
            System.out.println(str);
        }

        input.close();
    }
}
