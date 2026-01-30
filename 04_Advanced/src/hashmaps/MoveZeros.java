package hashmaps;

import java.util.HashMap;
import java.util.Map;

public class MoveZeros {
    public static void main(String[] args) {
        int[] num = {0,1,0,3,12};

        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for(int i = 0; i < num.length; i++){
            if(num[i] != 0){
                map.put(index, num[i]);
                index++;
                num[i] = 0;
            }
        }

        for(Map.Entry<Integer, Integer> i : map.entrySet()){
            System.out.println(i.getKey() + " : " + i.getValue());
        }

        for(int i = 0; i < map.size(); i++){
            num[i] = map.get(i);
        }

        for(int x : num){
            System.out.println(x);
        }
    }
}
