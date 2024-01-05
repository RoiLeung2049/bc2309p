public class Person {

  private double age ; 
  private String name ; 

  public Person() {

  }

  public Person( double age , String name ){
    this.age = age ; 
    this.name = name ;
  }

  public double  getAge() {
    return this.age;
  }

  @Override
  
  public String toString(){
    return " this name of this Person is " + this.name;
  }
  
}
