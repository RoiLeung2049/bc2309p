
public class Card {
   private Suit S ;
    //Court C;
    private Pip P;

    public Card(){

    }

    public Card(Suit s , Pip p){
      this.S = s ;
      this.P = p ; 
    }

    public Suit getSuit(){
      return this.S;
    }

    public Pip getPip(){
      return this.P;
    }

    public void setSuit(Suit s){
      this.S = s ;
    }

    public void setPip(Pip p){
      this.P = p;
    }
}
