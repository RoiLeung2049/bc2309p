package com.bootcamp.execrise4.bcproductdata.service;

import java.text.ParseException;
import java.util.List;
import com.bootcamp.execrise4.bcproductdata.dto.CoinData;
import com.bootcamp.execrise4.bcproductdata.dto.CoinPriceData;
import com.bootcamp.execrise4.bcproductdata.entity.coinPriceEntity;

public interface CoinPriceService {

  List<CoinData> getPrice(String code) ;

  coinPriceEntity  save(CoinData coinData) throws ParseException; 

  List<coinPriceEntity> getAllCoinPrice() ; 
  
}
