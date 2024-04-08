package com.bootcamp.execrise4.bcproductdata.dto;

import java.util.ArrayList;
import java.util.List;

public class Database {

  private static int id ; 
  private static String[] coin_id = new String[5] ; 


  public static void setId(int index , String cid){

      coin_id[index] = cid ; 

  }



  
  public static String getId(){

    return  coin_id[0]  ; 

}
  
}
