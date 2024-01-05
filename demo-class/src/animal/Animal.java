package animal;

public  class Animal {

  private double weight; 
  private double height ; 

  
  //getter and setter 
  public double getWeight(){
    return this.weight;
  }

  public double getHeight(){
    return this.height;
  }

  public void setWeight(double w){
    this.weight = w;
  }

  public void setheight(double d ){
    this.height = d ; 
  }

  public Animal(){

  }

  public Animal(double w ,double h){
    this.weight = w; 
    this.height = h ;
  }

  public Animal(double w, double h, double c){
    
  }
  
  public String toString(){
    return "this is a test of to String " + this.getHeight() + "and" + this.getWeight() ; 
    // alternatively  " this is a test of to String " super.Height() and super.getHeight() ; 
    // alternatively , the toString method should be in Parent class 

  }


  
}
