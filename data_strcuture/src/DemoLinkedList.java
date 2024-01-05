import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {
  
  public static void main(String[] args) {
    LinkedList<String> strings = new LinkedList<>();
    // it implements List. 
    strings.add("hello");
    strings.add("world");

    ArrayList<String> string6 = new ArrayList<>() ; 
    
    System.out.println(strings.contains("world"));

    List<String> string2 = getEmptyList(0); // return an object 
    string2.add("hello");
    string2.add("world");

    
    List<String> nl4 = new ArrayList<>();
    nl4 = new LinkedList<>(); // at compile time in JAVA, nl4's method is determined by type List<String> 
    // when you run this program, the runtime understand nl4 has implemted to ArrayList<>() . 
    // at complie time , it will not read code. it has been read at runtime. 
    //Runtime in java :nl4 will know which object it point to. 
    // at the code of add, there is no code. it is beacuse it will be determined in runtime. ( recall list is an interface )
    nl4.add("ABC");
    nl4.remove(0);// remove element in index 0 
    System.out.println(nl4.size());
    
  }

  public static List<String> getEmptyList(int value){ // it returns interface type
    if (  value == 0 ){
      return new ArrayList<>();
    
    }
    return new LinkedList<>(); // this method is sound it is because of polymorphism
  }
}
