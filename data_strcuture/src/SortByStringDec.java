import java.util.Comparator;

public class SortByStringDec implements Comparator<String>{

  
  @Override
  public int compare(String  s1, String s2) {
    // TODO Auto-generated method stub

    return  s1.compareTo(s2)> 0 ? -1 : 1 ; 
    
  }


  
}
