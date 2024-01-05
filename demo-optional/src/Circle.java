public class Circle extends Shape{

  
  private String cname ;
  
  public Circle(){
    super();
  }

  public Circle(String cname , String sname){
    super(sname);
    this.cname = cname ;  

  }

  //@Override
  public void releaseA(){
    System.out.println("I am a Circle."  + super.getName());
  }




  public static void main(String[] args) {
    Shape sh = new Circle("Circle" , "SCricle");
    sh.release(); // with/ without @Override : Iam a Circle . SSricle

    Shape sh1 = new Shape("FF");
    sh1.release();

//    Circle c = new Circle("")

  }
}
