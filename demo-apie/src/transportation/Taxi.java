package transportation;

public class Taxi implements Movable{

  private int speed ; 

  private Road r  = new Road(); 
  @Override
  public Taxi move() {
    int newx = this.r.getX() + this.speed/10 ; 
    this.r.setX(newx);
    return this ; 

  }

@Override
public String toString(){
  return "Taxi is the Winner. ";
}
@Override
  public boolean isWinner(){
    return this.isArriveDistination();
  }
@Override
  public boolean isArriveDistination(){
    if (this.r.getX()>= 100) {
      return true;
    }
    return false ;
  }

  public Road getR(){
    return this.r;
  }

  public void accelerate(){
    this.speed += 30 ; 
  }
  public Taxi(){

  }

  public Taxi(int s){
    this.speed = s ; 
  }

  public int getSpeed(){
    return this.speed ; 
  }

  public void setSpeed(int speed){
    this.speed  = speed ; 
  }



  
  
}
