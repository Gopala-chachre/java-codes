// Guess the Number

import java.util.Random;
import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int number, userNum;
        int count = 0;

        number = rand.nextInt(1,101);

        do {
            count++;
            System.out.print("Enter a number in b/w 1 o 100: ");
            userNum = input.nextInt();
            if (userNum < number){
                System.out.println("too low! Try again");
            } else if (userNum == number) {
                System.out.println("You guess it Right!!!");
            }else{
                System.out.println("too high! try again");
            }
        }while (userNum != number);

        System.out.printf("You take %d attempts!", count);

        input.close();
    }
}
