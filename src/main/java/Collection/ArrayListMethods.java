package Collection;

import Array.Array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {
    public static void main(String[] args){
        /**
         *   addAll method
         */
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(100);
        a1.add(100);
        a1.add(100);
        a1.add(100);

        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(2000);
        a2.add(2000);
        a2.add(2000);
        a1.addAll(0, a2);
        System.out.println(a1);//[2000, 2000, 2000, 100, 100, 100, 100]
        /**
         * clear() method
         */
//        a1.clear();
//        System.out.println(a1);//[]
        /**
         * clone() method
         */
        ArrayList<String> cloneList = (ArrayList<String>) a1.clone();
        System.out.println(cloneList);
        /**
         * contains(value) method  -> return false or true
         */
        System.out.println(a1.contains(100));//ture
        /**
         * indexOf(value) method -> return number of index
         * remove(value) method
         * removeIf() method
         */
        a1.removeIf(num -> num%100 ==0);
        System.out.println(a1);//[]

        /**
         * retainALL(Collections.singleton(value)); -> return the list only contains the value
         */
        a2.retainAll(Collections.singleton(2000));
        System.out.println(a2);//[2000, 2000, 2000]
        /**
         * a2.subList(1,3);
         */
    }
}
