import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;
public class TestDataStructure {

  public static void main(String[] args) {
    List<Integer> arrList = new ArrayList<>();
    arrList.add(3);
    arrList.add(4);
    ArrayList<Integer> arrList2 = new ArrayList<>() ; 
    Integer[] in = new Integer[3];
    //in.
    //in[1] = "string" ; 
    System.out.println(arrList);// [3]
    System.out.println(in); // return obj ref 

    boolean arrA = arrList.remove(Integer.valueOf(4));
    System.out.println(arrA);//false
    System.out.println(arrList.get(0));// 3
    arrList.toArray(in);
    
    //for (Integer r : in){
    //    System.out.println(r); // 3 
   // }

    // try to convert Array into ArrayLlist 
    arrList.addAll(Arrays.asList(in));

      
    System.out.println(arrList); // [3 ,  null, null] 

    // test linkedList 
    LinkedList<Integer> ll = new LinkedList<>();
    ll.add(1);
  
    List<Integer> l = new LinkedList<>();
    
    

  }
}
