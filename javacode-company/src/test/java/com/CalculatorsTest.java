package com;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
//File name has to be XXXTest.java or XXXTests.java
import org.junit.jupiter.api.Test;
import com.business.javacode.model.Calculators;
import com.business.javacode.model.Staff;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

// static import : import static org.junit.jupiter.api.assetyions.# ; 


public class CalculatorsTest {

  @Test
  public void testAdd(){
    Assertions.assertEquals(7, Calculators.add(3,4));
  }


  @Test
  public void testSort(){
    Assertions.assertEquals(new  ArrayList<>(List.of(-1,0,1,2)),Calculators.sort(new int[]{-1,1,0,2}));
    Assertions.assertEquals(new  ArrayList<>(List.of(-1,0,2,4)),Calculators.sort(new int[]{-1,4,0,2}));

  }


 // @Test 
 // public void testArray(){
 //   Assertions.assertArrayEquals(new int[] {1,2,3}, new int[] {1,2,3});// assertArrayEqual check object 
 // }
  @Test
  public void testBoolean(){
    assertFalse(5<3 ); //true
    assertFalse(4>5) ; // true 

    Staff s1 = new Staff("John" , 19);
    Assertions.assertTrue(s1.isAdult() );

  }


  @Test
  public void testAdd2(){
    Assertions.assertEquals(5, Calculators.add(5, 0));
  }



  @Test 
  public void testSameObject(){


    String st1 = "Hello" ;
    String st2 = "Hello" ; 
    Assertions.assertSame(st1, st2);

    String s3 = new String("Hello");
    Assertions.assertNotSame(st2, s3);

  }


  @Test
  public void testThrow(){
    Assertions.assertThrows(NullPointerException.class,() ->{
      String nullString = null ; 
      nullString.length() ; 



    });


          Assertions.assertDoesNotThrow( () -> {
        System.out.println("Hello");
      } );



      Assertions.assertTimeout(Duration.ofMillis(2000), ()->{
        Thread.sleep(1800);
      });


  }


        @Test
      public void testA() {
        Assertions.assertEquals( 5, "hello".length());
        
      }

            @Test
      public void testB() {
        Assertions.assertEquals(5, "hello".length());
        
      }


      @Test  
      public void combinTestAandTestB(){
        Assertions.assertAll(
        () -> Assertions.assertTrue(10 >5),
        () -> Assertions.assertEquals(5,"heelo".length())

        ) ;
      }




  
}
