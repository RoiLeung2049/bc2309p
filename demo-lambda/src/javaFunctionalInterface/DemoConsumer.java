
package javaFunctionalInterface;

import java.util.function.Consumer;
public class DemoConsumer {

  public static void main(String[] args) {
      // void accept(T t ) ; T -> Consumer
      // Consumer i the java built-in functinal interface  
    Consumer<Person> c =  (p) -> { 
      System.out.println("this name pf this person is "+ p.getName());
    };


    Person tPerson = new Person("Jogn");
    c.accept(tPerson); // use the Consumer interface.



    Consumer<Person> c2 = p -> { // for i parameter , p or (p)  ok !
      System.out.println("the person is "+ p.getName());

    };

    c2.accept(tPerson);
  }
  
}
