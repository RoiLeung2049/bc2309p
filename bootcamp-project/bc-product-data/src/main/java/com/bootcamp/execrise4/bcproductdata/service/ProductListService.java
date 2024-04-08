package com.bootcamp.execrise4.bcproductdata.service;

import java.util.List;
import com.bootcamp.execrise4.bcproductdata.dto.CoinList;
import com.bootcamp.execrise4.bcproductdata.entity.CoinsEntity;
import com.bootcamp.execrise4.bcproductdata.entity.StocksEntity;
import com.bootcamp.execrise4.bcproductdata.entity.coinListEntity;

public interface ProductListService {


  coinListEntity saveAllCoinIds(coinListEntity coin_ids);

  StocksEntity saveAllStockIds(StocksEntity stock_ids);

  List<String> getAllCoinsProduct();

  List<String> getAllStocksProduct(); 

  List<Long> getAllCoinPListIndex() ; 

  List<Long> getAllStockPListIndex() ; 
  void deleteCoinIds(String coin_id); // to be done 

  void deleteAllCoinIds() ; 

  void deleteStockIds(String stock_id);  // to be done 
  

  void deleteAllStockIds() ;

  void saveStockId(String stock_id) ;
  
  void saveCoinId(String coin_id) ;


}
