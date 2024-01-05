public abstract  class TestAnimal {

  public String name ; 
  public int age ; 
  public int weight ; 

  public abstract void sound();

  public static void display(){
    System.out.println(" this is a bas static method.");
  }
  public void sleep(){
    System.out.println("I Test animal sleep.");
  }
  public TestAnimal(String n , int a , int w ){
    this.name = n;
    this.age =a ;
    this.weight = w; 
  }
  public TestAnimal(){

  }
}
