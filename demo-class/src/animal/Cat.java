package animal;

public class Cat extends Animal{

  private int age ; 

  public Cat(){
    super();
  }
  private String color; 
  
  public Cat(double w, double h, String c){
    super(w,h);
    this.color = c ; 

  }

  public String sound(){
    return "Meow";
  }

  public String toString(){
    return "this is a test of cat toString method "+ "return" + this.color;
  }

  public boolean equals(Cat c){
    System.out.println("169111");
    if(this.color.equals(c.color)){
      return true;
    }
    return false ; 
  }
  public static void main(String[] args) {
    Cat ct = new Cat(9 , 1999 , "Tom") ; 
    //System.out.println(ct);
    Cat dd = new Cat(1,2,"DDR");
    System.out.println(ct.equals(dd));
    System.out.println(dd);
  }
  
}
