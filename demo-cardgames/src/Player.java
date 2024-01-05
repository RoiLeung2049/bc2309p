public class Player {
    public int playernumber';
    public String playername ; 
    private Card[] hands;


    public Player(){

    }

    public Player(String name , Card[] hands){
      this.playername = name ; 
      this.hands  = hands;
    }
}
