import java.util.concurrent.atomic.AtomicInteger;

public class Counter2 {


  private static int counter = 0 ;  // problem at the int data type


  private static AtomicInteger atomicCounter = new AtomicInteger(0); // this data type has lock  to prevent 2 threads do the read at the same time. 
  public static void main(String[] args) throws InterruptedException {
    Thread t1 = new Thread( () ->{
      System.out.println("t1 starts");
      for( int i = 0 ; i < 10000000 ; i++){
        counter++; // this mean 2 steps : read the counter and then write the new counter value so there is competition of 2 threads ,  when this thread want to write the new value, it has been 
        // readed by another thread , so the value have not been updated correctly. 
        // more than 1 step; this metho is non-atomic method , or it is interruptable .  and it is not lockable. 
        // this create many problem for data strucctures we have learnt . 
        // we need to lock 
      }

      System.out.println( "t1 is completed");
    } ) ; // runable is a void method
    // since runable is a functional interfae , so we can use lambda expression to implmement run) 
    t1.start();
    
    Thread t2 = new Thread(() -> {
        System.out.println("t2 start") ;
            for( int i = 0 ; i < 10000000 ; i++){
        counter++;
      }

      System.out.println( "t2 is completed");

    }
    );


    t2.start();

    // jjoin thread  ( i.e. make 3 thread into single threa ( main thread) and make Main thread to wait for t1 and t2 
    t1.join();
    t2.join(); // 

    System.out.println("counter =" + counter ); 
    Thread t3 = new Thread(() ->{
      System.out.println("t3 start") ;
            for( int i = 0 ; i < 1000000 ; i++){
     //   counter++;
     atomicCounter.incrementAndGet() ; //similar to counter ++ 
      }

      System.out.println( "t3 is completed");
    });
    t3.start();


     Thread t4 = new Thread(() ->{
      System.out.println("t4 start") ;
            for( int i = 0 ; i < 1000000 ; i++){
     //   counter++;
     atomicCounter.incrementAndGet() ; //similar to counter ++ 
      }

      System.out.println( "t4 is completed");
    });
    
    t4.start();

    t3.join();
    t4.join();

    System.out.println("counter =" + atomicCounter.get() ); // the couter change every time . it is because the 
    System.out.println("main() ends.");



  }
  
}