import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //for strings
        System.out.print("Enter your name:");
        String name = input.nextLine();

        System.out.print("Enter Father's name:");
        String fatherName = input.nextLine(); //it will take only upto 1st space

        // for integer
        System.out.print("Enter your age :");
        int age = input.nextInt();

        // for double or float
        System.out.print("Enter your GPA : ");
        double gpa = input.nextDouble();

        // for boolen
        System.out.print("Are you a Student? (true/false): ");
        boolean isStudent = input.nextBoolean();

        System.out.println("Hello : " + name);
        System.out.println("your Father's name : " + fatherName);
        System.out.println("you are " + age + " Years old.");
        System.out.println("your GPA : " + gpa);
        System.out.println("Student : " + isStudent);

        /*
        // COMMON ISSUES
        System.out.print("Enter your Age: ");
        int age = input.nextInt();
        input.nextLine();// to resolve the issue

        System.out.print("Enter your Favorite color: ");
        String color = input.nextLine();

        System.out.println("You are " + age + " years old!");
        System.out.println("You like the color " + color);
         */

        input.close();
    }
}
