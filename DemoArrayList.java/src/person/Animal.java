package person;

public class Animal {

  private String name ; 

  public Animal(String name){
    this.name = name ;
  }

  public Animal(){
    
  }
  public String getName() {
    return this.name ; 
  }


  public void makeSound(){
    System.out.println("I am" + name) ; 
  }


  
}


