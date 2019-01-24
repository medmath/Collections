package Others;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {

        List <String> abc= new ArrayList<>();

        abc.add("aa");
        abc.add("cc");
        abc.add("bb");
        abc.add("bb");
        abc.add("a");
        System.out.println(abc);

        Collections.sort(abc);
        System.out.println(abc);


        int k=Collections.frequency(abc,"b");
        System.out.println(k);
    }


}
