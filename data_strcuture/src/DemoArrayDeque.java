import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DemoArrayDeque {

  public static void main(String[] args) {
      Queue<String> Dq = new ArrayDeque<>() ;

  Queue<String> Dq2 = new LinkedList<>();

  for (int i = 0 ; i <1000000 ; i++){
    Dq.add("Test "+ i);
  }


  for (int i = 0 ; i < 1000000 ; i++){
    Dq2.add("Test "+ i);
  }
  

  long start1 = System.currentTimeMillis();
//  while(!Dq.isEmpty()){
//    Dq.poll();
  //}
  long end1 =System.nanoTime();

  System.out.println("DQ's execution time :" + (end1 - start1));

    long start2 = System.currentTimeMillis();
 // while(!Dq2.isEmpty()){
  //  Dq2.poll();
  //}
  long end2 =System.nanoTime();

  System.out.println("DQ2's execution time :" + (end2 - start2));

  System.out.println("Which one is faster :" + ((end2 - start2)> (end1 - start1) ? "DQ" :"DQ2"));

    // no matter the obj ref is Queue or Deque , the running code performance is determined by RHS , the obj at heap. so it will not have much affection at performance . 

    Deque<String> deque = (Deque) Dq ; // for casting of Queue type int o Deque. complier can let you do this. and it has been checked by complie time 
    // 1. There is no new object created in memory . 
    // 2. there are teo object refernce (Deque & Queue)  which pointing to the same object ( new ArrayDeque) 
    // 3. During Run-time, JVM wil check if the object fulfill the obj refernce reference's type . 
    // Potentially, run-time error . 
    // deque has more methods then Dq , since Dq is of type Queue. deque is of type Deque. 
    
    // SOLUTION for type safety   , isInstanceOf()
    if(Dq instanceof Deque<?>){  
      // make sure Dq can be put into type Deque  , it tell complier to help you check the type safety. so there is no type safety complain. 
         deque = (Deque<String>)Dq ; // this action release the hide method which is determined by the type of obj reference . 
    }

    System.out.println(deque.peek());


    /// reveerse case 

    Deque<Integer> dequeintegers  = new LinkedList() ; 
    Queue<Integer> queueInteger = dequeintegers; // there is no type safety . it is bcauses Queue is the parent of Deque . 
    // so the LinedList can be put inside Queue 
    /// Because Deque is a child of Queue . 
    //  Complier ensure queueInteger can hold the object new LinkedList().
    // 



    


  }

  


}
