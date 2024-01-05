public class Dog {


  private String name ; 

  private static int age ; 

  public Dog(String name ){
    this.name = name ;
    this.age = 0 ; 
  }

  public void setAge(int age ){
    this.age = age  ; 
  }


  public  static synchronized void addAge(){
    Dog.age++ ; 
  }

  public  synchronized void setName(String s) {
    this.name  = this.name.concat(s) ;
  }

  public String getName(){
    return this.name;
  }
  public static  void main(String[] args) throws InterruptedException {

    Dog dog = new Dog("a");

    //define a task 
    Runnable task = () ->{
      for(int i = 0 ; i <100000 ;i++){
        dog.setName("a");
      }
      
    };


    Thread t1 = new Thread(task);
    Thread t2 = new Thread(task);
    t1.start();
    t2.start() ; 
    
    t1.join();
    t2.join();

    System.out.println(Dog.age);


    System.out.println(dog.getName().length());

    
  }
  
}
