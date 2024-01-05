public class Shape {

  private String name ; 

  public Shape(){

  }

  public Shape(String n){
    this.name = n ; 
  }

  public void release(){
    System.out.println("I am a shape.");
  }
  

  public String getName(){
    return this.name  ; 
  }
}
