package javaFunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Consumer ; 
public class DemoPredicate {

  public static void main(String[] args) {
    //Predicate is a boolean formula
    // Function<Integer, Boolean> -> Predicative<Integer>
    // static boolean method 
    Predicate<Integer> isOdd = x ->  (x % 2) ==0  ? false : true    ;


    System.out.println(isOdd.test(3));

    BiPredicate<Integer, Integer> isLargerThan = (x1 , x2) -> (x1 > x2) ? true : false ;
  

    System.out.println(isLargerThan.test(10 , 20)); // false 


    Predicate<Integer> isPositive = x -> x > 0 ; 
    System.out.println(isPositive.test(-10)); // postive

    System.out.println(isOdd.and(isPositive).test(-9)) ; 

//Approcah 1 
    int x = 1000 ; 
    boolean isOverSomething = x > 20 ; 
// Approach 2 
    Predicate<Integer> p1 = s-> s > 20 ; 
    // override test(x)
   // int x = 100 ; 
    System.out.println("Test Predicate by p1 :" + p1.test(x));

//Approah 3 
   BiFunction<Integer,Integer,String> concat =  (Integer z, Integer y) ->  String.valueOf(z).concat(String.valueOf(y)); 
// implmentation of apply(x,y) ;  i , i -> s
System.out.println("Test BiFunction  with concat : " +  concat.apply(10 , 20 )); // 1020 ;   
  // test Strign convet
  System.out.println("Test public function by convert : "+ convert(10, 20)); // 10202;


  // test Consumer 
// print all student in the llist Student 
Consumer<List<Student>> printAllStudents = (input) ->  {
  for (Student s : input ){
    System.out.println(s.toString());
  }
};

printAllStudents.accept(new ArrayList<>(List.of(new Student(2,"John"),new Student(3,"Peter"),new Student(1,"Choi"))));
  }

// Function 
public static String convert(Integer x , Integer y){
  return String.valueOf(x).concat(String.valueOf(y));
}



}
