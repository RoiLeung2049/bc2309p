package transportation;

public class Bus implements Movable{

  private int speed;


  @Override
  public Bus move(){ 
    // location x , +1  when speed = 10 , +2 when speed = 20 ,   
    int newx = this.r.getX() + this.speed/10 ; 
    this.r.setX(newx);
    
    return this; 
  }

  @Override
public String toString(){
  return "Bus is the Winner. ";
}
  public boolean isArriveDistination(){
    if (this.r.getX() >= 100) {
      return true;
    }
    return false ;
  }
  private Road r = new Road() ; 
  @Override

  public void accelerate(){
    this.speed += 10 ; 
  }
  public Bus(){

  }
  public Road getR(){
    return this.r;
  }
  public Bus(int s){
    this.speed = s ; 
  }

  public int getSpeed(){
    return this.speed ; 
  }

  public void setSpeed(int speed){
    this.speed = speed ; 
  }
@Override
  public boolean isWinner(){
    return this.isArriveDistination();
  }


  
}
