package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareArrayList {
    public static void main(String[] args){
        ArrayList<String> l1= new ArrayList<>(Arrays.asList("a","b","c","d"));
        ArrayList<String> l2= new ArrayList<>(Arrays.asList("a","b","c","e"));
        ArrayList<String> l3= new ArrayList<>(Arrays.asList("b","a","c","d"));

        System.out.println(l1 == l2);//false
        System.out.println(l1 == l3);// false

        Collections.sort(l3);
        System.out.println(l1 == l3);// false
        System.out.println(l1.equals(l3));// true

        //compare two arraylist to find the additional element
        l2.removeAll(l1);
        System.out.println(l2);
        // find the missing elements
        l1.removeAll(l2);
        System.out.println(l1);
    }
}
