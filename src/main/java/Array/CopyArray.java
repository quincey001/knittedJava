package Array;

public class CopyArray {
    public static void main(String[] args){
        /**
         * when you clone a single-dimensional array,A deep copy is performed
         * with a new array containing copies of original array's element.
         *
         * Deep copy happens on single-dimensional array copy operation, and
         * it will create a new array object.
         */
        int[] arr = {1,2,3,4,5,6};
        int[] clonearr = arr.clone();
        System.out.println(arr == clonearr);// false
        /**
         * Shadow copy happens on multidimensional array copy operation, it will create a
         * single new array with each element array, but each element array will
         * reference to the original subarray.
         *
         */
        int[][] arr1 = {{1,2,3,4,5,4},{2,4,6,7,7}};
        int[][] clonearr1 = arr1.clone();
        System.out.println(arr1 == clonearr1);// false
        System.out.println(arr1[1] == clonearr1[1]);// true
    }

}
