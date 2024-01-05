package box ; 

public class StringBox implements CharSequence {
  private char[] arr; 

  public StringBox(){
   // arr = new char[];
  }
// antoher encapuslation is to private the consturctor and define a value of static method

public static StringBox valueOf(String s){
  return new StringBox(s);
}
// the constructor has been encapsulated
  private StringBox(String str){ //encapsulation
    arr = new char[str.length()];

    for (int i = 0 ; i < str.toCharArray().length;i++){
      arr[i] = str.toCharArray()[i];     
    }
  }

  public StringBox(char[] arr){
    this.arr = arr ; 
  }
  @Override
  public int length(){
    return this.arr.length;
  }


  @Override
  public CharSequence subSequence(int start, int end) {
    
    if( end == start){
      return "" ;
    }
    if(end < start) 
      return new StringBox(this.arr);
    
    return this.subString(start, end) ; 

  }
  // substring

  public StringBox subString(int begin, int end){
      
     // String tmp = "" ; 
      StringBuilder str = new StringBuilder("");

      if(begin< this.length() && end <=this.length()){
                for (int i = begin; i < end;i++){
                  str.append(this.arr[i]);
      }

      }

      return new StringBox(str.toString());

  }
  
@Override
  public String toString(){
      StringBuilder str = new StringBuilder("");

      for(char c :this.arr){
        str.append(c);
      }

      return str.toString();
  }
  @Override
  public char charAt(int i){

    if( i > this.arr.length){
      System.out.println("Error. Please check .") ;
      return 'E' ;
    }else {
      return this.arr[i];
    }
  }

  public StringBox append ( String s){

    // this time , we need to modify the arr of the this object
    char[] newArr = new char[this.length()+s.length()];

    for (int i = 0 ; i <this.length(); i++){
      newArr[i] = this.arr[i];
    }
  
    for (int i = 0; i<s.length();i++){
      newArr[this.length()+i]= s.charAt(i);
    }
    this.arr = newArr;// reomve the orginal array   this.arr is and obj reference ,  we assign object newArr to this.arr 
    // this.arr ( object referene pointing to char[] object , char[] "sample")
    // newArr is an obj reference which is pointing to char[] object ,char[] "samplesample"
    // this.arr = newArr , i assign obj reference this.arr to the same address of newArr 

    return this;
  }


  

  

  public static void main(String[] args) {
    StringBox stringBox = new StringBox("AsampleA");
    System.out.println(stringBox.length()); //6
    System.out.println(stringBox.charAt(2)); //m

    StringBox stringSub = stringBox.subString(1, stringBox.length()-1);
    System.out.println(stringSub);
    System.out.println(stringBox.append("+").append("-").subString(0, stringBox.length()-2));
    System.out.println(stringBox);

    //    in order to get the original object address 
    StringBox stringBox2 = StringBox.valueOf("hello World");
    StringBox stringBox3 = stringBox2.subString(2, 4);
    stringBox3.append("!!!!");
    System.out.println(stringBox3);
    System.out.println(stringBox2);
    //System.out.println(StringBox.valueOf("Hello World").subString(2, 4).append("!!!!!"));

    CharSequence chSq = stringBox2.subSequence(1, 5);//ello
    System.out.println(chSq.toString());

    // Polymorphism - Interface 
    CharSequence strBox = "Hello World.";// it is because String has implement CharSequence 
    strBox = new StringBox("Hello world1");
    System.out.println(strBox.length()); 
    System.out.println(strBox); //world
    String str2 = "abcd" ; //obj reference str2 determine the method call . afterward but not the object on RHS 


  }


}