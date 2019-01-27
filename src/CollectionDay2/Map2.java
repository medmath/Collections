package CollectionDay2;

import java.util.*;

public class Map2 {

    public static void main(String[] args) {

        Map<Integer, String> product = new HashMap<>();
        product.put(123, "book");
        product.put(23, "table");
        product.put(300, "pen");
        product.put(12, "bed");
        product.put(50, "pan");


        //System.out.println(product.size());
        product.put(17,"case");
       // System.out.println(product.size());
        product.remove(17);
        //System.out.println(product.size());

       // System.out.println(product.values());
        System.out.println(product.keySet());
        //System.out.println(product);// if it was like Map<Player, Integer>, it was printed as hashcodes


        //System.out.println(product.get(300));

        Set<Integer> keys=product.keySet();
        Collection<String> values= product.values();


//        for (Integer k:keys
//             ) {
//            System.out.println("Keys are: "+k);
//        }
//
//        for (String v:values
//             ) {
//            System.out.println(v);
//        }

        Set<Map.Entry<Integer,String>> entryS=product.entrySet();


        for (Map.Entry f:entryS
             ) {
            //System.out.println("KEy: "+f.getKey()+",  VAlue: "+f.getValue());
        }




        /*
        //        System.out.println(product.isEmpty());
//        System.out.println(product.containsKey(123));
//        System.out.println(product.containsValue("pencil"));

        //System.out.println( product.size() );

        //System.out.println(product);

        Set<Long> keyView=product.keySet();
        System.out.println(keyView);


        Collection<String> valueView= product.values();
        System.out.println(valueView);


        //Set<Entry<Long,String>> entryView= product.entrySet();
        Set<Map.Entry<Long,String>> entryView= product.entrySet();

        for (Map.Entry<Long, String>  h:entryView
             ) {
            System.out.println(h.getKey()+" "+ h.getValue());
        }





//        Set<Long> allkeys = product.keySet();
//        System.out.println(allkeys);
//
//        Collection<String> values = product.values();
//        System.out.println(values);
*/

    }




}

