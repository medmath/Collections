package CollectionDay2;

import java.util.*;

public class SortedMapTreeMap {
    public static void main(String[] args) {

        Comparator<Integer> cI= new KeyReverseComparator();

        SortedMap<Integer, String> product = new TreeMap<>(cI);


        product.put(123, "book");
        product.put(23, "table");
        product.put(300, "pen");
        product.put(12, "bed");
        product.put(50, "pan");

        System.out.println(product);





    }
}

class KeyReverseComparator implements Comparator<Integer>{


    @Override
    public int compare(Integer o1, Integer o2) {
//        if(o1>o2)
//            return -1;
//        else if(o1<o2)
//            return 1;
//
//        return 0;


    return -o1+o2;
    }
}