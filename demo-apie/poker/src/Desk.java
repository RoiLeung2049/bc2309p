public class Desk {
  Card[] Cards;

  private Desk(boolean withJoker){
    if (withJoker ==true){
      Cards = new Card[54];
    }else {
      Cards = new Card[52];
    }

    int i = 0 ;
    for (Suit S : Suit.values()){
      for ( Pip P : Pip.values()){
        if ( P != Pip.Joker_1 && P != Pip.Joker_2){
          Cards[i++] = new Card(S,P);
        }
        
      }
    }
    if(withJoker){
      Cards[i++] = new Card(null,Pip.Joker_1);
      Cards[i++] = new Card(null, Pip.Joker_2);
    }
  }

  private static Desk of(boolean withJoker){
    return new Desk(withJoker);
  }

  public static Desk withJoker(){
    return of(true);
  }

  public static Desk withoutJoker(){
    return of(false);
  }
  
  }


  

