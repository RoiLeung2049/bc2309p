package javaFunctionalInterface;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class DemoUnaryOperator {
  // Unary extends Function , it has method T apply(T t );
  // input output are of same type 

  // Function<String , String> -> UnaryOperator<String>
  
    public static void main(String[] args) {
        UnaryOperator<String > uo =  s1 -> s1 + "Hello" ;

       System.out.println( uo.apply("Dee "));

       BinaryOperator<String> bo = (s1, s2 ) -> s1 + s2 ; 

       System.out.println(bo.apply("abd","def"));

       
    }

  
  
}
