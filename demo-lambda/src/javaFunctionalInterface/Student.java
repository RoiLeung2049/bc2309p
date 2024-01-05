package javaFunctionalInterface;

public class Student extends Person {

  private int id ; 

  public Student(int id , String name ) {
    super(name);
    this.id = id ; 

  }
  
  public int getId(){
      return this.id; 
  }

  @Override
  public String toString(){

     
    return "this name of this student is " + super.getName() + " and the id is "+ this.getId() ; 
  }
}
