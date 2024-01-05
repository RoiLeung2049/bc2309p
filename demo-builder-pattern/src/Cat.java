public class Cat{


  private String name ; 

  public void setName(String name){
    this.name = name ; 
  }

  public Cat name(String name ){
    this.name = name ;

    return this ; 
  }

  public void run(){
    System.out.println(this.name + " is running....");
  }

  public static void main(String[] args) {
    Cat cat = new Cat();
    cat.name("Jenny").run();
  }

}