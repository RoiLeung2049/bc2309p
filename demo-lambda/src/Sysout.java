import java.util.function.Consumer;

public class Sysout implements Consumer{

  @Override
  public void accept(Object s){
    System.out.println(s);
  }

}
