public class Operator {
  public static void main(String[] args){
    int i = 0 ; 
    i = i -1 ; 
    i -= 1 ; 
    i-- ; 
    --i ; 
    System.out.println(i);


    int result1 = i-- ; 
    System.out.println(result1);


    //!
    boolean b9 = !false ; 
    System.out.println(b9);


    boolean b6 = 4 >=4 ;
    System.out.println(b6); 


    // == check if vallue are same in both sides 
    // = -> assignment 
    // != => Not equals to 

    boolean combine2 = (4+3) > 5 || (10 *2) % 3 ==2 ;  // 7 > 5 , true . (10*2) % 3  = 2  , true
    // combine2 = true 
    System.out.println(combine2);
    boolean cc2 = ( 4+3) >= 7 ; 
    if (cc2 == true)
      System.out.println( "CC2 is true") ;
    // *= , /= , %= 
    int a = 2 ; 
    a *=3 ; // a = a * 3 
    System.out.println(a); // 6
    
    int e = 10 ; 
    e %= 3 ; 
    System.out.println(e); // 1  



  }

}