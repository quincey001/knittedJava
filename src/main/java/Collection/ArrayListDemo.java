package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
    /**
        when multiple threads are working on the same data,
        and the value of our data is changing, that scenario is not
        thread-safe, and we will get inconsistent results

        when a thread is already working on an object and preventing another thread
        on working on the same object, this process is called thread-safety.
     */
    public static void main(String[] args){
        // dynamic array
        int[] i = new int[4];// the maximum capacity is 4

        System.out.println(i[3]);
        System.out.println(i[1]);// it will give 0 to every element as a default value.

        ArrayList<Object> arr = new ArrayList<Object>();
        arr.add(100);//0
        arr.add("stest");//1
        arr.add('s');//2
        arr.add(12.22);//3
        arr.add(false);//4
        System.out.println(arr);
        System.out.println(arr.get(3));
        System.out.println(arr.size());

        //list with other collection
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
        System.out.println(numbers);//[10, 20, 30, 40, 50]
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("john","bryan"));
        System.out.println(names);//[john, bryan]
    }
}
