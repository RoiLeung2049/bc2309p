public class Bird {

  private String name; 


  private final String color = "Yellow" ; 

  //public void setColor(String w){
  //  this.color = w; 
 // }


  public Bird() {

  }
  
  public final void fly(){
    System.out.println("this is final fly() method ."); 
  }

  @Override
  public String toString(){
    return " this is an implemented toString method of Bird..." ; 
  }


  public static void main(String[] args) {
    Bird bird = new Bird() ; 
   // System.out.println(bird.toString()); // it is the object reference which it is pointed at stack 
    Object object = new Object() ; 
    System.out.println(bird);

    object = "123";
    System.out.println(object.getClass());
    object = 123 ; 
    System.out.println(object.getClass());
    object = 0.0 ;
    
    System.out.println(object.getClass()); // this is the output of runtime. not complier time. 
    
    object = new Bird(); 
    
    if( object instanceof Bird){ //true
      // downcase 
      Bird b = (Bird) object ; 
      b.fly();
    }




  }



}
