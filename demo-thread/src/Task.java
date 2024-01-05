public class Task implements Runnable{ // create a Thread


  @Override
  public void run(){
    for ( int i= 0; i < 1 ; i++ ){

      try{
          Thread.sleep(5000);
      } catch (InterruptedException e){

      }
      
      System.out.println("Task 1 is completed.");

    }
  }

  public static void main(String[] args) {
    Task task = new Task ();
  //  task.run() ; 
 //   System.out.println("task is completed") ; 

    // aternatively wecan create a thread by using Thread class 

    Task2 task2 = new Task2() ;
   

    Thread t1 = new Thread(task); // with sleep 5 seconds
    t1.start() ;  // no blocking , so the main program keep going  ( and then going to make thread t2 )
   // System.out.println("task 2 is completed") ; 

    Thread t2 = new Thread(task2); // without sleep
    t2.start() ; // create another thread 
   // t2.run();
    System.out.println("main() ends") ; // thread 1 by main 

    
    Task3 ct = new Task3();
    ct.start() ; 
    



  }


}