package transportation;

public interface Movable{ // a contract ,合約, 一個FRAMEWORK

  // interface can have variable . implicitly public static final 
  String name = "Car";

  //all methods in interface are implicitly public abstract. no private method 
  Movable move(); // polymorphism!!!!! a more generic return type

  void accelerate() ; 

  boolean isArriveDistination();
 // public Road r = new Road() ; 

  boolean isWinner();

  
  // after java 8 
  // implicityly public (instane method) 
  default  void printWinner(String name){
    System.out.println(name +"is Winner." ) ; 
  }

  // static method in interface
  static void staticPrintWinner(String name){
    System.out.println(name + " is Winner"); 
  }
}
