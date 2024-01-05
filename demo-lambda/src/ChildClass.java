public class ChildClass extends ParentClass{

  public ChildClass(){

  }


  public void doSomething(){
    System.out.println("from Child") ; 
  }


  public static void main(String[] args) {
    
    ParentClass C = new ChildClass();

    C.doSomething();

  }
  
}
