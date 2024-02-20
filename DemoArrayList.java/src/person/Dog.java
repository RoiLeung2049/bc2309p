package person;

public class Dog extends Animal{

  private boolean hasBone;

  public Dog(){
    super();
  }
  public Dog(String name , boolean hasBone) {
    super(name);
    this.hasBone = hasBone ; 

  }



  //@Override 
  public void makeSound(){
    System.out.println("Woof woof my name is " + getName());
  }

  public static void main(String[] args) {
    
     Animal ad = new  Dog("DogDog", true) ; 

     ad.makeSound();

     Animal bd = new Animal("PogPog");
     bd.makeSound();
  }

  


  
}
