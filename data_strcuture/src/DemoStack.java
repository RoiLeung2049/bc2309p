import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DemoStack {

  public static void main(String[] args) {
    Queue<String> q = new LinkedList<>();
    q.add("ABC");
    q.add("IJK");
    
    
    Stack<String> st = new Stack<>();
    st.push("Hello");
    st.push("World");
    st.push("!");
    System.out.println(st.pop()); // ! s

    st.add("TEST") ; 
    
     Stack<String> st2 = new Stack<>();
    String [] arr = {"123","456","789"} ; 
    // loop -> insert data into stack 
    // loop -> get the data from stack , place into another array 


    String[] result = new String[arr.length];
    
    for (String s : arr) { 
      st.add(s);

    }
    for (int i  = 0 ; i < arr.length ; i++){
      result[i] = st.pop();
    }

    // print out 
    int J = 0 ; 
    while(!st.isEmpty()){
      System.out.println(result[J++]);
      st.pop();

    }
  }
  
    
}
