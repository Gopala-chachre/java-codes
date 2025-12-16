import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        // array = a collection of values of the same data type
        //         * think of it as a variable that can store more than 1 value *

        String[] fruits = {"apple", "orange", "banana", "coconut"};
        System.out.println(fruits[0]);
        System.out.println(fruits[2]);

        fruits[0] = "pineapple";
        System.out.println(fruits[0]);

        int numOfFruits = fruits.length;
        System.out.println(numOfFruits);

        for (int i = 0; i < numOfFruits; i++) {
            System.out.print(fruits[i]);
            System.out.print("  ");
        }
        System.out.println();

        // it is an enhanced for loop it wil take every element of array at once
        for (String x : fruits) {
            System.out.print(x);
            System.out.print("  ");
        }
        System.out.println();

        int[] marks = {8,6,7,9,6};
        // enhanced for also known as for each loop
        for (int y : marks){
            System.out.print(y);
            System.out.print(" ");
        }
        System.out.println();

        //---------------------------------------------------------------
        // for shorting your array you have to first import the array lib
        //---------------------------------------------------------------

        Arrays.sort(fruits);
        Arrays.sort(marks);

        //printing the sorted arrays
        for (String x : fruits) {
            System.out.print(x);
            System.out.print("  ");
        }
        System.out.println();

        for (int y : marks){
            System.out.print(y);
            System.out.print(" ");
        }
        System.out.println();

        // to fill the array with particular element
        Arrays.fill(fruits, "Apple");

        for (String x : fruits) {
            System.out.print(x);
            System.out.print("  ");
        }
        System.out.println();
    }
}
