public class Persons {

  private String name ; // private variable can not be assessed by child class object. 

  private int age  ; 
  // all argument constructor 
  public Persons(String n , int a){
    this.name = n ; 
    this.age = a; 
  }

  // empty constructor 
  public Persons(){

  }

  public int s ;
  //static 
  public static String x = "hello" ; 

  // setter 
  public void setName( String n) {
    this.name = n ; 
  }
  // getter 
  public String getname() {
    return this.name ; 
  }

  public void setAge(int a) {
    this.age = a; 
  }

  public int getAge(){
    return this.age;
  }

  public boolean isAdult(){
    return this.age >= 18 ;
  }


  public String toString(){
    return  "name=" + this.name +  ", age=" + this.age;
  }
  
  
  public static void main(String[] args) {
    Persons person = new Persons("John", 18); 
    System.out.println(person.isAdult());
    Persons person2 = new Persons("John", 17); 
    System.out.println(person2.isAdult());

    // Approach 1 

    if ( person.getAge()>=18){// business domain
      System.out.println(" is elderly");// this has to be encapsulated in object but not in the main logic. 

    }

    // Approcah 2 , this approach is more object oriented approach than 1 . it is because we don't put raw business domain in the main logic 
    if( person.isAdult()){
      System.out.println("is elderly"); 
    }

  }
}
