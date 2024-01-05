public class Chair {
  
  private double height ; 
  private double length ;
  private  double weight ;
  private int location;
  private boolean isOccured ;
  public Chair(){
    this.isOccured= false ; 
  }

  public Chair(double height,double weight){
    this.height = height ;
    this.weight = weight ; 
    this.isOccured = false;
  }

  public double getHeight(){
    return this.height;
  }

  public double getWeight(){
    return this.weight;
  }

  public void setHeight(double height){
    this.height = height ; 
  }

  public void setWeight(double weight){
    this.weight = weight;
  }

  public void setLocation(int number){
    this.location = number;
  }

  public void setIsOccured(){
    if (!(this.location == 0)){
      this.isOccured=true;
    }
  }
  public void setLength(double L){
    this.length = L ; 
  }
  
  // equals , hashCode , toString  

  }

