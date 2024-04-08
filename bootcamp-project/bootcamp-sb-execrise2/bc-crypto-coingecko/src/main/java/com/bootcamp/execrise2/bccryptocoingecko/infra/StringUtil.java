package com.bootcamp.execrise2.bccryptocoingecko.infra;

import java.util.List;

public class StringUtil {

  public  static List<String> getListString(String Currency, String ids) {

    String[] tmpArray = ids.split(",") ;

    for (int i = 0 ; i < tmpArray.length ; i++){
      tmpArray[i] = Currency.concat(tmpArray[i]) ; 
    }

    return List.of(tmpArray);
  } 
  
}
