package animal;

public class Dog2 extends Mammal{

  private String name ; 
  public Dog2(String name , double weight, double height){
    super(weight,height);
    this.name = name ;

  }

  public Dog2(){

  }
  @Override
  public void sound(){
    System.out.println("barking....");
  }

  public static void main(String[] args) {
   //Difference between class and abstract class 
    Animal animal = new Animal(13, 20.3, 1);
   // Animal2 animal2 = new Animal2() ; 
    Dog2 dog2 = new Dog2();
    System.out.println(dog2.getHeight());//0
   

  }
  
}
