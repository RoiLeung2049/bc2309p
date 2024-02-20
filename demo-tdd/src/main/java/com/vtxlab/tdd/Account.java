package com.vtxlab.tdd;

public class Account {

  private int balance ; 
  
  public Account(int balance){
    this.balance = balance ; 
  }


  public boolean credit(int amount) {
    return false ;
  }


  public boolean debit(int amount){
    return false;
  }

  public int getBalance(){
    return this.balance ;
  }
}
