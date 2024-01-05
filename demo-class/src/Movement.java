public class Movement {

  double degreeOfRotation ; 
  boolean initialFacePosition ; // face forward : true ; face backward :false 
  boolean finalFacePosition ;
  
  public void setDegreeOfRotation ( double d){
    this.degreeOfRotation = d ; 
  }

  public double getDegreeOfRotation(){
    return this.degreeOfRotation;
  }
  
    public void setInitialFacePosition ( boolean face){
    this.initialFacePosition = face ; 
  }

  public boolean getInitialFacePosition(){
    return this.initialFacePosition;
  }
  
  public void setFinalFacePosition ( boolean face){
    this.finalFacePosition = face ; 
  }

  public boolean getFinalFacePosition(){
    return this.finalFacePosition;
  }
  
  public boolean is360(){ // the rotation is multiple of 360 
    if (this.degreeOfRotation % 360 == 0){
      return true;
    
  }
  return false ; 
  }

  public boolean faceTheSame(){
    if ( this.initialFacePosition == this.finalFacePosition){
      return true;
    }
    return false ;
  }

  public boolean isPerfect(){
    if ( this.is360() &&  this.faceTheSame()){
      return true;
    
    }
    return false ; 
  }


  public static void main ( String [] args){
    Movement rotation1 = new Movement() ; 
    rotation1.setDegreeOfRotation(360);
    rotation1.setInitialFacePosition(false);
    rotation1.setFinalFacePosition(false);

    System.out.println("the rotation is perfect ?" + " " + rotation1.isPerfect());
  }
}