package Collection;
import java.util.Arrays;
public class Collection {
    /**
     * Collections are defined to hold all the classes and interfaces, which provide
     * a ready-made architecture.
     *
     * Advantages: 1- it reduces programming effort, they are reusable
     *              2- it provides in-built methods and classes
     *              3- optimized/highly performance
     *              4 - increase productivity
     *              5- reduce operational time
     *              6- interoperability
     *
     *      List
     *      * 1. an order based collection
     *      * 2. index based
     *      * arraylist
     *
     *      linkedlist
     *      * 3.Dynamic array
     *
     *      * Set
     *      * cannot have duplicate elements
     *
     *      * Queue
     *      * FIFO
     *
     *      * Map
     *      * stores data into key and value pair format
     *
     *      * Iterator
     *      * it is used to iterate the elements from a collection
     */
}


class Median {
    public static double findMedian(int[] array) {
        Arrays.sort(array);
        int length = array.length;
        if (length % 2 == 0) {
            int middle1 = array[length / 2 - 1];
            int middle2 = array[length / 2];
            return (double) (middle1 + middle2) / 2;
        } else {
            return array[length / 2];
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("The median of the array is: " + findMedian(array) );
    }
}

