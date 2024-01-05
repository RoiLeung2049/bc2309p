import java.util.List; 
import java.util.ArrayList;


public class DemoArrayList{

public static void main(String[] args) {
  
  List<String> strings  = new ArrayList<>();

  // before java 1.5 
  List objects = new ArrayList<>();
  objects.add("abd");
  objects.add(1);
  objects.add(1.0);
  System.out.println(objects);
  // what is the problem ? 
  // complier time can't determine the type of objects, it is a object type. it can't use class method.
  // we need to use instanceof to unhide it. 
  if( objects.get(0) instanceof String){
    String str = (String) objects.get(0);
    str = str.concat("ABc");
    objects.set(0,str);
  }

  System.out.println(objects);
}

}

