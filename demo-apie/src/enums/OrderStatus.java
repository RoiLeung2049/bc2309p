//package demo-apie.enums;
package enums;

public enum OrderStatus {
  ORDERED(1), // they are OrderStatus method 
  PRODUCTION(2),
  SHIPPED(3),
  DELIEVERED(4),
  CLOSE(5),
  ;


  private int statusCode;

  private OrderStatus( int statusCode){
    this.statusCode = statusCode;
  }

  public OrderStatus getOrderStatus (int statusCode){

    for(OrderStatus s : OrderStatus.values()){
      if (s.getStatusCode()== statusCode)
        return s;
    }
    return null;
    //return this.values()[statusCode];
  }

  public int getStatusCode(){
    return this.statusCode;
  }


  // for enum, no need for equals , it is because , for 2 enum objects check if  both ( java obj but not obj in heap) object are the same. 
  // same as equals() , no need to do hashcode() 
  // 
  // manageg status
  //1. return next statsus 
  //

  public OrderStatus next(){
        int code = this.statusCode < 5 ? this.statusCode +1 : this.statusCode;
        return getOrderStatus(code);
      }
  
  public boolean isForwardedStatus(OrderStatus orderStatus){
    return this.statusCode < orderStatus.getStatusCode();
  }
  


  public static void main(String[] args) {
    //  OrderStatus d ;
      System.out.println(OrderStatus.CLOSE.next()); // return OrderStatus.CLOSE 
  }
}
