import java.awt.Color;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;


public class Circle  extends Shape {

  private double radius ; 
//  private Color color ;
  
  public double area(){
    // BigDecimal  -> use valueOf() to initstante 
    return BigDecimal.valueOf(this.radius).multiply(BigDecimal.valueOf(radius)).multiply(BigDecimal.valueOf(Math.PI)).doubleValue();


  }
  
  
  @Override
  public double area(double mode, int dp){

    return this.radius* this.radius*3.14  ; 
  }

  public double getDiameter(){
    return this.radius *2 ; 
  }

  public  Circle(double radius, Color c){
    super(c);//it calls the parent constructor to create the parent obj which it can help to store the parent variable that can be used by child obj. 
    this.radius = radius;
    
  }

  

  public static Circle ofBlack(double radius){
    return new Circle(radius, Color.BLACK);
  }

  public Circle(){
    super() ; 
  }

  private Circle(double r){
    this.radius = r ; 
  }
  public static Circle valueOf(double r){
    return new Circle(r);
  }

  public void setR( double X){
    this.radius = X ; 
  }

@Override
  public void setColor(Color c){
   // super(c);
    super.setColor(c);  
    this.radius = BigDecimal.valueOf(this.radius).add(BigDecimal.valueOf(1.0)).doubleValue() ; //need bigdemcemial 
  }

  public double getR(){
    return this.radius;
  }

  @Override
  public boolean equals(Object c) {
      if (this == c){
        return true ;
      }else if (!(c instanceof Circle)) {
        return false ;
      }else {
        Circle C = (Circle) c ; 
        return Objects.equals(C.getR(),this.radius);
      }


  }

  
  @Override
  public int hashCode(){
    return Objects.hash(this.radius);
  }

  @Override
  public String toString(){
    return " this instance is an Circle object." ; 
  
  }



  public static void main(String[] args) {
    Circle C = Circle.valueOf(3.4);
    System.out.println(C);
    long result = Math.round(C.area() *100);
    double d1 = result /100.0; 

    System.out.println(d1);

    Shape shape = new Circle(4,Color.RED);
    System.out.println(shape.getClass());// this is a circle
    System.out.println(shape.area(d1, 0));// 1 . it refers to circle's area 

    Shape ff = new Square(4.0, Color.white);
    System.out.println(ff.area(d1, 0)); //16. it refers to square's area
  }
}