package com.bootcamp.execrise4.bcproductdata.service;

import java.util.List;
import com.bootcamp.execrise4.bcproductdata.dto.CoinData;
import com.bootcamp.execrise4.bcproductdata.dto.StockData;
import com.bootcamp.execrise4.bcproductdata.entity.coinPriceEntity;
import com.bootcamp.execrise4.bcproductdata.entity.stockPriceEntity;

public interface StockPriceService {

  List<StockData> getPrice(String stock) ; 
  
  stockPriceEntity  save(StockData stockData); 

  List<stockPriceEntity> getAllStockPrice() ; 
}
