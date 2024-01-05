public class AAbstract extends TestAbstract{

  public String vari = "BBBBtest" ;
  @Override
  public void calling() {
    // TODO Auto-generated method stub
      System.out.println("A the implenetation of abstract class testing.");
  }

  public AAbstract(){
    super();

  }

  public AAbstract(String d){
    super(d);
  }

 
 public String getVari(){
    return this.vari ;
 }

  public static void main(String[] args){
      AAbstract T = new AAbstract("GGGGGG") ;
       System.out.println(T.getVari()); //"this is a test." ; 
       T.calling(); //" the implemetation of abstract class testing ."
       System.out.println( T.getVari());

       BAbstract U = new BAbstract("YYYYY");

    //  System.out.println(U.getVari());
    //  U.calling();
      //TestAbstract TT = new BAbstract() ; 

   

    }



  }

