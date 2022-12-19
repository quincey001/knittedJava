package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class ArrayListDuplica {
    public static void main(String[] args){
        /**
         * remove duplicated number in arraylist
         */
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,33,3,3,3,34,4,4,5,334,6,7,8,9));

        // create a linkedhashset
        LinkedHashSet<Integer> unit = new LinkedHashSet<>(numbers);
        ArrayList<Integer> unitNumbers = new ArrayList<Integer>(unit);
        System.out.println(unitNumbers);
    }
}
