public abstract class TestAbstract{

  public String vari = "Test base class" ; 
  
  public TestAbstract(String input){
    this.vari = input ; 
  }

  public TestAbstract(){

  }
  public abstract void calling();

  public abstract String getVari();

}

