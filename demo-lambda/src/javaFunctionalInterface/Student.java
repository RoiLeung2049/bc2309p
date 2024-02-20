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

  public String gettype(){
    return "the type is Student." ; 
  }


  public static void main(String arg[]){
    Person tp1 = new Person( "Jopgn") ; 
    Student st1 = new Student(2, "Jen") ; 
    System.out.println(tp1.gettype()) ; 
    System.out.println(st1.gettype()) ;
    
  }
}
