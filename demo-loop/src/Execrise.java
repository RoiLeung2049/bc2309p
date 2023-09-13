public class Execrise {

  public static void main( String [] args){


    int sum = 0 ; 
    for ( int i = 0 ; i <10 ;i++){

      sum = sum +(i+1) ; 
    }
    System.out.println(sum);  // 55 

    // 2, 4, 6, 8, 10 
    int sum2 = 0 ; 
    for ( int i = 2 ; i <11 ; i++){
      if (i%2 ==0) {
        sum2 = sum2 + (i); 
      }
     
    }
    System.out.println(sum2);

    //alternative 
    int sum3 = 0 ; 

    for (int i=0 ; i <5;i++){
      sum3 = sum3 + ((i+1)*2) ; 

    }
    System.out.println("SUM3 is :"+sum3);


    // 1 -1000
    // 1) 1 -299 ( all all even number )
    // 2) 300 - 699 ( add all odd number)
    // 3) 700 - 1000 ( add all numbers can be dividend by 3 )

    int sum4 = 0 ; 
    for ( int i = 1 ; i <1001 ; i++ ){

      if ( i < 300 ){
        if (i%2 == 0){sum4 = sum4 +i;}
        
      } // i.e. i within 1 = 299{

      else if( i <700 ){
        if ( i%2 != 0){sum4 = sum4 +i;}
          

      } else {
        if ( i % 3 ==0){

          sum4 = sum4 + i ;
        }
      }

      
      }


      System.out.println("total value is :" + sum4);


        //alternarive 



    }
  }
  

