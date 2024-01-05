import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoArrayList {

  public static void main(String[] args) {
    // array , it is a data structure 
    String[] strings = new String[5]; // fixed size 

    for (int i = 0 ; i < strings.length;i++){
      strings[i] = "Hello World" ;   

  }

  // ArrayList , it is a class  generic code need to define "type" for arraylist 
  ArrayList<String> string2 = new ArrayList<>() ;  // or new ArrayList<String> ; 
  // Arrayllist has varaible size, the length is not fix. 
  string2.add("Hello") ; //what has happned in ArrayList : an array is removed , and new another array  
  string2.add("Hello") ;
  
  for (String s: string2){
    System.out.println(s);
  }

  
  string2.add("world");
  for (String s: string2){
    System.out.println(s);
  }

  // for arraylist for int 
  // store the number which can be divided  by 3
  // ArrayList is ordered  
  ArrayList<Integer> int3 = new ArrayList<>(); // we can't put primtive type but clas only 
  int i = 1; 
  while(( i <=10 )){
    if (i%3 ==0){
       int3.add(Integer.valueOf(i));
    }
   
    // i -> primitive -> Wrapper class (auto-box) 
    i++ ; 
  }
  System.out.println(int3);
  //set() method of ArrayList 
  int3.set(1,10);
  System.out.println(int3);
  //get() method 
  System.out.println(int3.get(2));
  //size()
  System.out.println(int3.size());
// isEmpty()
 System.out.println(int3.isEmpty());


 //remove() by index 
 int3.remove(2);// remove the 3rd object 
 System.out.println(int3);

 //remove() by object
 int3.remove(Integer.valueOf(10));
 System.out.println(int3);

 //contains()
 System.out.println(int3.contains(3)); // true 
 System.out.println(int3.contains(9)); //false 

 ArrayList<Integer> integer2 = new ArrayList<>() ; 
 integer2.add(1000);
 integer2.add(2200);
 integer2.add(1000); 
 // addAll()
 integer2.addAll(int3);
 System.out.println(integer2);

 // indexOf
 System.out.println(integer2.indexOf(1000)); // 0 
 System.out.println(integer2.lastIndexOf(1000)); 
 //add(index, element) -> insert 
// removeAll()
ArrayList<Integer> removeList = new ArrayList<>();
removeList.add(2200);
//  Conversion to Array ( ArrayList to Array)
// 
Integer[] arr = integer2.toArray(new Integer[0]);
System.out.println(Arrays.toString(arr));

Object[] arr2 = integer2.toArray();
Integer[] result = new Integer[arr2.length];
int k = 0 ;
for (Object obj : arr2){
  if(obj== null){
    result[k++] = null ; 
  }else if ( obj instanceof Integer){
    result[k++] = (Integer) obj ;
  }
}


  // List  , it is an inteface a contract which is implemented by ArrayList 

  ArrayList<String> strings3 = new ArrayList<>(); // string3 is obj ref  of type ArrayList, at complier time , it can call ALL the metho from ArayList . 
// List  , it is an inteface a contract which is implemented by ArrayList , thus
 List<String> strings4 = new ArrayList<>(); // string4 is an obj ref of type List , so it complie time , it can only call method of inteeface list 
  
//ArrayLst.class  is implementing Interface Lisr 
// So, the method in List  must be implemented in ArrayList, but it is not the case for the other round. 

  strings3.add("hello");
  strings4.add("hello");

  System.out.println(strings3);
  System.out.println(strings4);


}


}