import java.util.LinkedList;

public class NameList {
  
    private NameList next ;  // it is an obj reference  they it will be able to get reference of type node . 
    private String value ; 


    //Deisgn a class (Node) , it can links up another object . 
    //

    public NameList getNext(){
      return this.next ; // it return the object that is stored in this.next ; 
    }


    public void setNext(NameList next){
      this.next = next ; 
    }

    public NameList(String id){
      this.value = id ;
    }
    public NameList(){

    }
    public String id(){
      return this.value;
    }
    // add moethod 
    public void add( NameList next ) { 
      // try to add this note tp the bottom of this 
      
      NameList head = this;
      while (head.getNext()!=null) {
         head = this.getNext();
      }
      head.next = next ;
    }

    public void add ( String id ) {
      // try to add this note tp the bottom of this 
      NameList head = this;
      while (head.getNext()!=null) {
         head = head.getNext();
      }
      head.next = new NameList(id);
      
    }
    public int getCount(){
         NameList head = this;
      //   System.out.println("Enry point");
         int tmp = 1 ;
        while (head.getNext()!=null) {
   //       System.out.println("Enry point" + tmp );
         head = head.getNext();
         tmp++;
        }
        return tmp ; 
    }

    public NameList getMiddle(){
      //TO DO 
      // Step1 count total num of elements /2 
      // Step2 loop until that half count 

      return null ; 
    }
    public String remove (String id ){
      // search if id is in this 
      // special handle for this 1st node 
      if(this.id().equals(id)){
        this.value = this.next.value;
        this.next = this.next.next ; 
        return this.value ; 
      }
      // handle the rest 
      //  TO BE DONE . 
      NameList head = this ; 
      while ( head.getNext() != null){

        if(head.id() == id){
          head.value = head.getNext().id();
          this.next = this.next.next;
        }
      }
      return head.value ;
  }

    public static void printAll(NameList nl){
      NameList head = nl  ;
      int count = 0; 
      while( head.getNext()!= null){
        System.out.println("item" + ++count + ":" + head.getNext().id()); // haed.id() = null 
        head = head.getNext();
      }
      System.out.println("THE END. ");
    }
      public static void main(String[] arg){
        NameList node1 = new NameList("John") ; 
        NameList node2 =  new NameList("Mary");
        node1.setNext(node2);
        NameList node3 = new NameList("Peter");
        node2.setNext(node3);

        System.out.println("node1 ref ="+ node1);
     //   System.out.println("node1 next ="+ node1.getNext());
        System.out.println("node2 ref ="+ node2);
        System.out.println("node3 ref ="+ node3);
        NameList head = node1 ;  // head point to node1 , head  get node1's obj  reference
        // head is the obj reference of type node , it store the obj reference .
        while (head.getNext() != null){ // this is to compare the referene of the object return from .getNext() method.
          head = head.getNext() ; // head.getNext() will return get "object" in memory , so head = head.getNext() will point to  THAT obj in memory  
          // this is a shift of pointer .
            //node3's next is null . 

        }
        System.out.println(head);
        System.out.println(head.id());
       System.out.println( node1.getCount());

        NameList nl = new NameList();
        nl.add("ABC");
        nl.add("DEF");
        nl.add("XYZ");
       LinkedList<String> nl2 = new LinkedList<>();
       nl2.add("ABC");
       nl2.add("DEF");
       nl2.add("XYZ"); 
       System.out.println("Before: ");
       NameList.printAll(nl);
       System.out.println(nl.remove("DEF"));// problem 
       System.out.println("After: ");
       NameList.printAll(nl);
      }

}
