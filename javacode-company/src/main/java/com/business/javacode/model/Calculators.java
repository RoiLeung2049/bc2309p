package com.business.javacode.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Calculators {


  public static int add(int d , int j){ // unit 
    // we need to define the method signature before defining the test cases
    return d + j ; 
  }

// ascending order 
  public static List<Integer> sort(int[] arr){
    
    List<Integer> tmpl = Arrays.stream(arr).boxed().collect(Collectors.toList()) ;
    //tmpL.sort( );
    Collections.sort(tmpl);
    return tmpl;  


  }



  
  // unit test : from calculate() method perspective, we don;t need to know what exactly add() method 
  //performs 
  // it is because add has been well tested above 
  // when p = 10 , and assume add(p,p/2) return 3 , then calcualte shoud return 17 
// we should not care or worry about add(p,p/2) . it is beacuse the function 
// has been checked or tested above. 
// then this unit's testing is wehther p + 4 part
// so add(p, p/2) can be used with "SOME" ASSUMPTION  
  public  int calculate( int p ){ // this is 1 unit , we test all possible case 
    return  addition(p,p/2) + p + 4; 
  }

  public int addition(int x , int y){ // unit test 
    return x + y ; 
  }


  
}
