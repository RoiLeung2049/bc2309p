import java.math.BigDecimal;

public class TestMonkey extends TestAnimal{

  public BigDecimal rr ;
  @Override
   public void sound(){
      System.out.println("This is the sound of Monkey");
  }

  public TestMonkey(){

  }

  public TestMonkey(String N , int A , int W){
    super(N,A,W);

  }
  

  public static void display(){
    System.out.println(" this is a test Monkey static method.");
  }
  public void monkeytalk(){
    System.out.println("Monkey talk");
  }
  @Override
  public void sleep(){
    System.out.println("I TestMonkey sleep.");
  }

  public void test(BigDecimal F){
    this.rr = F ; 
  }
  public static void main(String[] args) {
    TestMonkey TT = new TestMonkey("R",1 ,2 );
    TT.sound();
    TT.sleep() ; 
    TestAnimal tt = new TestMonkey("B",2,3);
    tt.sleep(); // I TestMonkey sleep 
    
    TT.display();//test moneky
    tt.display(); // base


    int i = 4; 
    TT.test(BigDecimal.valueOf(i));
    System.out.println(TT.rr.toString());

  }
}