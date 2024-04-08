package com.bootcamp.execrise4.bcproductdata.service.Impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bootcamp.execrise4.bcproductdata.dto.StockData;
import com.bootcamp.execrise4.bcproductdata.entity.CoinsEntity;
import com.bootcamp.execrise4.bcproductdata.entity.StocksEntity;
import com.bootcamp.execrise4.bcproductdata.entity.coinListEntity;
import com.bootcamp.execrise4.bcproductdata.repository.CoinListRepository;
import com.bootcamp.execrise4.bcproductdata.repository.StockListRepository;
import com.bootcamp.execrise4.bcproductdata.service.ProductListService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class ProductListServiceImpl  implements ProductListService{


  @Autowired
  private CoinListRepository CR ;

  @Autowired
  private StockListRepository SR;

 
  @Override
  public coinListEntity saveAllCoinIds(coinListEntity coin_ids) {
   
    List<coinListEntity> output = new ArrayList<>() ; 
    output.add(coin_ids);
     CR.saveAll(output);
     return coin_ids;
  }

  @Override
  public StocksEntity saveAllStockIds(StocksEntity stock_ids) {
 

    List<StocksEntity> output = new ArrayList<>() ; 
    output.add(stock_ids);
     SR.saveAll(output);
     
    return stock_ids;
  }

  @Override
  public void deleteCoinIds(String coin_id) {
    
    
  }

  @Override
  public void deleteStockIds(String stock_id) {
   
    throw new UnsupportedOperationException("Unimplemented method 'deleteStockIds'");
  }

  @Override
  public List<String> getAllCoinsProduct() {
  
    
      List<String> output = new ArrayList<> () ; 

      List<coinListEntity> cetmpList= new ArrayList<>() ;
      List<coinListEntity> ceList= new ArrayList<>() ; 

      ceList = CR.findAll() ; 
      
     
      ObjectMapper mapper = new ObjectMapper();
     if ( ceList instanceof List<coinListEntity> ){
   
      cetmpList = (List<coinListEntity>) ceList ;
   }


   
   for ( int i = 0 ;  i < cetmpList.size(); i++){
    
      output.add(cetmpList.get(i).getCoin_code());
    
}


    return output ; 
 
  }

	@Override
	public void deleteAllCoinIds() {
		// TODO Auto-generated method stub
	
    CR.deleteAll();
  }

	@Override
	public void deleteAllStockIds() {
		// TODO Auto-generated method stub

    SR.deleteAll();
}

  @Override
  public List<Long> getAllCoinPListIndex() {
    // TODO Auto-generated method stub
    
    
    List<Long> output = new ArrayList<> () ; 

    List<coinListEntity> cetmpList= new ArrayList<>() ;
    List<coinListEntity> ceList= new ArrayList<>() ; 

    ceList = CR.findAll() ; 
    
    
//    ObjectMapper mapper = new ObjectMapper();
   if ( ceList instanceof List<coinListEntity> ){
 
    cetmpList = (List<coinListEntity>) ceList ;
 }

 

 
 for ( int i = 0 ;  i < cetmpList.size(); i++){
    
    output.add(cetmpList.get(i).getId());
}


  return output ; 
  }

  @Override
  public List<Long> getAllStockPListIndex() {
    // TODO Auto-generated method stub
    


     
    List<Long> output = new ArrayList<> () ; 

    List<StocksEntity> setmpList= new ArrayList<>() ;
    List<StocksEntity> seList= new ArrayList<>() ; 

    seList = SR.findAll() ; 
    
    
    ObjectMapper mapper = new ObjectMapper();
   if ( seList instanceof List<StocksEntity> ){
 
    setmpList = (List<StocksEntity>) seList ;
 }

 

 
 for ( int i = 0 ;  i < setmpList.size(); i++){
    
    output.add(setmpList.get(i).getId());
  
}


  return output ; 
  }

  @Override
  public List<String> getAllStocksProduct() {
    // TODO Auto-generated method stub
   
    List<String> output = new ArrayList<> () ; 

    List<StocksEntity> setmpList= new ArrayList<>() ;
    List<StocksEntity> seList= new ArrayList<>() ; 

    seList = SR.findAll() ; 
    
    
    ObjectMapper mapper = new ObjectMapper();
   if ( seList instanceof List<StocksEntity> ){
 
    setmpList = (List<StocksEntity>) seList ;
 }

 

 
 for ( int i = 0 ;  i < setmpList.size(); i++){
    
    output.add(setmpList.get(i).getStock_id());
  
}


  return output ; 
  }

  @Override
  public void saveStockId(String stock_id) {
    // TODO Auto-generated method stub

    StocksEntity inputSE = StocksEntity.builder().stock_id(stock_id).build() ; 
    SR.save(inputSE);

    //throw new UnsupportedOperationException("Unimplemented method 'saveStockId'");
    
  }

  @Override
  public void saveCoinId(String coin_id) {
    // TODO Auto-generated method stub

    coinListEntity inputCE = coinListEntity.builder().coin_code(coin_id).build() ; 
    CR.save(inputCE);

    //throw new UnsupportedOperationException("Unimplemented method 'saveCoinId'");
  }
  
}
