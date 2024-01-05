import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DEmoFileNotFound {
  

  public static void main(String[] args)  {
    File file = new File("C:\\Users\\Roi_L\\Downloads\\NWD-Tender-Offer-Memorandum-23-Nov-2023.pdf1");
    read1(file);
    try { 
        read2(file) ; // read2 need to do try catch .  it is because the method signature has throws FileNotFoundexception . we need to do try catch in main
    }catch(FileNotFoundException e){
      System.out.println("They");
      // the exception hanlding part to be handled by user of this code . 
    }




  
    
    
  }

  //Approach 1 : to fix checked exception : Add try catch 
  public static void read1(File file ){

    try{
      
   
    FileReader fileReader = new FileReader(file); // complier will blame for unhandled exception , need to do try catch
    }catch ( FileNotFoundException e ){
      System.out.println("File does not exist1");
    }
  }
  
  //Aproach 2 to fix check exception : Add throws in method signature  . this design force the use of this code to decide the exception hanlding in main . 
  public static void read2(File file) throws FileNotFoundException{
    FileReader fileReader = new FileReader(file); // checked exception 
    throw new FileNotFoundException();
  }
}
