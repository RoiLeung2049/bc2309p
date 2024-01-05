import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomHashMap {

  public static void main(String[] args) {
    Map<Integer,OrderItem> itemMap = new HashMap<>() ; 
    itemMap.put(1,new OrderItem(3, 4.5));
    itemMap.put(2, new OrderItem(4, 5.5));
    itemMap.put(3, new OrderItem(5, 10.5));

    OrderItem orderItem = itemMap.get(3); //
    System.out.println(orderItem.getPrice());




    Map<Customer, List<Order> > cusMap = new HashMap<>() ; 
    // NOW Customer is the key of thhe HashMap 
    // how can we use Customer as key?
    // we need to use .equals() method to determine 
    // recal if we don;t implement the equals() method then it will compare the memoery address

    Customer c1 = new Customer("John");
    Customer c2 = new Customer("John"); 
    cusMap.put(c1,List.of(new Order(),new Order()));
    cusMap.put(c2, List.of(new Order(), new Order(),new Order())); // will c2 operation override c1's input ?
    System.out.println(cusMap.size()); // 2 . it is becaus  c1 and c2 are different  since we are using by defaualt comparing memoery address in equals() . 

    System.out.println(cusMap.get(c1).size());
    System.out.println(cusMap.get(c2).size()); 
    
  }


  
}
