package CollectionDay2;

import java.util.*;
import java.util.stream.Collectors;

public class MapPractice {

    public static void main(String[] args) {

        // Type<typeOfItem> -----

        // Type<KeyType, ValueType> ----

        // i want to store country and gold medal count as per item


        Map<String, Integer> ctMedalMap = new HashMap<>() ;
        ctMedalMap.put("USA", 28) ;
        ctMedalMap.put("UK", 20) ;
        ctMedalMap.put("France", 17) ;
        ctMedalMap.put("Italy", 25) ;
        ctMedalMap.put("Italy", 100) ;

        System.out.println(ctMedalMap);

//		// CRUD Operation ---> Create , Read/Retrieve, Update, Delete
//		System.out.println(  ctMedalMap.get("USA")  );
//
//		Integer cntOfItaly = ctMedalMap.get("Italy")  ;
//		System.out.println(cntOfItaly);
//
//		ctMedalMap.replace("Italy", 50) ;
//		System.out.println( "New Italy Count: " + ctMedalMap.get("Italy")   );
//
//		ctMedalMap.remove("Italy") ;
//		System.out.println(ctMedalMap);
//
        /*
         * Create a map of Long , String to represent
         * product ID and product name
         * add 5 items , try to add duplicate and see what happen
         * read first 3 values
         * update second product name
         * remove last product
         *
         * print out each time you do a change
         *
         * */


//VASYL
        Map<String,Integer> records = new HashMap<>();
        records.put("apple", 1);

        List<Map<String ,Integer>> listOfMaps = new ArrayList<Map<String,Integer>>();

        listOfMaps.add(records);
        System.out.println(listOfMaps);

        for(Map<String, Integer> record: listOfMaps) {
            System.out.println(record.get("apple"));



        }
//        Map<String,Integer> records = new HashMap<>();
//
//        records.put("apple", 1);

        for(Map.Entry<String, Integer> map: records.entrySet()) {
            System.out.println(map.getKey()+" :: "+map.getValue());
        }
        List<String> list = new ArrayList<>();
        list.add("orange");
        list.add("apple");
        list.add("lemon");
        System.out.println(list);
        list = list.stream().filter(p -> p.equals("orange")).collect(Collectors.toList());
        System.out.println(list);




//        List<String> list = Arrays.asList("geeks", "gfg", "g", "e", "e", "k", "s");
//
//        // Using Stream map(Function mapper) to
//        // convert the Strings in stream to
//        // UpperCase form
//        List<String> answer = list.stream().map(p -> p.toLowerCase()).collect(Collectors.toList());
//        System.out.println(answer);
//        answer.sort(Collections.reverseOrder());
//        System.out.println(answer);
//        // displaying the new stream of UpperCase Strings
//        answer = answer.stream().map(p -> p.toUpperCase()).collect(Collectors.toList());
//        System.out.println(answer);
//        answer.removeIf(p -> p.startsWith("G"));
//        System.out.println(answer);
//        answer = answer.stream().filter(p -> p.equals("K")).collect(Collectors.toList());
//        System.out.println(answer);
//
        ///hello family  git checkout feature
    }
public void add(int a){
    System.out.println(2*a+5);
}
}

