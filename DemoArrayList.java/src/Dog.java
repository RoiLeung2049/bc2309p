import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dog extends Animal implements Comparable<Animal>{

  private static final int ArrayList = 0;
  private int age;
  //private String name;

  @Override
  public int compareTo(Animal animal){
    return animal.getName().compareTo(super.getName());
    
  }
  public static <T extends Animal> void makeSound(Printer<T> animals){// the parameter is of type Printer<T> but it limits the type T has to be related to animal 


  }
  public Dog(String name , int a){
    super(name);
    this.age = a ;
  }

  public String toString(){
    return super.getName();
  }
 // public String getName(){
 //   return this.name;
 // }
 // public static void makeSound(Printer<Dog> animals){
  public static void main(String[] args) {
    Printer<Animal> printer1 = new Printer<>();
    Printer<Dog> dogPrinter = new Printer<>();
   // Dog.makeSound(StringPrinter); // not ok , it is becoz T should be in Animal Range 
// pritner 1 and dogprinter are not polymorphism 
    Printer<String> stringPrinter = new Printer<>();
    Dog.makeSound(dogPrinter); // OK 
    Animal Dog1 = new Dog("Apple", 4);
    Animal Dog2 = new Dog("Box",5);
    List<Animal> AList =new ArrayList();
    AList.add(Dog1);
    AList.add(Dog2);
    System.out.println(AList);
  //  Collections.sort(AList);

  }
  }

  

