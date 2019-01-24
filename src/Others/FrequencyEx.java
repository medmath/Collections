package Others;

import java.util.*;

public class FrequencyEx {
    public static void main(String[] args) {
        String str="abcadeghkfbccegg";

        String[] str1=str.split("");
        //System.out.println(str1[6]);
        List<String> arr=new ArrayList<>();
        for (String x:str1
             ) {
            arr.add(x);
        }

        Map<String, Integer> mapFre=new HashMap<>();

        for (String each:
             str1) {
            if(!mapFre.containsKey(each)){
               mapFre.put(each,1);
            }else{
                int count=mapFre.get(each);
                mapFre.put(each,count+1);

            }

        }
        System.out.println(mapFre);
        int frecol=Collections.frequency(arr,"c");
        System.out.println(frecol);
    }
}
