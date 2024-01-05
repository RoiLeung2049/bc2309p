package animal;

public abstract class Animal2 {

  public abstract void sound(); 
  private double height ;
  private double weight ; 

  public Animal2(){

    }

    
  public Animal2(double weight, double height){
    this.weight = weight;
    this.height = height ; 
    }
    

  public double getHeight(){
    return this.height;
  }

  public double getWeight(){
    return this.weight;
  }

  public void sound2(){
    
    System.out.println("zzz....");

  }

}
