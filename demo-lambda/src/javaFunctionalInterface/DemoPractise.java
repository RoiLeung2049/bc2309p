package javaFunctionalInterface;

import java.util.List;
import java.util.ArrayList;

public class DemoPractise {



  public static void main(String[] args) {
      // normal for loop 
  List<String> sList = new ArrayList<>();
  sList.add("Hello");
  sList.add(" ");
  sList.add("World"); 
  sList.add("!");
  System.out.println(sList);
  // for loop 
  for (String a : sList){
    System.out.println(a.concat(" ").concat(a));
  }


  // modern version  , use forEach method with  Consumer interface 
  sList.forEach(x -> System.out.println(x.concat(" | ").concat(x)));

  sList.sort( (s1 ,s2) -> s1.compareTo(s2));
  System.out.println(sList);
  }
 
  

  
}
