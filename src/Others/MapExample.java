package Others;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("balic", "balic", "balic", "adam", "bob", "bob");

        Map<String, Integer> mapfre = new HashMap<>();
        for (String each : names
        ) {
            if (!mapfre.containsKey(each)) {

                mapfre.put(each, 1);
            } else {

                int count = mapfre.get(each);

                mapfre.put(each, count + 1);
            }

        }
        System.out.println(mapfre);


    }




    }





