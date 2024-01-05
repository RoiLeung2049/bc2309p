import java.math.BigDecimal;

public class Circle {

  double radius; 
  String color ; 
  public Circle(){

  }

  public Circle(double r,String c){
    this.radius = r ; 
    this.color = c; 
  }

  public double getRadius(){
    return this.radius ; 
  }

  public void setRadius(double r){
    this.radius = r; 
  }
  public void setColor(String c){
    this.color = c ; 
  }
  public String getColor(){
    return this.color ; 
  }
  public double area(){
    BigDecimal br = BigDecimal.valueOf(this.radius);
    BigDecimal bPI = BigDecimal.valueOf(Math.PI);
    return br.multiply(br).multiply(bPI).doubleValue();
  }
  

  public static void main(String[] args){
      Circle c = new Circle(1.0,"Green");
      System.out.println(c.area());
      System.out.println(c.getColor());//Green
      

  }
}
