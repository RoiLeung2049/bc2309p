public class Square {

  // what is the description of a square ? 
  int length ; 

  // area come from length so no need to make a static variable for this quantity. 
  public int area (){
    return this.length * this.length;
  }
 
  public Square(int length){ // constructor 
    this.length = length ;
  }


  
  public void abc() {
    System.out.println("hello. this is abc method.");
  }

  public Square() { 
    // empty constructor 
     
  }
  public int getLength(){
    return this.length; 
  }

  public void setLength(int length){
    this.length  = length ; 
  }

  public static int area (int length){
    return length * length ;//new Square(length).area();
  }

  public static void main(String[] args){
    // new Square 
    Square s = new Square(3);
    System.out.println(s.area()); // 9 

    // revise length of square2
    s.setLength(7);
    System.out.println(s.area());

    // use void abd 
    s.abc(); // hello this is abs method. 


  }
}
