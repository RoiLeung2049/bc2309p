package javaFunctionalInterface;

import java.util.function.Supplier;
import java.util.ArrayList;
import java.util.List;
public class DeoSupplier {

  // T get();


  public static void main(String[] args) {
    
  Supplier<Person> person =   () -> {
    return new Student(1, "John");
  };
  // use get() method

    // T -> List<String>
  Supplier<List<String>> strings= () -> { 
    return new ArrayList<>() ;
  };
  List<String> ll = strings.get();
  ll.add("Hello");
  }
}
