public class node {
  

  public node Node; 
  private String name ; 

  // constructor 
  public node() {
    this.Node = null ;
  }

  public node(String name) {
    this.Node = null;
    this.name = name ; 
  }

  public void setNode(node New){
    this.Node = New; // this.Node is the obj referene it store the address of New which is in memory . 

  }

  public node getNext(){
    return this.Node ; // this method return an obj that the address is at this.Node() ; 
  }
  public void add( node New){
    node head = this; // head is the obj ref pointing to "this"  obj

    // get the last obj location 
    while(head.getNext()!=null){
      // shift the hea pointer 
      head = head.getNext(); // head is pointing to object return by head.getNext().
    }
   // if ( head.getNext() == null){
   //   System.out.println("it is the last element");
   // }
    head.Node = New ; // the obj ref in head.Node is now the address of obj New  

  }

    public void add( String name ){
    node head = this; // head is the obj ref pointing to "this"  obj

    // get the last obj location 
    while(head.getNext()!=null){
      // shift the hea pointer 
      head = head.getNext(); // head is pointing to object return by head.getNext().
    }
   // if ( head.getNext() == null){
   //   System.out.println("it is the last element");
   // }
    head.Node = new node(name) ; // the obj ref in head.Node is now the address of obj New  
    System.out.println("ADDED");
  }

  public static void printAll(node N){
    node head = N ;  // obj ref head stores the referene of obj N 
    //test
    while(head.getNext()!=null ){
      System.out.println(head.name);// since head point to the obj N , h.name return  N.name
      head = head.getNext(); // shift pointer
    }

    //need to handle the last element 
    if ( head.Node ==null){// the last node 's Node is null '
      if (head.name != null){
      System.out.println(head.name);
      }
      
    }
    
    


  }

  public String remove(String name){
    node head = this ; 
    if (this.name.equals(name)){
      // if ture , need further handle
      this.name = this.Node.name;

      this.Node = this.Node.getNext() ; //  Node point to obj head.getNext()
      return name ;
    }
    // shift 1 

    while(head.getNext()!=null ){ // for the item not the last 
      if(head.name.equals(name)){

        this.Node = head.getNext();
        return name ;
      }
      //shift 1 item
      head = head.getNext() ; 
    }
    // haandel the last item check  
    // for the care head.getNext() == null
      if(head.name.equals(name)){
  //      System.out.println("Enter");
        head.name = null ; 
        head.Node = null ;  
        //System.out.println(head.Node);
        return name;
      }

    return "nothing";
  }


  public int countItem(){

    int tmp = 0 ;
    if(this.Node == null){
      return tmp ;
    }
    node head = this ; 
    //tmp = 1 ;
    while(head.getNext()!= null  ){
      
        tmp++ ; 
      
      head = head.getNext();
      
    }

    if(head.name != null){// special handle for the first item 
      tmp++;
    }

    return tmp ; 

  }
  public static void main(String[] args) {
    
    node Node1 = new node("Apple");
    //System.out.println(Node1);// it return the address of node("Apple")
    node Node2 = new node("Peter");
    Node1.add(Node2);

    //compare node.getNext() and node.Node
   // System.out.println("COmpareison");
   // System.out.println(Node1.getNext());
  //  System.out.println(Node1.Node);
  //  System.out.println("End Comp");
    //System.out.println(Node2);
    node Node3 = new node("Banana");
    Node1.add(Node3);
    System.out.println("the number of item is : "+ Node1.countItem()); //3
    //------------------------------------------------------------
    node.printAll(Node1);
    System.out.println("First check.");

    node Node4 = new node(); 
  //  Node1.remove("Peter");
    node.printAll(Node1);
    System.out.println("the number of item is : "+ Node1.countItem()); //countItwem has problem at last itme 
    Node1.add("Dell");
    System.out.println("the number of item is : "+ Node1.countItem()); 
    node.printAll(Node1);
    System.out.println(Node1.remove("Watson"));
    System.out.println("the number of item is : "+ Node1.countItem()); 
    node.printAll(Node1);
   // Node1.add("Dell");
  //  System.out.println("the number of item is : "+ Node1.countItem()); //4
  //  node.printAll(Node1);
  //  System.out.println("___________Before_______________");
 //   node.printAll(Node1);
  //  Node1.remove("Peter");
  //  Node1.remove("Apple");
  //  System.out.println("__________After_______________");
  //  node.printAll(Node1);
  //  System.out.println("the number of item is : "+ Node1.countItem()); //3
//    System.out.println("the number of item is : "+ Node1.countItem()); //4
  }
}
