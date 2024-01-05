import java.lang.Math;
public class StringConcat {

  public static void main(String[] args) {
    Concat concat1 = (x,y) -> {
      String result = x + y ; 
      return result ;
    }; 

    Concat concat2 = (x1, x2)-> x1+ x2 ;  // in 1 line, it can't have return keyword 

    // call? 
    //Runtime execution
    System.out.println(concat1.concat("hello", "world"));
    



    MaxCal mc1 = (x, y) -> Math.max(x,y) ; 

    System.out.println(mc1.fire(1, 3));

  }
  
}
