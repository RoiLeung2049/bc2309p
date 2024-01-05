import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Objects;

public class Customer {
    private ArrayList<Order>  Orders;
    private String name;

    public Customer(){
      this.Orders = new ArrayList<>();
    }

    public Customer(String name ){
      this.name = name ;
      this.Orders= new ArrayList<Order>(); 

    }
    public boolean isVIP(){
      // >= 2 order && order total > 50 ; 
        return (this.Orders.size()>=2) &&(this.totalOrderAmount()>= 2)? true : false ; 
    }

    public boolean add( Order order ){
      return this.Orders.add(order);

    }
    @Override
    public String toString(){
        return this.name;
    } 
    public double totalOrderAmount(){

      BigDecimal output = BigDecimal.valueOf(0); 
      for ( Order  o :this.Orders){
        output = output.add(BigDecimal.valueOf(o.total()));
      }
      return output.doubleValue() ; 
    }
    @Override
    public boolean equals(Object obj){

      if ( this == obj)
        return true;
      if(!(obj instanceof Customer))
          return false;
      Customer c = (Customer) obj ;
      if( this.name.equals(c.name))
        return true;
      return false;

    }
    @Override
    public int hashCode(){
      return Objects.hash(this.name); // to get the int from an input
    }
    

    

    public static void main(String[] args) {
      Order order = new Order();
      order.addItem(new OrderItem(3,3.4));
      order.addItem(new OrderItem(9, 1.5));
    //  System.out.println(order.total());

      Customer customer = new Customer ("John");
      Order order1 = new Order();
    //  order.addItem(new OrderItem(3,3.4));
      customer.add(order);
      System.out.println(customer.totalOrderAmount());
      System.out.println(customer.isVIP());

      
    }
}
