package CollectionDay2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainEmployee {
    public static void main(String[] args) {


        List<Employee1> emp1 = new ArrayList<>();
        emp1.add(new Employee1(19, "zahit"));
        emp1.add(new Employee1(24, "murat"));
        emp1.add(new Employee1(37, "tarik"));
        emp1.add(new Employee1(28, "hasim"));


//        Comparator<Employee1> firstComp = new SortUpDown();
//        Collections.sort(emp1, firstComp);


        Collections.sort(emp1,new SortUpDown());
        System.out.println(emp1);


    }
}