public interface FurnitureFactory {

  Chair createChair();
  Sofa createSofa() ;

  public static FurnitureFactory create(Style style){
    return switch(style){
      case MODERN -> new ModernFactory();
      case VICTORIAN -> new VictorianFactory() ; 
    };
  }


  public static void main(String[] args) {
   FurnitureFactory ff =  FurnitureFactory.create(Style.MODERN);// at complier time, we can't understand with ff is pointing to MOdern

   ff.createSofa();// during comile time, do ewe know it is creating modern sofa ? NO it is becuas eRHS can only be understood by runtime 
   // we can do code without the limitation of it is modern chair.

   


  }
  
}

