import java.util.Comparator;

public class SortByIntegerDesc implements Comparator<Integer> {

    @Override
    public int compare(Integer x , Integer y ){
      return x.compareTo(y) >0 ? -1 : 1 ; 
    }
  }
  

