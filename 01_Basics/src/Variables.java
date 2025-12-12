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

        int age = 21;
        int year = 2025;
        int quantity = 12; //quantity is always in an integer form

        System.out.println("The year is " + year);
        System.out.println("My age is " + age);
        System.out.println("The year is " + "year");

    }
}
