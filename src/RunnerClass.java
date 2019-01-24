import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RunnerClass {
    public static void main(String[] args) {


        List<Student> emp= new ArrayList<>();
        emp.add(new Student(17,"Nazmi"));
        emp.add(new Student(16, "Necmi"));
        emp.add(new Student(16,"Husnu"));
        emp.add(new Student(35,"Azmi"));

        Comparator<Student> stIDComp= new IDComparator();
        //Collections.sort(emp,stIDComp);

        Comparator<Student> stRevNameComp= new ReversedNameComparator();
        //Collections.sort(emp,stRevNameComp);


        Comparator<Student> both= stIDComp.thenComparing(stRevNameComp);
        Collections.sort(emp,both);
        System.out.println(emp);

        Comparator<Student> lCom=Comparator.comparing(d->d.getAge());
        Collections.sort(emp,lCom);
        System.out.println(emp);

//        Collections.sort(emp, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });
        //System.out.println(emp);
    }
}
