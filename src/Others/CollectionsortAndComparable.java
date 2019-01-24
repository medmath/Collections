package Others;

import java.util.*;

public class CollectionsortAndComparable {

    public static void main(String[] args) {

       // Collection<String> col= new ArrayList<>();
        List<String> col= new ArrayList<>();
        col.add("apple");
        col.add("orange");
        col.add("banana");
        col.add("apple");
        col.add("apple");



        Collections.sort(col);
        for (String each:col
        ) {
            System.out.println(each);
        }
        System.out.println();


    /*   Collection<String> col= new ArrayList<>();
        Set<String> col1= new ArrayList<>();

        col.add("apple");
        col.add("orange");
        col.add("banana");
        col.add("apple");
        col.add("apple");

        //System.out.println(col);


        for (String h:col
             ) {
            //System.out.println(h);
        }

        col=new LinkedList<>();
        ((LinkedList<String>) col).addFirst("avacado");
        System.out.println(((LinkedList<String>) col).get(0));
        //System.out.println(col);




        //Collections.sort(col);

        //System.out.println(col);

        Collections.sort(col);
        System.out.println(col);

        int a=Collections.frequency(col,"apple");

        System.out.println(a);

*/







    }


}
