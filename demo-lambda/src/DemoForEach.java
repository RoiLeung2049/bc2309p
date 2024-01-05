import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DemoForEach {


  public static void main(String[] args) {
    String[] strings = new String[]{"abc","def","ijk"};

    for(String s : strings){// For-eadch supportsarray and list 
      System.out.println(s); 
    }

    List<String> sList = List.of("abc","def","ijk");// Jusr for read , update. cannot add 
    List<String> sList2 = new ArrayList<>();
    sList2.add("abc");
    sList2.add("def");
    sList2.add("ijk"); 
    
    List<String> sList3 = new ArrayList<>(List.of("abc","def","ijk"));

    sList2.forEach(x ->{
        System.out.println("hello"+ x) ; 
    }// Consumer : x -> {} ; i use x inside
      
    );
    // T is the String type ,  
    //Consumer means return nothing . like void method , for--each 



    Consumer<String> consumer = new Sysout(); // Consumer is interface , it can be implmemented by Sysout 
    sList2.forEach(consumer);// the obj consumer is an object that encapulation the functionality in it. 
    



  }
  
}
