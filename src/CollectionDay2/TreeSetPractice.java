
package CollectionDay2;

import java.util.Comparator;
import java.util.TreeSet;


public class TreeSetPractice {

    public static void main(String[] args) {
     //Comparator<String> lastC = new LastCharacterCompare();
//alphabetically sorted

        Comparator<String> sChar= Comparator.comparing(str->str.charAt(1));


        //TreeSet<String> sTree= new TreeSet<>(lastC);
        TreeSet<String> sTree= new TreeSet<>(sChar);
        sTree.add("zombf");
        sTree.add("om");
        sTree.add("mbi");
        sTree.add("abz");
        sTree.add("umb");

        System.out.println(sTree);
        System.out.println(sTree.size());
//Comparator<LastCharacterCompare> lcomp=Comparator.comparing(s->s.compare());
    }

}
//    class LastCharacterCompare implements Comparator<String>{
//
//
//        @Override
//        public int compare(String o1, String o2) {
//      // return -o1.substring(o1.length()-1).compareTo(o2.substring(o2.length()-1));
//        return 0;
//        }
//
//
//    }