import java.util.HashMap;
import java.util.Hashtable; 

public class DemoHashtable {



   public static Integer counter = 0 ;
   public static Integer counter2 = 0 ; 
  public static void main(String[] args) throws InterruptedException{
    // hashmap is a non-thread-safe DS.
    // hashtable is  thread-safe DS. 

    
    HashMap<Integer , String> hm = new HashMap<> () ; 
    
    Thread t1 =new Thread( () -> {
      for ( int i = 0 ; i < 100000; i++)
        hm.put(counter++, "Alice");
    });

    Thread t2 =new Thread( () -> {

      for ( int i = 0 ; i < 100000 ; i++)
        hm.put(counter++, "Boy");
    });


    t1.start();
    t2.start(); 

    t1.join();
    t2.join();
    System.out.println("HashMap's value of counter is :"+ hm.size());
    


    //-------- HashTable

      Hashtable<Integer , String> ht = new Hashtable<> () ; 
    
    Thread t3 =new Thread( () -> {
      for ( int i = 0 ; i < 100000; i++)
        ht.put(counter2++, "Alice");
    });

    Thread t4 =new Thread( () -> {

      for ( int i = 0 ; i < 100000 ; i++)
        ht.put(counter2++, "Boy");
    });


    t3.start();
    t4.start(); 

    t3.join();
    t4.join();
    System.out.println("Hashtable's value of counter is :"+ ht.size());
    

     HashMap<Integer, String> map = new HashMap<>(); 
     Hashtable<Integer, String> table = new Hashtable<>();

     Runnable mapPut = () -> {
      for (int i = 0 ; i < 1000000 ; i++){
        map.put(i, String.valueOf(i));
      }
     };

     Thread t5 = new Thread(mapPut);
     t5.start() ; 
      Thread t6 = new Thread(mapPut);
     t6.start() ;
     
     t5.join();
     t6.join() ; 

     System.out.println(map.size());
     
      Runnable tablePut = () -> {
      for (int i = 0 ; i < 1000000 ; i++){
        table.put(i, String.valueOf(i));
      }
     };

     Thread t7 = new Thread(tablePut);
     t7.start() ; 
      Thread t8 = new Thread(tablePut);
     t8.start() ;
     
     t7.join();
     t8.join() ; 

     System.out.println(table.size());
     

  }
  
}
