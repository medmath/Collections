package CollectionDay2;

import java.util.Comparator;

public class Customer implements Comparable<Customer>{

    private int Id;
    private String name;


    public Customer(int Id, String name){
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
            public int compareTo(Customer o) {
                return this.getName().compareTo(o.name);
            }

            @Override
            public String toString() {
                return "Customer{" +
                        "Id=" + Id +
                        ", name='" + name + '\'' +
                        '}';
            }



}


