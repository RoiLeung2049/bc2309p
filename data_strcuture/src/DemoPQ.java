import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPQ {

  public static void main(String[] args) {
    Queue<Integer> pq = new PriorityQueue<>(new SortByIntegerDesc());
    pq.add(40);
    pq.add(20);
    pq.add(15);
    pq.add(150);


    while(!(pq.isEmpty())){
      System.out.println(pq.poll());
    } // the output has been sorted. 





      Queue<String> pq2 = new PriorityQueue<>(new SortByStringDec()) ; 
      pq2.add("Apple");
      pq2.add("Coy");
      pq2.add("Bat");

      
      while(!(pq2.isEmpty())){
      System.out.println(pq2.poll());
    } // the output has been sorted not under natural order . 

  }
  





}
