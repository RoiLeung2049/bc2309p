package execrise;

public class Subject {

  private String description; 
  private int Score ; 


  // constructor
  public Subject(){

  }


  // constructor with arugment 
  public Subject(String des, int marks) {
    this.description = des ; 
    this.Score = marks;
  }

  public String getDescription(){
    return this.description;
  }

  public char getGrade(){
    if(this.Score >= 90)
      return 'A';
    else if ( this.Score >= 80)
      return 'B';
    else if (this.Score >= 70)
      return 'C';
    else if ( this.Score== 60)
      return 'D';
    else 
      return 'F';
    }
    
    
    
  

  public int getScore(){
    return this.Score;
  }

}