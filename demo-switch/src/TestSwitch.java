public class TestSwitch{

  public static void main( String [] args) {
      char grade = ' ' ;
      int score = 90 ; 
      switch (score){ // swithc needs "break" in each case except default   
          case 90 : 
            grade = 'A';
            break;
          case 80 :
            grade = 'B';
            break;
          case 70: 

            grade = 'C';
            break;
          case 60 : 
            grade = 'D';
            break ; 
          default : 
            grade = 'F' ;

      }

          if ( score >=90){
      grade = 'A';

    }else if (score >=80){
      grade = 'B';
    } else if ( score >=70 ){
      grade = 'C';

    }

        System.out.println( " the grade is : "+ grade ) ; 

  }
  
}

