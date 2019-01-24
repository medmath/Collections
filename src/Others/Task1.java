package Others;

import java.util.*;

public class Task1 {

    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        System.out.println("Enter names:");
        List<String> ls= new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
        ls.add(sc.next());


        }
        System.out.println(ls.size());
        System.out.println(ls);


        Set<String> str= new HashSet<>(ls);
        System.out.println(str.size());
        System.out.println(str);

        for (String eachSet:str
             ) {
            int count=0;
            for (String each:ls
                 ) {
                if(eachSet.equals(each))
                count++;


            }
            System.out.println("String: "+eachSet+" count: "+count);
        }

int z=Collections.frequency(ls,"aa");
        System.out.println(z);

        //String name1,name2,name3,name4,name5;
//        List<String> ls= new ArrayList<>();
//        while(sc.hasNext()){
//            ls.add(sc.next());
//            if(sc.next().equals("quit"))
//                break;
//        }
//        System.out.println("original list: "+ls);
//        System.out.println(ls.size());
//
//        Set<String> strSet= new HashSet<>(ls);
//        System.out.println("new list: "+strSet);



    }

}
