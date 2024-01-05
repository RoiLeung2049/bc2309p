public class VictorianFactory implements FurnitureFactory {

  @Override 
  public Chair createChair(){
    System.out.println("Modern chair/....");
    return new VictorianChair();
  }

  @Override
  public Sofa createSofa(){
    System.out.println("creating modern sofa...");

    return new VictorianSofia(); 

  }

  
  
}
