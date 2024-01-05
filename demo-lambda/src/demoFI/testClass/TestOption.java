package demoFI.testClass;

public interface  TestOption {

  
  // test data member  , need to be instantiated
   final double strike = 100  ; 
   public  String description =" this is an option base class." ; 
   public abstract double IV(double strike, double spot ) ;


   static void doSomething() {
     System.out.println("SSS") ; 
   }
}
