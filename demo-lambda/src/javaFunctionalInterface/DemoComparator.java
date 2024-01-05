package javaFunctionalInterface;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Queue;


public class DemoComparator {
    //int compare ( T t1 , T t2)


    public static void main(String[] args) {
          Comparator<Customer> sortByName =  (c1 , c2) ->  c1.getName().compareTo(c2.getName());

    Comparator<Customer> sortByJoinDate = (c1 ,c2) -> c1.getJDate().isBefore(c2.getJDate()) ? 1 : -1 ; 

    Comparator<Customer> sortByNameAndThenJoinDate = sortByName.thenComparing(sortByJoinDate);


    Customer a1 = new Customer("John", LocalDate.of(2000, 10, 7));
    Customer a2 = new Customer("Peter", LocalDate.of(2012, 10, 7));
    Customer a3 = new Customer("Charles", LocalDate.of(2004, 10, 7));


    List<Customer> customers = new ArrayList<> (List.of(a1,a2,a3));
    List<Customer> customers1 = new ArrayList<>(customers);
    //customers.indexOf(customers1)
    ArrayList<Customer> c = new ArrayList<>(List.of(a1,a1));
    
     System.out.println("test constructor :" + List.of(a1,a1,a3));   
    
    System.out.println(customers);

   Collections.sort(customers,sortByNameAndThenJoinDate);

   Collections.sort(customers,(c1 , c2) ->  c1.getName().compareTo(c2.getName()));

   System.out.println(customers);

    
   //int[]  iArr = new  int[] { 1 ,2 ,3 };
    List<String> sListt = new ArrayList<>();
    
   
    }


}
