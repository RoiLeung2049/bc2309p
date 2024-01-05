package demoFI.testClass2;
import demoFI.testClass.TestClass;

public class TestClassEx extends TestClass{

  public int ff = 3;
  TestClassEx(){
    super() ; 
    ff = super.glass ; 
    System.out.println("Test ex e");
    }

  public static void main(String[] args) {


    TestClassEx tex = new TestClassEx() ; 
    System.out.println(tex.ff) ; 
    tex.getValueG();
    

  }


  
}
