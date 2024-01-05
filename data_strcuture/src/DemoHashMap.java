import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

  public static void main(String[] args) {
    Map<String,String>  StringMap = new HashMap<>() ; 
    //<key,value> pair -> Entry 
    StringMap.put("A","John");
    StringMap.put("B","Peter");
    
    System.out.println(StringMap.get("B"));
    StringMap.put("B","Car");
    System.out.println(StringMap.get("B"));

    // Loop Map.Entry
    for ( Map.Entry<String,String> entry : StringMap.entrySet()){
      System.out.println("Key=" + entry.getKey() + ", value=" + entry.getValue());
    }

    //Loop value ->
    for (String value : StringMap.values()){
      System.out.println("value="+ value);

    }
    

    for( String s : StringMap.keySet()){
      System.out.println("key+" + s);
    }

    System.out.println(StringMap.containsKey("A")); //true
    String[] strings = {"John", "hello","Oscar","oscar","Vincent"};
    // check if the valu exists in map, if no, add into the map , if yes print "already exist" 
    
    for (String s  : strings){
      if ( StringMap.containsValue(s)){
        System.out.println("already exist.");
      }else {
        StringMap.put(s, s);
      }
      

      
    }

     for ( Map.Entry<String,String> entry : StringMap.entrySet()){
      System.out.println("Key=" + entry.getKey() + ", value=" + entry.getValue());
    }
    

  }
  
}
