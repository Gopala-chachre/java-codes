import java.util.Scanner;

public class Exercise01 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        double finalBalance = 110; // the initial balance of bank account
        int choice;
        boolean flag = true;

        System.out.println("+------------------+");
        System.out.println("  BANKING  PROGRAM  ");
        System.out.println("+------------------+");

        do {
            System.out.println("1. Show Balance\n2. Deposit\n3. Withdraw\n4. Exit");
            System.out.println("+-----------------------+");
            System.out.print("Enter your choice (1-4): ");
            choice = input.nextInt();

            switch (choice){
                case (1) -> {
                    showBalance(finalBalance);
                }
                case (2) -> {
                    finalBalance += deposit();
                }
                case (3) -> {
                    finalBalance -= withdraw();
                }
                case (4) -> {
                    flag = false;
                    System.out.println("+---------------------+");
                    System.out.println("Thank you for visiting.");
                    System.out.println("+---------------------+");
                }
                default -> System.out.println("\nEnter the correct choice!!!\n");
            }

        } while (flag);

    }

    static void showBalance(double balance){
        System.out.println("+-----------------------+");
        System.out.printf("Total balance is : ₹%.2f\n", balance);
        System.out.println("+-----------------------+");
    }

    static double deposit(){
        double amount;
        System.out.println("+--------------------------+");
        System.out.print("Enter the amount to deposit: ");
        amount = input.nextDouble();

        if (amount <= 0){
            System.out.println("Amount can't be negative or zero.");
            System.out.println("+-------------------------------+");
            return 0;
        }else {
            return  amount;
        }
    }

    static double withdraw(){
        double amount;
        System.out.println("+--------------------------+");
        System.out.print("Enter the amount to withdraw: ");
        amount = input.nextDouble();

        if (amount < 0){
            System.out.println("Amount can't be negative or zero.");
            System.out.println("+-------------------------------+");
            return 0;
        }else {
            return amount;
        }
    }

}
