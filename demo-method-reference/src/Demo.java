import java.util.List;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
public class Demo{

  private static List<String> strings = new ArrayList<>(List.of("IJK","ABC","XYZ"));


  public static void main(String[] args) {
    //method reference version
    strings.forEach(System.out::println); // this is only apply to 1 parameter only
    // alternative 2 
    strings.forEach(e -> System.out.println(e));


    //Consumer lambda Expression : i -> s.charAt(i) 

    String d = "Hello World" ; 
    Function<Integer,Character> charAtFunction = i -> d.charAt(i) ; 

    // method reference 
    Consumer<Character> mfCharAt  = d::charAt ; 

    //comparator lambda expression 
    Comparator<String> compareTo = (s1, s2) -> s1.compareToIgnoreCase(s2);

    //Method reference 
    Comparator<String> compareTo2 = String::compareToIgnoreCase ; 

   // compareTo2.compare(s1, s2);

   Collections.sort(strings,compareTo2); 
    System.out.println(strings);

  System.out.println(compareTo2.compare(d, "Hello"));
  
  

  //ClassName::New  method reference : function Object
  Function<String, Integer> newInteger = s -> new Integer(s);
  Function<String, Integer> newInteger2 = Integer::new;

  System.out.println(newInteger2.apply("2"));

  }


}