package Others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class ComparingObjects {
    public static void main(String[] args) {

        Person p1= new Person("Nazmi",17);
        Person p2= new Person("Necmi",16);
        Person p3= new Person("Husnu",21);
        Person p4= new Person("Azmi",35);

        List<Person> emp= new ArrayList<>();
        emp.add(p1);
        emp.add(p2);
        emp.add(p3);
        emp.add(p4);


        Collections.sort(emp);
        System.out.println(emp);



//        for (Others.Person h:emp
//             ) {
//            System.out.println("Age: "+h.getAge()+", Name: "+ h.getName());
//        }









        List<String> names= Arrays.asList("Adam","Muzaffer", "Husnu", "Cevdet");
        Collections.sort(names);
        //System.out.println(names);

List<Integer> numbers=Arrays.asList(24,5,-1,10);
Collections.sort(numbers);
       // System.out.println(numbers);
    }



}
