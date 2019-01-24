import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        List<String> programs= new ArrayList<>();
        programs.add("phyton");
        programs.add("c++");
        programs.add("java");

        Collections.sort(programs,new GreatestToLowest() );
        for (String each:programs
             ) {
            System.out.println(each);





        }

    }





}

class GreatestToLowest implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {

        return -o1.compareTo(o2);

    }

}

class Player{
    private String isim;

    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "|||| ID: " + id + " İsim :" + isim + " |||";

    }

}


