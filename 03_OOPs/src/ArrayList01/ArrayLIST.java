package ArrayList01;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLIST {
    public static void main(String[] args) {

        // ArrayList = A resizeable array that stores object (Autoboxing)
        //             Array are fixed in size, but ArrayLists can change.

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(3);
        list1.add(2);
        list1.add(7);

        System.out.println(list1);

        ArrayList<Double> list2 = new ArrayList<>();

        list2.add(3.14);
        list2.add(7.09);
        list2.add(88.96);

        System.out.println(list2);

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("coconut");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("orange");

        System.out.println(fruits);

        fruits.set(3, "pineapple");
        System.out.println(fruits);
        System.out.println(list1.get(1));

        System.out.println(fruits.size());

        Collections.sort(fruits);
        System.out.println(fruits);
        

        list1.remove(0);
        list2.remove(1);
        fruits.remove(2);

        System.out.println();
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(fruits);
    }
}
