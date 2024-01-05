package shape;

import java.math.BigDecimal;
import java.util.List;

public abstract class Shape {

  abstract double area(); // no need to implment 

  public static <T extends Shape> double totalArea( List<T> shapes){ // the main reason for you of use polymorphsim is because of your inplmentation of abstract class Shape for T 
      BigDecimal tmp = new BigDecimal(0) ; 
       for (T s : shapes ){
       tmp =  tmp.add(BigDecimal.valueOf( s.area())); // recall .add will retrun a Bigdemcial , so new big decimal obejct return so need to put into tmp in lhs 
       }
       return tmp.doubleValue() ; // with Shape class defined, it is much finer than using Object the big class .  
  }



  public static void main(String[] args) {

      System.out.println(Shape.totalArea(List.of(new Circle(1.0),new Square(2.0))));
      // 3.14 + 2 +  2 = 7.14 ; 

      

  }
  
}
