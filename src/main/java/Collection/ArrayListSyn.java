package Collection;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListSyn {
    public static void main(String[] args){
        /**
         * There are two ways to synchronize ArrayList in java:
         * 1- Collections.synchronizedList - method - return synchronized list
         * 2- copyOnWriteArrayList - class= thread safe variant of Arraylist
         */

        List<String> nameList = Collections.synchronizedList(new ArrayList<String>());
        nameList.add("python");
        nameList.add("java");
        nameList.add("rugby");// add, remove we dont need explicit synchronization
        // if you need to fetch/ traverse the elements in the arraylist, we need to use explicit synchronization
        synchronized (nameList){
            Iterator<String> it = nameList.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }
        /**
         * copyOnWriteArrayList class
         */
        CopyOnWriteArrayList emList = new CopyOnWriteArrayList();// the class is already thread safe and syncronized
        emList.add("tom");
        emList.add("jack");
        // so we dont need to use explicit synchronization on any operations(add, remove, traverse)
        Iterator<String> i = emList.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
