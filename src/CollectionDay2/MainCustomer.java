package CollectionDay2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

        public class MainCustomer
        {
             public static void main(String[] args) {


        List<Customer> cust= new ArrayList<>();
        cust.add(new Customer(19, "zahit"));
        cust.add(new Customer(24, "murat"));
        cust.add(new Customer(37,"tarik"));
        cust.add(new Customer(28, "hasim"));


                 Collections.sort(cust);
                 System.out.println(cust);



    }
}
