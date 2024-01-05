package Cardgame;

public class Card {
  private Suits S ;
  private Rank R ; 

  Card(){

  }

  Card(Suits s , Rank r ){
    this.S = s; 
    this.R = r;
  }

  public Suits getSuits(){
    return this.S;
  }

    public Rank getRank(){
    return this.R;
  }
  
}
