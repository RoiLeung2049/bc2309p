import java.math.BigDecimal;

public class DoubleTest {

  public static void main(String[] args){
    double d1 = 0.1; 
    double d2 = 0.5 ; 
    System.out.println(d1/d2);
    System.out.println(0.3- 0.1);
    
    
    BigDecimal bd = new BigDecimal("0.1") ; 
    BigDecimal bd2 = new BigDecimal("0.5") ;
    // bd are obj. we should use methods instead of operator. 
    BigDecimal result = bd.divide(bd2); // 0.6
    // BD has normal math operation + , - * / 
    System.out.println(result);
   // common practice 
   BigDecimal bd3 = new BigDecimal(String.valueOf("0.5")) ;
    BigDecimal b4 = BigDecimal.valueOf(0.5);
    BigDecimal b5 = BigDecimal.valueOf(0.3);
    System.out.println(b4.add(b5));
    

    double dd = 2.3;
    double ddd = 3.7 ; 
    //System.out.print(dd -ddd);

    BigDecimal bdd = BigDecimal.valueOf(dd);
    BigDecimal bddd = BigDecimal.valueOf(ddd);
    System.out.println(bdd.subtract(bddd).doubleValue());// -1.4;



    // try equal to 


    double d11 = 10.45;
    double d22 = 10.45;
    System.out.println(d11-d22);

  }
}
