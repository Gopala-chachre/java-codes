
// it will compute compound interest on your principal amount

import javax.lang.model.util.SimpleAnnotationValueVisitor6;
import java.util.Scanner;

public class CompoundCalculator {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        double principalAmt, interestRate;
        int noOfTime, year;
        double compInterest;

        System.out.print("Enter the Principal amount: ");
        principalAmt = input.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        interestRate = input.nextDouble() / 100;

        System.out.print("Enter the No. of times compounded per year: ");
        noOfTime = input.nextInt();

        System.out.print("Enter the No. of years: ");
        year = input.nextInt();

        compInterest = principalAmt * Math.pow((1 + interestRate/noOfTime), noOfTime*year);

        System.out.printf("And the amount after %d year is : ₹%.2f", year, compInterest);

        input.close();
    }
}
