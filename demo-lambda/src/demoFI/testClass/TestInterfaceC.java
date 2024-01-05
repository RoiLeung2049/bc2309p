package demoFI.testClass;

public class TestInterfaceC implements TestInterfaceA , TestIntercefaceB{

  @Override
  public void doSomething(){
    System.out.println("This is from Interface C ");
  }

  public static void main(String[] args) {
    
    TestIntercefaceB iB = new TestInterfaceC() ; 
    iB.doSomethingA(); // This is from Interface C 
    //iB.doTwo();


  }
  
}
