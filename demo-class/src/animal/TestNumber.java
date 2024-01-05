package animal;

public class TestNumber {
  public static void main(String[] args) {
    Object x = 100; 
    Integer x2 = 100 ; // Integer class extends Number extends Object class 
    //Integer class is a final class, it means this class can't be extended. 
    // recall abstrct class can't be "new" ;
    Number n = Integer.valueOf(100) ; 
    n= Double.valueOf(10.3d); // Double extends Number as well 
    

    if ( n instanceof Integer){
      System.out.println("A");
    } else if ( n instanceof Double){
      System.out.println("B");
    }

  }//parent class is to filter the child class output 
  
}
