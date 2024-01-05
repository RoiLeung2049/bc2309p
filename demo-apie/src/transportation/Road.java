package transportation;

public class Road {

  private int x ; // 1 => 10 

  public Road(){
    this.x =1 ; // initialize a road which start at value x = 1 ;  10 is distination . 
  }

  public int getX(){
    return this.x ; 
  }

  public void setX(int location){
    this.x = location ;    
  }
 // public boolean isArriveDestination(){
 //   if (this.x >= 100) {
 //     return true;
 //   }
 //   return false ;
 // }



  public static void main(String[] args) {
    // 1 Bus and 1 Taxis
    // while loop ,  isArrivedDestination , exit loop , print bus or taxi win? 

    Bus b1 = new Bus(18);
    Taxi t1 = new Taxi(18);

    while (!(b1.isArriveDistination()==true||t1.isArriveDistination()==true)){
     // b1.move();
      if(b1.move().isWinner()){
        System.out.println(b1);
        Movable.staticPrintWinner("Bus");
        break;
      }

      //t1.move();
     // t1.accelerate();
      if(t1.move().isWinner()){
        System.out.println(t1);
        Movable.staticPrintWinner("Taxi");
        break ; 
      }
    }

  }
  
}
