public class ArrayList2 {

  private Integer[] integers;


  public ArrayList2(){
      this.integers = new Integer[0];// not thing has been added in this constructor
  }

  public boolean add( Integer integer){
    // create a new integer array
    int l = this.integers.length + 1 ; 
  //  System.out.println("this is  a test" + this.integers[0]);
    //create a new Integer array
    Integer[] newInteger = new Integer[l];
    for (int i = 0; i < this.integers.length;i++){
      newInteger[i] = this.integers[i];
    }
    newInteger[l-1]= integer;
    // point the new Integer array to this 
    this.integers = newInteger  ; 

    return true ;
  }

  public Integer[] getIntegers(){
    return this.integers;
  }

  public Integer set(int index , Integer newInteger){
      Integer old = this.integers[index];
      this.integers[index] = newInteger ; 
      return old ;  
  }

  public Integer get(int index){
    return this.integers[index];
  }

  public int lastIndexOf( Integer integer){
    
    
    for( int i = this.integers.length-1 ; i> 0 ; i--){
        if( this.integers[i].equals(integer)){//*** we should use equal to do compairson */
          return i;
        }
    }
    return -1; 
  }
  public static void main(String[] args) {
    ArrayList2 arrList2 = new ArrayList2(); 
    arrList2.add(10);
    arrList2.add(100);
    arrList2.add(1);
    arrList2.add(1);
    arrList2.add(5);
    arrList2.add(100);

   // for ( Integer i : arrList2.getiIntegers()){
   //   System.out.println(i);
    //}
    //arrList2.add(10);
    //arrList2.add(1);
    System.out.println(arrList2.set(2,5));
    
    for ( Integer i : arrList2.getIntegers()){
      System.out.println(i);
    }
      System.out.println(arrList2.lastIndexOf(100));
  }
  

}
