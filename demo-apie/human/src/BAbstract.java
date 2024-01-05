public class BAbstract extends TestAbstract{

  public BAbstract(){
    super();
  }

  public BAbstract(String input ){
    super(input);
  }

  @Override
  public void calling() {
    // TODO Auto-generated method stub
    //throw new UnsupportedOperationException("Unimplemented method 'calling'");
    System.out.println("B this is a testing for TestAbtract");
  }

  @Override
  public String getVari() {
    // TODO Auto-generated method stub
  //  throw new UnsupportedOperationException("Unimplemented method 'getVari'");
    return super.vari;
  }
  
}
