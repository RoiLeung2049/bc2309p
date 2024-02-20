package com;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import com.business.javacode.model.Calculators;
import com.business.javacode.model.RealCalculator;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

//@ExtendWith(MockitoExtension.class)
public class CalculatorTest {

  @Mock
  private Calculators calculator; // this is a reference pointing to type Calculators , so it is a nullpointer ( if no @Mock , then it is a null pointer , with @Mock , it is a obj assigned )



  @InjectMocks //some thing wrong 
 private RealCalculator realCalculator(Calculators calculator){
    this.calculator = calculator ;
  }

  @Test
  void testCalculateMethod(){
    // when someone call this method  "calcualtor.addition(10,5)" , assume return 3 always 
    Mockito.when(calculator.addition(10,5)).thenReturn(3) ; 

      // Call the targeted test method 
  RealCalculator realCalculator = new RealCalculator(calculator); //  "new" object 
  realCalculator.calculate(10);
// a mock object , just set a particular method  ( by Mockito.when(XXXX)).thenReturn() 
// when someone call this particular method , e.g.L realCalculator.calulate(10)

    assertThat( realCalculator.calculate(10), is(17));


    //Another case 

    Mockito.when(calculator.addition(82,41)).thenReturn(10) ; 

  }



  @Test 
  void testSleep(){

    Mockito.when(calculator.addition(10,5)).thenReturn(4); 

    RealCalculator realCalculator = new RealCalculator(calculator) ; 
    assertThat(realCalculator.sleep(10), is (94));
    Mockito.verify(calculator,times(1)).addition(10,5);
   // Mockito.verify(calculator,times(1)).addition(10,6);

  }


  
    
}
