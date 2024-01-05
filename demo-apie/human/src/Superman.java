public class Superman extends Human implements Superpower, Life{

  private String name ; 

  public Superman(String name ){
      this.name = name ; 
    }

  public String getName(){
    return this.name;
  }


  public void setName(String name ){
      this.name = name ;
  }

    @Override
    public void fly(){
      System.out.println("Fly");
    }
    @Override
    public void eat(){
      System.out.println( "I eat" );
    }
    @Override
    public void run(){
      System.out.println("I am running") ; 
    }
      public static void main(String[] args) {
        //Polymorphism
        Superman s  = new Superman("Tommy");
        // superman is an object reference 
        // this object referencec is pointing to an Superman Object. 
        Human h = new Superman("May");
        // h is the Parenet class can point to the Child Object Superman . 
        // h can't get name. it is because no get name has been declared in Object class Human . 
        // according to Complie time check
        h.run();// it is because,  run has been decalred in Parent class huamn, 
        // however, h is pointing to the child parent this object's morphism which will be shwon in runtime is Superman. 
        // sicne run is also implmented in Child class, so in runtime, the Child class 's run method has been performed 
        // if the parent has been inherited by many class , it has many possible different implementation will be perfromed .
        // this is Polymorphism 
        
      }
}
