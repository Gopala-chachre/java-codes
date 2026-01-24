package hashmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NoOfDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();

        System.out.print("Enter size of Array: ");
        int arrEl = input.nextInt();

        int[] arr = new int[arrEl];
        System.out.println("Enter Array Elements:");
        for (int i = 0; i < arrEl; i++) {
            System.out.print("Element " + (i+1) + ": ");
            arr[i] = input.nextInt();
        }

        System.out.print("Array elements : [ ");
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.print("]\n");

        for (int num : arr){
            if (map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else {
                map.put(num, 1);
            }
        }

        for(Map.Entry<Integer, Integer> x : map.entrySet()){
            System.out.println(x.getKey() + " : " + x.getValue());
        }

        input.close();
    }
}
