package animal;

public class Dog extends Animal{


  private String name ; 

  public Dog(){
    super();
  }
//all arugment constructor 
  public Dog(double w , double h, String n){
    super(w,h);
    this.name = n;
  }

  public String sound(){
    return "WO WO";
  }
  
  public String toString(){
    return "this is a test of to String " + super.getHeight() + "and" + this.getWeight() +" " + this.name ; 
    // alternatively  " this is a test of to String " super.Height() and super.getHeight() ; 
    // alternatively , the toString method should be in Parent class 

  }

  public static void main(String[] args) {
    Dog d = new Dog(167d, 769d, "pig");
    System.out.println(d.sound());
    System.out.println(d.getHeight()); //769
    System.out.println(d.getWeight());// 169 

    System.out.println(d);
  }
}
