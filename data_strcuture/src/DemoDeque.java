import java.util.Deque;
import java.util.LinkedList;

public class DemoDeque {

  public static void main(String[] args) {
    // inteface(Deque)
    
    Deque<Customer> customers = new LinkedList<>() ; 
    // it hides the methods of List, it only contains Deque methods . it can be released 
    customers.add(new Customer("Apple")); // same as addList() ;
    customers.addFirst(new Customer("Boolean"));
    customers.addLast(new Customer("Cat"));
    customers.getFirst();
    System.out.println(customers.peek().toString());// Boolean
    System.out.println(customers);

    customers.remove(); // same as remove first 
    System.out.println(customers.peek());// Apple 

    customers.pop(); 
    System.out.println(customers); // [Cat]

    customers.add(new Customer("String"));
    System.out.println(customers); // [Cat , String]
    customers.push(new Customer("String"));
    System.out.println(customers); // [String Cat String]


    
  }
  
}
