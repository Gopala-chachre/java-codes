package hashmaps;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int target = 6;

        HashMap<Integer, Integer> map = new HashMap<>();

        int search;
        for (int i = 0; i < arr.length; i++) {
            search = target - arr[i];
            if(map.containsValue(search)){
                map.get(arr[i]);
            }else {
                map.put(arr[i], i);
            }
        }

    }
}
