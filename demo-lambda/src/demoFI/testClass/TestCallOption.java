package demoFI.testClass;

public class TestCallOption implements TestOption {

  public TestCallOption(){
    super();
    double s = TestOption.strike ; 
     

 

  }

   @Override
    public double IV(double strike, double spot) {
        return Math.max(strike - spot , 0) ; 
    }

    public static void main(String[] args) {
      
      String s = TestOption.description ; 
      TestOption.doSomething();

    }



}
