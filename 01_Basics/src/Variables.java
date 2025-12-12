public class Variables {
    public static void main(String[] args) {
        // Variable = a reusable container for a value
        //            a variable behave as if it was the value it contain

        // Primitive = simple value stored directly in memory (stack)
        // Reference = memory address (stack) that points to the (heap)

        // Primitive Vs Reference
        // ---------    ---------
        // int          string
        // double       array
        // char         object
        // boolen

        // 2 steps to create a variable
        // ----------------------------
        // 1. declaration
        // 2. assignment

        // integer type
        int age = 21;
        int year = 2025;
        int quantity = 12; //quantity is always in an integer form

        System.out.println("The year is " + year);
        System.out.println("My age is " + age);
        System.out.println("The year is " + "year");

        // double type
        double price = 24.86;
        double gpa = 8.9;
        double temperature = 34.6;
        System.out.println("The price is $ " + price);
        System.out.println("The gpa is " + gpa);
        System.out.println("The temperature is " + temperature);

        // char type
        char gender = 'M';
        char grade = 'A';
        char symbol = '#';
        System.out.println("The gender is " + gender);
        System.out.println("The grade is " + symbol + grade);

        // boolen type
        boolean isStudent = true;
        boolean forSale = false;
        System.out.println("is Aman student " + isStudent);
        System.out.println("is this t-shirt " + forSale);

    }
}
