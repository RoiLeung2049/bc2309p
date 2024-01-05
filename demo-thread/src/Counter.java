public class Counter {


  public static int counter = 0 ; // class variable 


  public static void main(String[] args) {
    Thread t1 = new Thread( () -> counter++) ; // runable is a void method
    // since runable is a functional interfae , so we can use lambda expression to implmement run) 
    t1.start();
    Thread t2 = new Thread(() -> {
      counter++;
    }
    );


    t2.start();


    System.out.println("counter =" + counter );
    System.out.println("main() ends.");
  }

  
}
