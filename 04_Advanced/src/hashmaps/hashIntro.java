package hashmaps;

import java.util.HashMap;
import java.util.Map;

public class hashIntro {
    public static void main(String[] args) {
        // declaration of hashmap
        // HashMap<keyType, valueType> nameOfHashmap = new HashMap<>();
        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Gopala");
        map.put(102, "Deepanshu");
        map.put(103, "Himanshu");
        map.put(104, "Abhishek");
        map.put(105, "Manish");

        System.out.println(map.get(103));
        System.out.println(map.get(104));
        System.out.println(map.get(106));

        for(Map.Entry<Integer, String> i : map.entrySet()){
            System.out.println(i.getKey() + " : " + i.getValue());
        }

        System.out.println(map.containsKey(101));
        System.out.println(map.containsKey(106));

        map.remove(106);

        System.out.println(map.size());
        System.out.println(map.isEmpty());
        map.clear();

        map.get(101);


    }
}
