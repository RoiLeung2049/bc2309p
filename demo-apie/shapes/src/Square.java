import java.awt.Color;
public class Square extends Shape {

  private double length; 
  private Color color; 
  public Square(){

  }

  public Square(double length, Color c){
    this.length = length ; 
    this.color = c; 
  }

  public static Square valueOf(double length,Color color){
    return new Square(length,color);
  } 

  public double area(double mode, int dp ){
      return length* length; 
  }
}
