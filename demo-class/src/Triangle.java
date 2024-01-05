import java.math.BigDecimal;

public class Triangle {
  // once it is created, it's base and height canntot be revised
  
  double base ; 
  double height; 
  boolean tb;
  public Triangle(double b, double h){
    this.base = b ; 
    this.height = h ;
  }

  public double area(){
    return BigDecimal.valueOf(this.base).multiply(BigDecimal.valueOf(height)).divide(BigDecimal.valueOf(2)).doubleValue();
  }
  public double getBase(){
    return this.base; 
  }

  public double getHeight(){
    return this.height;
  }
  public boolean gettB(){
    return this.tb;
  }

  public static void main(String[] args){
    Triangle testT = new Triangle(5,6); 
    System.out.println(testT.area());
    //test for defualt value 
    //boolean tB;
    System.out.println("def B is : "+ testT.tb);//false

    double t = 4 ; 


    
  }
}
