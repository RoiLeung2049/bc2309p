package person;

public class EDog implements Enimal{

  private boolean hasBone;

  public EDog(){

  }


  public String getName() { 
    return Enimal.name ; 
  }


  @Override
  public void makeSound() {
   
    System.out.println("Woof woof myname" + getName());
    //Integer a = 2 ; 
    
  }

  
  
}
