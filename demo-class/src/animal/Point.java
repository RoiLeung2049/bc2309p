package animal;

import java.util.Objects;

public class Point {

  private int X ; 
  private int Y ;

  //public Point(){

  //}

  public Point(int x, int y){
    this.X = x;
    this.Y = y; 
  }

  public int getX(){
    return this.X;
  }

  public int getY(){
    return this.Y;
  }

  public void setX(int x) {
    this.X = x;
  }

  public void setY(int y){
    this.Y = y; 
  }

  @Override
  public boolean equals(Object Obj){

    if(this == Obj){
      return true;
    }
    if(! (Obj instanceof Point)){
      return false ; 
    }
    Point p = (Point) Obj ; 
    return (p.getX() == this.getX()) && (p.getY() == this.getY());
  }


  public void moveRight(int x){
    this.X  = this.X + x ; 
  }

  public Point right(int x ){
    this.X = X +x;
    return this;
  }

  public Point up(int y){
    this.Y = this.Y + y;
    return this;
  }

  public Point left(int x){
    this.X = this.X - x ; 
    return this ;
  }

  public Point down ( int y){
    this.Y  = this.Y - y ; 
    return this ; 
  }
  @Override
  public String toString(){
    return "this location of this point is :(" + this.X  + ", " + this.Y + ")" ;
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.X,this.Y);

  }

  public static void rightAndUp(Point point){
    point.setX(point.getX() +1);
    point.setY(point.getY() +1);

  }

  public static void concatA(String str){ 
    str =  str + "A" ; 
  }
public static void main(String[] args) {
  Point point1 = new Point(0,0);
  Point point2 = new Point(0,1);
  Point point3 = new Point(0,1);
  System.out.println(point2.equals(point3)); //true
  System.out.println(point2);
  point2.right(20).up(100);
  System.out.println(point2.equals(point3));
  System.out.println(point2);
}
  
}
