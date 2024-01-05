public class Father {
  
  public String Name  ="F"; 

  @Override
  public String toString(){
    return " My name is :" + this.Name;
  }

  public Father(){

  }

  public Father(String F){
    this.Name = F ; 
  }
}
