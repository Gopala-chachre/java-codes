// generate a 2d matrix where the user enter the numbers of row and column

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int row, column;
        char symbol;
        System.out.print("Enter Number of Rows: ");
        row = input.nextInt();

        System.out.print("Enter Number of Columns: ");
        column = input.nextInt();

        System.out.print("Enter the symbol to use: ");
        symbol = input.next().charAt(0);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
