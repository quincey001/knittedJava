package Array;

import java.util.Arrays;
import java.util.List;

public class ArrayMethods {
    /**
     * asList method, change array object to list object to make more flexible actions
     *
     */
    public void asListMethod(String[] arr){
        List<String> ar = Arrays.asList(arr);
        for(String s: ar){
            System.out.println(s + " ");
        }
    }
    public void fillMethod(int[] me){
        Arrays.fill(me, 10);
        for(int s: me){
            System.out.println(s + " ");
        }
    }
    public static void main(String[] args){
        ArrayMethods arrayMethods = new ArrayMethods();
        String[] arr = {"chicken", "bacon","avocado"};
        arrayMethods.asListMethod(arr);

        int[] me = new int[5];
        arrayMethods.fillMethod(me);
        /**
         * arrays.copyOf
         */
        int[] arr1 = Arrays.copyOf(me, me.length);
        System.out.println(Arrays.equals(me, arr1));
        int[] arr2 = {12,3,4,6,5,23,42,4,2,1,1,1};
        Arrays.sort(arr2);
        System.out.println(Arrays.binarySearch(arr2, 2));
    }
}
