import java.util.ArrayList;
import java.util.LinkedList;

public class DemoArrayLinked {

  public static void main(String[] args) {
    // by ArrayList add 10,000,000
       
        ArrayList<Integer> arr = new ArrayList<>();
        for( int i= 0 ; i < 100000000; i++){
            arr.add(i);
        }
        long start = System.currentTimeMillis();
        System.out.println(start);

        for( int i= 0 ; i < 10000; i++){
            arr.remove(0);
        }

        long end = System.nanoTime();
        System.out.println("ArrayList' remove Execution time= " + ( end -start));
  
        // by LinkedList 

        LinkedList<Integer> lis = new LinkedList<>();
        for( int i= 0 ; i < 100000000; i++){
            lis.add(i);
        }

        long start2 = System.currentTimeMillis();
        System.out.println(start2);
        for( int i= 0 ; i < 10000; i++){
            lis.remove(0);
        }
        long end2 = System.nanoTime();

        System.out.println("LinkedList's Execution time= " + ( end2 -start2));

        


        System.out.println("which is faster ?" + (( end2 -start2) > ( end -start) ? " ArrayList" : " LinkedList"));
        //...........................
}
  }

