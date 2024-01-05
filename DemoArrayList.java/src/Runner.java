public class Runner<T extends Animal> { // we set the range of this class , by settign T has to be child of Animal
  
  private T object; 

  public Runner (T object) {
    this.object  = object ; 

  }

  public T geT(){
    return this.object;
  }

  public static <U extends Animal> Runner<U> getRunner(){ // this is a static method , this methods parameter , can be not related to Runner , so we can set T to be U , 

    return  null ; 
  }
  public static void main(String[] args){
    Runner<Dog> dogRunner = new Runner<>(new Dog());
    

  }

}
