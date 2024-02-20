package com;

import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;
import static org.hamcrest.MatcherAssert.*;
import com.business.javacode.model.Calculators;
//import static org.junit.jupiter.api.Assertions.*;
import com.business.javacode.model.Person;
import com.business.javacode.model.Staff;
import java.util.List ;


public class HamcrestTest {
  @Test
  void test(){
    assertThat(Calculators.add(3, 2), is(5));
  }    


    @Test
  void testB(){
    assertThat(Person.concat("world"), is("Helloworld")); // is has called .Equals() behind so need to implement .Equals()
    assertThat(Person.concat("world"), not("Hello"));
    assertThat(Calculators.add(4,7), is(not(greaterThan(11))));
    assertThat(Person.concat("world"), containsString("world")) ;  // similar to indexOf 

    String str = null ; 
    assertThat(null, is(nullValue())) ;



  }    


      @Test
    void testObject(){
      String s1 = "hello";
      String s2 = "hello" ; 
      assertThat(s1,sameInstance(s2)); 
      
    } 


    @Test 
    void testAll(){
      int value = 50 ; 
      assertThat(Calculators.add(50,5), allOf(greaterThan(54),lessThan(56),greaterThanOrEqualTo(55),lessThanOrEqualTo(55))) ;  // anyOf
    }




    @Test 
    void testArrayList(){

      List<String> names = new ArrayList<>(List.of("John","Peter","Tommy"));
      assertThat(names, hasItem("John"));
      assertThat(names, not(hasItem("Jenny")));
      assertThat(names,not(hasSize(4)));


      assertThat(names, contains("John","Peter","Tommy"));
  //    assertThat(names, contains("Peter","John","Tommy"));

      /// contains has checked ordering of this list 

      List<String> emptyList = new ArrayList<>();
      assertThat(emptyList, empty());




          }

          @Test
          void testArray(){

              Integer[] arr = new Integer[] { 2,4,7,11,8};
              assertThat(arr, arrayContainingInAnyOrder(Integer.valueOf(2),Integer.valueOf(4),Integer.valueOf(7),Integer.valueOf(11),Integer.valueOf(8)));
          }



          @Test
          void testTolerance(){
            double actual = 3.14159 ; 
            double expected = 3.14 ; 

            double delta = 0.01 ; 

            assertThat(actual , closeTo(expected, delta));


            double actual2 = 3.135 ; 
            assertThat(actual2,closeTo(expected, delta)); 

            
          //  double actual3 = 3.129 ; 
          //  assertThat(actual3,closeTo(expected, delta));  
          // error 


          }

          @Test
          void testObjectClass(){
            Object obj = new Staff("John",23);
            assertThat(obj, instanceOf(Staff.class)); // check if obj is belong to class Staff 
            // ok no porblem.
            
          }


          // how to write a Matchers
          @Test
          void testUppercaseMatcher(){
            String s1 = "HELLO";
            String s2 = "HelloWorld";
            assertThat(s1, UpperCaseStringMatcher.containsUpercaseOnly()); // called matchesSafely
          }

}
