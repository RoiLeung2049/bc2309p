import java.math.BigDecimal;

public class OrderItem {
  private int quantity ; 
  private double unitPrice ; 


  public double getPrice(){
    return this.unitPrice;
  }


  public OrderItem(int quantity, double unitP){
    this.quantity = quantity;
    this.unitPrice = unitP;
  }
  public BigDecimal itemTotal(){

    return  (BigDecimal.valueOf(this.quantity).multiply(BigDecimal.valueOf(unitPrice))) ;
  }
  
  public static void main(String[] args) {
    OrderItem o = new OrderItem(100, 20);
    System.out.println(o.itemTotal());
  }
}
