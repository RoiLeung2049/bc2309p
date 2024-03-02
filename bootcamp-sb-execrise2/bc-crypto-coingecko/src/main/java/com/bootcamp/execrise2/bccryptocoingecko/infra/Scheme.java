package com.bootcamp.execrise2.bccryptocoingecko.infra;

public enum Scheme {

  HTTPS, HTTP, ;

  public String toLowerCase(){
    return this.name().toLowerCase() ; 
  }
  
}
