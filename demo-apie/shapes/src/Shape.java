import java.math.RoundingMode;
import java.util.Arrays;
import java.awt.Color;


public abstract class Shape{// abstract class needs constructor 
    
    private Color color;
    public static Shape[] shapes = new Shape[10] ; // for static array we can ne wan array in this class code  or static block,
    // for static block , this static block will be  

  //  private Shape[] shape ; 
    public void setColor(Color color){
      this.color = color; 
    }
    public Shape(){
    
    }

    public static void add(Shape shape ){
      /// add shape into the shapes 
      for(int i = 0 ; i  <Shape.shapes.length;i++){
        if( Shape.shapes[i] == null){
          System.out.println("This is a bug");
          Shape.shapes[i] = shape;
          break;
        }
      }
    }
    public Shape(Color c){
      this.color = c ; 
    }
    abstract double area(double mode , int dp) ; 

    public Color getColor(){
      return this.color;
    }

    public static  double totalArea(Shape[] shapes){
        double tmp = 0 ; 
       
        for (Shape S : shapes){
          if( S != null){
            System.out.println("shap") ; // shape[i].area -> polymorphism application
             tmp += S.area(1, 2); 
          }
         
        }
        return tmp ; 
    }
    
 //   public static void add(Shape shapes){
     // for ( int i = 0 ; i < shapes.length; i++){
      //  if(shapes[i]==null){
      //    shapes[i] = shape;
      //  }
   //   }
   // }
    public static void main(String[] args) {
      //int g = 3 ; 
      // new 2 Cricle and 1 Square , and put them into thhe Shape[] 
      Circle C1  = new Circle(2.0 ,Color.RED); 
      Circle C2 = new Circle(4.0,Color.WHITE);
      Square S1 = new Square(1, Color.GREEN) ; 

      
      Shape.add(C1);
      Shape.add(C2);
      Shape.add(S1);

      System.out.println(Shape.totalArea(Shape.shapes));
    }



}