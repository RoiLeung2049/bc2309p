import java.math.BigDecimal;
import java.util.ArrayList;

public class Order {
 // private String orderNo ;
  private ArrayList<OrderItem> orderItems ; 
  private int orderNo ;
  public static int counter = 0 ; 

  public Order(){
    this.orderItems = new ArrayList<OrderItem>();
    int numOfOrder = this.orderItems.toArray().length;
    this.orderNo = numOfOrder+1 ; 
  }

  public boolean addItem(OrderItem orderItem){
    return this.orderItems.add(orderItem);
  }

  public double total(){
     BigDecimal output = BigDecimal.valueOf(0) ; 
     for ( OrderItem o : orderItems){
       output =  output.add(o.itemTotal()); // total .add create a new Bigdecimal obj , it has to be pointed by the original obj ref output so we havve output = output.add 
     }
     return output.doubleValue();
  }
  public static void main(String[] args) {
    Order order = new Order();
    order.addItem(new OrderItem(3,3.4));
    order.addItem(new OrderItem(9, 1.5));
    System.out.println(order.total());
  }
}
