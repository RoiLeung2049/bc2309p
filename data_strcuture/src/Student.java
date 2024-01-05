public class Student {


  private int age ;
  private String name ; 

  public Student(){

  }

  
  public Student ( int age ,String name ){
    this.age = age ; 
    this.name = name ;
  }

  @Override
  public String toString(){
    return this.name;
  }
  
}
