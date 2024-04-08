package com.bootcamp.execrise2.bccryptocoingecko.service;

import java.util.List;
import com.bootcamp.execrise2.bccryptocoingecko.model.PriceData ;

public interface OutputDataService {
  
  List<PriceData> getOutputData(String currency , String ids ) ; 

  
}
