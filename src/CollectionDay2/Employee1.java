package CollectionDay2;

import java.util.Comparator;

    public class Employee1 {

    private int Id;
    private String name;


    public Employee1(int Id, String name){
        this.Id=Id;
        this.name=name;

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Employee1{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }


}


    class SortUpDown implements Comparator<Employee1>{

        @Override
        public int compare(Employee1 o1, Employee1 o2) {
            return -o1.getName().compareTo(o2.getName());
        }
    }