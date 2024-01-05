package animal;

public class Bird {

  private String name ; 
  private final String color = "Yellow" ; // need to make sure the color will not be changed . alternatively we can set default value 
  // but not to use final keyword. 
// if we determine the colo has to be final, then no need to make color as the input for user. 
  private String age ; 
  public Bird(String na){ // then this constructor can't be used in next java file 
    this.name = na ; 

  }

  public static Bird valueOf(String name){
    return new Bird(name);
  }

  public Bird() { 

  }
  public String getAge(){
    return this.age;
  }
  public String getName(){
    return this.name;
  }

  public String getColor() { 
    return this.color ; 
  }

  public String toString(){
    return "Bird(name=" + this.name + "0" + ", color=" + this.color + ")" ; 
  }


  public final void fly() { 
    System.out.println("this is final fly() method.") ; 
  }
  


  public static void main(String[] args) {
    Bird bird = Bird.valueOf("Teacher");
    System.out.println(bird.toString());
  }
}
