public class Calculator {
  private int x ;
  private int y ; 

  public int subtract() {// Calculator c = new Calculator; 
    return this.x - this.y ; 
  }
  // Fot static method, usually we have parameters 
  public static int substract(int x , int y ){ // called by Calculator.subtract(10, 3)  
    return x - y ; // this part canbot use keywor this . it is because this is not an instance method)
  }
  public int add() {
    return this.x + this.y ; 
  }
  
  public static int add(int x, int y){
    return x + y; 
  }

  public void setX(int x){
    this.x = x;
  }

  public void setY(int y){
    this.y = y;
  }
  
  public int getX(){
    return this.x ;
  }

  public int getY(){
    return this.y ;
  }

  public char grade() {
    if ( this.x > 150){
      return 'A';

    }
    return 'F';
  }
  public static void main ( String [] args ){
    int  x = 1 ; 
    int y = 9 ; 
    System.out.println(Calculator.add(x,y));
    Calculator cal = new Calculator();
    System.out.println(cal.getX());
    System.out.println(cal.grade());
  }
}
