public class IntegerTest {

  public static void main(String[] args){
    Integer i1 = 127 ; // auto-box ; int --> Integer
    System.out.println(i1==127);// true , simialr to String class, Integer class makeobject 127 is the same one as the one 127 pointing to.
    // same object , same address => true 
    //if we want to compare the value of i1 , we shold use .equals
    System.out.println(i1.equals(127));  

    Integer i2 = 128 ; 
    System.out.println(i2 == 128) ; // true 

    Integer i4 = 128 ; 
    System.out.println(i2 ==i4); // false !???? 
    // there is a Internal Cache ( Byte, Short, Integer, Long) for 128 to 127 . it will be stored as same obj . 
    //  but for 128, it is out of Internal Cache , it will make new object , of i2 and i4 are 2 different objects -> i2 == i4 return false 

    Integer i3 = 127 ;
    System.out.println(i1 ==i3); // with Inernal Cache => true 
    
    // valueOf vs new 
    Integer i5 = 5; 
    Integer i6 = new Integer(5);
    Integer i7 = Integer.valueOf(5); 
    Integer i8 = Integer.valueOf(5); // i8 will reuse the object of i7 
    // use valueOf is much beter . 



    Long l1 =3L; // auto-box / long -> Long
    Long l2 = Long.valueOf(3); // upcast int -> long --> Long

    Short s1 = Short.valueOf("3");

    double d1 = Double.valueOf(3.4f);
    
  }
  
}
