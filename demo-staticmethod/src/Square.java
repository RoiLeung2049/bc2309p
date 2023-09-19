public class Square {

  public static void main( String [] args){
    double l = 4.6;

    int a = (int) Square.area2((int)l);
    System.out.println(a);

    int[] arrr = new int[] {20,1111,3,99,5};

    int m = Square.max(arrr);
    System.out.println(m);
  }


  public static int  area( int length){

    int area = length * length ; 
    return area ;   
  }
  

  // using math class library 
  public static double area2( int length){
    return Math.pow(length , 2);

  }

  // method to fidn the max of an array 

  public static int max(int[] arr){
    int tmp = -999 ;
    for (int num: arr){
        if( num > tmp) {
            tmp = num;
        }

      

    }

    return tmp ;

  }


  // Try to design 2 methods A & B . 
  // call method A , and the method A will rely on Method B for calculation . 
  
}
