import java.util.Vector;
import java.util.ArrayList;
import java.util.List; 
public class DemoVector{



   public static  ArrayList<String> al = new ArrayList<>();

   public static  Vector<String> vs = new Vector<>() ; 
   // Vector can perform atomic operation for this .add method .  (i.e. 2 thread doing the same operation) 
   // if 2 threads are doing different operations. then arraylist might be able to use . 
   // we need to find which task can be seperated into different operation . 

  public static void main(String[] args)  throws InterruptedException{



    Thread t1 = new Thread( () -> {
      for ( int i  = 0 ;  i < 10000000 ; i++){
        al.add("s");
      }
    });

    Thread t2 = new Thread( () -> {
      for ( int i  = 0 ;  i < 10000000 ; i++){
        al.add("s");
      }
    });

    t1.start();
    t2.start();


    t1.join();
    t2.join();

    System.out.println(al.size());
   // System.out.println(vs.size());


    /// solution 
    Thread t3 = new Thread( () -> {
      for ( int i  = 0 ;  i < 10000000 ; i++){
        vs.add("s");
      }
    });

    Thread t4 = new Thread( () -> {
      for ( int i  = 0 ;  i < 10000000 ; i++){
        vs.add("s");
      }
    });
    t3.start();
    t4.start() ; 

    t3.join();
    t4.join();

    System.out.println(vs.size());

//Vector Class implement List  ; new Vector obj -> this is going to deal with thread programming . 
// it is because vector implmenent list , which is slow. 

    List<String> strings = new Vector<>() ; 

    strings.add("abc");
    strings.add("ijk"); 
    strings.remove("abc");
    System.out.println(strings.get(0)); // ijk
    strings.remove(0);

    System.out.println(strings.size()) ; // 0 

    Vector<String> string2 = new Vector<>();
    string2.add("abc");
    string2.add("ijk");
    string2.removeElementAt(1);
    System.out.println(string2);

    List<String> ss2 = string2 ; 
    


  }
}