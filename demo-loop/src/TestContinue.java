public class TestContinue {

  public static void main( String [] args) {

      // a for loop 10 times

      for ( int i = 0 ; i < 10 ; i++){

          if ( i >= 2 ){

            continue; // go bavk to the step before if , go to i++
          }
        System.out.println("i="+ i); // 0 ,1 
      }
        // to print 2 , 4, 6, 8 , 10 => continue

        for ( int j = 1 ; j < 10 ; j++){

            if (j %2 != 0 ) {
                continue; // if j is odd number ,then it will go back to j ++ 


            }
            // this is the part to code to be skip by 
            //continue
            System.out.println("J is :"+ j);

        
        }

        String s = "abcd" ; 
        // CharAt , for loop, print a b c d 

        for ( int k = 0; k < s.length();k++){

          System.out.println(s.charAt(k));


        }

        // What is the position of c? 
        for ( int l = 0; l < s.length();l++){

          if ( s.charAt(l) != 'c'){

            continue;
          }

          System.out.println("c is at location :"+l);


        }
        // Find the char 'x', and print the next char of x , if not find -1
        String s2 = "ijkxyz";
        Boolean found = false; 
        int tmp = -1 ; //default not find

        for (int e = 0 ; e < s2.length() ; e++){

          if (s2.charAt(e)== 'x'){
            
            //found 
            found = true;
            //get the location 
            tmp = e ; 
            // can break now 
            break;


          }

        }

        if (found){
          // return next char 
          System.out.println(s2.charAt(tmp+1));
        }
        else {//can't found 
          System.out.println(tmp);
        }

       
          

          }

        }



  

