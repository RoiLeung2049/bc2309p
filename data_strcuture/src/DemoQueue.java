import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoQueue {

  public static void main(String[] args) {
    // if LinkedList has 100 method. 
    Queue<String> strings = new LinkedList<>() ; 
    // Queue is an inteface , . 
    // LinikedList has implmemented Queue and List. 
    // at Compile-time, obj-ref, strings, can only call the methods in Queue only. 
    // we can't call inedxOf() method in strings.  It is because it is not the method of type Queue 
    //IndexOf is thhe method from LinkedList
    // we can do the ssame for List 
  
    Queue<Integer> Q =  new LinkedList<>() ; 
    strings.add("ABC");
    strings.add("IJK");
    strings.add("DEF");
    
    System.out.println(strings);
    String polledString = strings.poll();
    //System.out.println(polledString);
    System.out.println(strings);
    System.out.println(strings.isEmpty());

    int counter = 3 ;// return IJKIJK DEFDEFDEF
    String polled = "" ; 

    String head = strings.peek(); //
    int size = strings.size() ; // 2 
    System.out.println(strings.peek()); // it retruns the value of the heads of the queue . 

    strings.addAll(List.of("XYZ","MNO"));
    System.out.println(strings);

    int queueCount = 0 ; 
    
    while (!strings.isEmpty()){

  //      if(counter <=0){
 //         break;
 //       }
        polled = strings.poll();
        queueCount++ ; 
        strings.add(polled.concat(polled)); 
        if(queueCount >= size*2){
          break ; 
        }
      }
      System.out.println(strings);
      System.out.println(strings.size()); 
      // how to genreally know the head element return to the queue again . 
      System.out.println(strings.contains("MNO"));
      for(String s : strings){
        System.out.println(s);
      }
      System.out.println("EEEEEEEEEE");
      strings.remove();
         for(String s : strings){
        System.out.println(s);
      }
         System.out.println("FFFFFFFFFFFF");
     System.out.println( strings.remove("MNOMNO"));
         for(String s : strings){
        System.out.println(s);
      }
     // String tmp =  strings.poll();
    //  System.out.println(tmp);
    

     System.out.println(strings.isEmpty());
    
    List<String> strings2= new LinkedList<>();

    

    // Both strings and Strings are reducing the method usage of LinkedList() . 


    
  }
  
}
