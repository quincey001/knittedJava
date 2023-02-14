package Collection.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    /**
     * Java HashMap class implements the map interface which allow us to store key and value pair
     * where keys should be unique.
     * if you insert the duplicate key, it will replace the element of the corresponding key.
     */
    public static void main(String[] args){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(7, 7);
        map.put(5,6);
        map.put(3, 8);
        int maxKey = 0;
        for(Map.Entry m : map.entrySet()){
            if((int)m.getKey() > maxKey){
                maxKey = (int)m.getKey();
            }
        }
        System.out.println(map.get(maxKey));

        HashMap<String, String> stringHashMap = new HashMap<>();
        stringHashMap.put("a","back");
        stringHashMap.put("b","age");
        for(Map.Entry m : stringHashMap.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
