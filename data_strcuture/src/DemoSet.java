import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoSet {
  
  public static void main(String[] args) {
    List<String> strings = new ArrayList<>() ; 
    strings.add("Hello");
    strings.add("world");
    strings.add("world");
    System.out.println(strings);

    Set<String> string2 = new HashSet<>();
    string2.add("Hello");
    string2.add("world");
    string2.add("world");
    System.out.println(string2);

    List<String> strs = List.of("hello","world","hello","hello","XYZ");
    List<String> strList = new ArrayList<>(strs);

    int count = 0 ; 
    for ( String s : strs){
      if(s.equals("hello")){
        count++ ; 
      }
    }

    System.out.println("number of hello is "+ countTarget(strs, "hello")); // 3

    filter(strList);
    System.out.println(strList);// hello world XYZ


    Set<String> st = new HashSet<>();
    st.add("ABD");
    System.out.println(st.size());//1
  }


  public static int countTarget(List<String> list , String target ){
    Set<String> tmp = new HashSet<>();
    tmp.add(target);
    
    int count = 0 ; 
    for (String s : list){
      if (tmp.add(s)==false){
        count++ ; 
      }
    //  return count ; 
    }
    return count; 
  }

  // filter out duplicated element 
  public static void filter(List<String> List){ // the input list has to be a new obj
    // to remove the duplicate elemt from list 
    Set<String> tmp = new HashSet<>();

      for ( int i = 0 ; i < List.size();i++){
          tmp.add(List.get(i));
            //List.remove(i);
          }
    
      
      List.clear();
      for (String s : tmp){
        List.add(s);
      }

  }
}
