package Array;


public class Array {

    /**
     *  Arrays are containers in java which can hold fix number of elements and those
     *  elements should have the same type.
     *  ths shortcut for array in java is that you can only insert or delete from the last
     *  element
     */
    public static void main(String[] args){
        /**
         * 1.Initialize using index
         */
        int[] my = new int[5];
        for(int i = 0; i < 5; i++){
            my[i] = i;
        }
        /**
         * 2.Initialize while declaring
         */
        // fix number of items
        int[] arr = new int[]{1,2,3,4,5,6,7};
        int[] myarr = {9,8,7,6,5,4,3};
        String[] mystr = new String[]{"a","b","c","d"};
        String[] newstr = {"a","b","c","d"};// declaring and initializing an array
        System.out.println(myarr.length);
        /**
         * anonymous array: instant use
         */
        System.out.println(sum(new int[]{1,2,3,4,5,6,7}));
        System.out.println(myarr.length);
    }
    public static int sum(int[] a)
    {
        int total = 0;

        // using for-each loop
        for (int i : a)
            total = total + i;
        return total;
    }
}
