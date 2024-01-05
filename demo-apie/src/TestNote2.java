public class TestNote2 extends TestNote{

  int i = 4; 
  




  public static void main(String[] args) {
    TestNote2 t2 = new TestNote2(); 

    System.out.println(((TestNote)t2).i);

    Integer i = 600 ; 
    Integer q = 600;
    Integer w = i ; 
    Integer j = i ; 

    System.out.println(i==q);// true
    
    TestNote2 rrr = new TestNote2();
    System.out.println(rrr.i);
    System.out.println(((TestNote)rrr).i); // output : parent class attribute.
  }


}
