package Collection.Iterator;

import java.util.*;

public class IteratorDemo {
    /**
     * The iterator interface is used to step through the elements of a Collection.
     * they are a generic way to go through all the elements of a Collection
     */
    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();
        map.put("1","jan");
        map.put("2","feb");
        map.put("3","mar");
        map.put("4","apr");
        map.put("5","may");

        Iterator iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        Iterator iterator1 = set.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

    }
}
