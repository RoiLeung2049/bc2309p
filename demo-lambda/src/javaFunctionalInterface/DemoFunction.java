package javaFunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.HashMap;
import java.util.Map;

public class DemoFunction {
  
  

  public static void main(String[] args) {
    
    // R applyy (T t)

    Function<String,Integer> convertFunction = (String d) -> {
      return d.length();
    };


    Function<Integer,Integer> dAdd = D -> D + 2 ;  //dAdd is a function object 
    
    System.out.println(convertFunction.apply("Hello World"));



    BiFunction<String,String,String> concat = (s1,s2)->{
        return s1.concat(s2);
    };

    System.out.println(concat.apply("Hello","World"));


    //Example of lambda 
  Map<String, Integer> nameLengthMap= new HashMap<>();
  nameLengthMap.put("John",10);
  nameLengthMap.put("Mary",1000);
  System.out.println(nameLengthMap.get("Tommy"));
  System.out.println(nameLengthMap.computeIfAbsent("Tommy",d -> d.length()));
  System.out.println(nameLengthMap.size());// the key Tommy has been put inside nameLengthMap
  // lambda is let you control the decision  step in conditional case 

  nameLengthMap.merge("John", 4, (v1 ,v2)-> v1 * v2); // 10 * 4
 // nameLengthMap.compute();
    System.out.println(nameLengthMap.get("John"));
    
  }
}
