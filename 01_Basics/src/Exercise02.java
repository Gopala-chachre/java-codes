// A Temperature Converter

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double temperature, convertedTemp;
        String choice;

        System.out.print("Enter the Temperature: ");
        temperature = input.nextInt();
        System.out.print("In which you want to convert Celsius or Fahrenheit (c/f): ");
        choice = input.next();

        if (choice.equalsIgnoreCase("c")){
            convertedTemp = temperature*9.0/5.0 + 32 ;
            System.out.println("converted temperature is: " + convertedTemp);
        } else if (choice.equalsIgnoreCase("f")) {
            convertedTemp = (temperature - 32)*5.0/9.0 ;
            System.out.println("converted temperature is: " + convertedTemp);
        } else {
            System.out.println("You enter wrong choice.");
        }

        input.close();
    }
}
