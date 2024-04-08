package com.bootcamp.execrise4.bcproductdata.config;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import com.bootcamp.execrise4.bcproductdata.dto.CoinData;
import com.bootcamp.execrise4.bcproductdata.dto.ProfileData;
import com.bootcamp.execrise4.bcproductdata.dto.StockData;
import com.bootcamp.execrise4.bcproductdata.entity.CoinsEntity;
import com.bootcamp.execrise4.bcproductdata.entity.StocksEntity;
import com.bootcamp.execrise4.bcproductdata.entity.coinListEntity;
import com.bootcamp.execrise4.bcproductdata.entity.coinPriceEntity;
import com.bootcamp.execrise4.bcproductdata.entity.dailyStockProductEntity;
import com.bootcamp.execrise4.bcproductdata.entity.profileDataEntity;
import com.bootcamp.execrise4.bcproductdata.entity.stockListEntity;
import com.bootcamp.execrise4.bcproductdata.entity.stockPriceEntity;
import com.bootcamp.execrise4.bcproductdata.repository.CoinListRepository;
import com.bootcamp.execrise4.bcproductdata.repository.CoinPriceRepository;
import com.bootcamp.execrise4.bcproductdata.repository.CoinRepository;
import com.bootcamp.execrise4.bcproductdata.repository.DailyStockProductEntityRepository;
import com.bootcamp.execrise4.bcproductdata.repository.ProfileDataRepository;
import com.bootcamp.execrise4.bcproductdata.repository.StockListRepository;
import com.bootcamp.execrise4.bcproductdata.repository.StockPriceRepository;
import com.bootcamp.execrise4.bcproductdata.repository.StocksRepository;
import com.bootcamp.execrise4.bcproductdata.service.CoinPriceService;
import com.bootcamp.execrise4.bcproductdata.service.ProductListService;
import com.bootcamp.execrise4.bcproductdata.service.ProfileDataService;
import com.bootcamp.execrise4.bcproductdata.service.StockPriceService;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
@EnableScheduling // inject some other beans into Context
public class ScheduledConfig {
  

  @Autowired
  DailyStockProductEntityRepository DSR ; 

  @Autowired
  StocksRepository SR ; 

  @Autowired
  StockPriceRepository SPR ; 

  @Autowired
  CoinPriceService CPS;

  @Autowired
  StockPriceService SPS ; 

  @Autowired
  ProfileDataService PDS;
  
  @Autowired
  ProfileDataRepository PDR;

  @Autowired
  CoinListRepository CLR ; 

  @Autowired
  StockListRepository SLR ; 

  @Autowired
  ProductListService PS; 


  @Autowired
  CoinRepository CR ; 

  @Autowired
  CoinPriceRepository CPR;

  @Scheduled(fixedRate = 60000) // 3000ms = 3s
  public void fixedRateTask() throws InterruptedException, ParseException {

     List<String> coinList =  PS.getAllCoinsProduct();

  
     List<String> stockList =  PS.getAllStocksProduct();
     System.out.println("the numberof stocklist is : " + stockList.size()) ;
     
    System.out.println("The stockList is now : " + stockList) ; 
   

    String inputCoinString  = "" ; 
    

    String inputStockString = "" ; 



    String tmpCoinString = "" ; 
     
    for (int i = 0 ; i < coinList.size() ; i++){

      if( i == 0 ){
        tmpCoinString = coinList.get(0);
      }
      else {

        tmpCoinString = tmpCoinString.concat(",").concat(coinList.get(i));

      }
                
      

    }

    
    
    
    
    List<CoinData> tmpOutput = new ArrayList<>() ; 
    System.out.println("start fixedRateTask " + System.currentTimeMillis());
  
    List<CoinData> tmpTest = CPS.getPrice(tmpCoinString);  
    ObjectMapper mapper1 = new ObjectMapper();
    List<CoinData> cdtest = mapper1.convertValue(tmpTest, new TypeReference<List<CoinData>>() {});

    for ( int i = 0 ; i < cdtest.size() ; i++){
      
      CPS.save(cdtest.get(i));
  
    
     

    }
    



      List<StockData> tmpStockOutput = new ArrayList<>() ; 
      List<ProfileData> tmpProfileDataOutput = new ArrayList<>() ; 
      for ( int i = 0 ; i < stockList.size() ; i++){
        System.out.println("Print i :" + i); 
        inputStockString = stockList.get(i);
        System.out.println("the inputString is: " +inputStockString ) ; 
        List<StockData> tmpStockTest = SPS.getPrice(inputStockString); 
        List<ProfileData> tmpProfileData = PDS.getData(inputStockString);  // no need 
        ObjectMapper mapper2 = new ObjectMapper();
        
        if ( tmpStockTest instanceof List<StockData> ){
          
          tmpStockOutput = (List<StockData>) tmpStockTest ;
           
       }


       if ( tmpProfileData instanceof List<ProfileData> ){
       
        tmpProfileDataOutput = (List<ProfileData>) tmpProfileData ;
        
     }

       List<StockData> sdtest = mapper2.convertValue(tmpStockOutput, new TypeReference<List<StockData>>() {});
       List<ProfileData> pdtest = mapper2.convertValue(tmpProfileData, new TypeReference<List<ProfileData>>() {});
      
       
       SPS.save(sdtest.get(0));      
       PDS.save(pdtest.get(0)); 
      }

      CPS.getAllCoinPrice();
    System.out.println("end fixedRateTask ");

 
  }
  /////////////////////////////////////////////////////////////////////////////

  @Scheduled(fixedRate = 60000) // 3000ms = 3s
  public void fixedRateTask2() throws InterruptedException {


         
        System.out.println("Restruct the product list table now !" ) ; 

        //get the coin and stock , and price list
        List<coinPriceEntity> startCoinList = CPS.getAllCoinPrice()  ; //ALL PRICE LIST
        List<stockPriceEntity> startStockList = SPS.getAllStockPrice() ; //All stock price list
        List<coinListEntity> CoinList = CLR.findAll(); //coinlist
        List<StocksEntity> StockList = SLR.findAll() ;  //stocklist
  //      System.out.println("the stock list is " + StockList ) ; 
        List<profileDataEntity> StockProfileList = PDR.findAll() ;
    System.out.println("Test point 1");
        int coinLength = 0 ; 
        if (startCoinList.size()!= 0 ){
            coinLength = startCoinList.size()-1 ;
        }
// need to change for change coin 
System.out.println("Test point 2");
       
        CR.deleteAll(); // not to be used at initial 


       try {


        for (coinListEntity cle : CoinList){ // this fois the error point  loop 
          System.out.println(cle);
          String coinName = cle.getCoin_code(); //<- this is the error part. 
System.out.println("Test point 2.1");
          coinName = coinName.substring(0,1).toUpperCase().concat(coinName.substring(1)) ;  
System.out.println("Test point 3"); 
          List<coinPriceEntity> tmpEntityList = CPR.findEntityByName(coinName);
          // get the latest record
System.out.println("Test point 4");
          coinPriceEntity latestCoinPriceEntity  = tmpEntityList.get(0);
          
        CoinsEntity lastCoinEntity  = CoinsEntity.builder().name(latestCoinPriceEntity.getName())
        .curr_price(latestCoinPriceEntity.getCurrprice())
        .price_change_pct(latestCoinPriceEntity.getPrice_change_pct_24h())
        .market_cap(latestCoinPriceEntity.getMarket_cap()).coinList(cle).logo(latestCoinPriceEntity.getImage())/// to be mod.

        .build();

        CR.save(lastCoinEntity);

        } 



       }catch( IndexOutOfBoundsException I){
        System.out.println(" the app is at inital stage.") ; 
       }
 //       for (coinListEntity cle : CoinList){ // this fois the error point  loop 
//          String coinName = cle.getCoin_code(); 
//          coinName = coinName.substring(0,1).toUpperCase().concat(coinName.substring(1)) ;  
//System.out.println("Test point 3"); 
//          List<coinPriceEntity> tmpEntityList = CPR.findEntityByName(coinName);
          // get the latest record
//System.out.println("Test point 4");
//          coinPriceEntity latestCoinPriceEntity  = tmpEntityList.get(0);
          
//        CoinsEntity lastCoinEntity  = CoinsEntity.builder().name(latestCoinPriceEntity.getName())
//        .curr_price(latestCoinPriceEntity.getCurrprice())
 //       .price_change_pct(latestCoinPriceEntity.getPrice_change_pct_24h())
 //       .market_cap(latestCoinPriceEntity.getMarket_cap()).coinList(cle).logo(latestCoinPriceEntity.getImage())/// to be mod.

 //       .build();
 //       CR.save(lastCoinEntity);
//
//        } 

     //   coinPriceEntity latestCoinData =  startCoinList.get(coinLength) ; 
     //   String latestCoin = startCoinList.get(coinLength).getName().toLowerCase() ; 

       // int location = 0 ; 

       // coinListEntity tmp = CoinList.get(0) ;

      //  if( coinLength == 0 ){
       
      //  }else {
           
      //  for ( int i = 0 ; i  < CoinList.size() ; i++){ // to be removed 


        //  tmp = CoinList.get(i) ;
        //  if( tmp.getCoin_code() == latestCoin){
        //      location = i ;
         //     break ; 
         // }  
        
      //}
       // }

     
    

      //  coinListEntity  coinList = CoinList.get(location) ; 

        
      // int stockLength = 0 ;
         
     //   if (StockList.size()!= 0 ){
       //     stockLength = startStockList.size()-1 ;
      //  }
        // variable forthe latest tran data
        SR.deleteAll();
      try {


        System.out.println("Tets point 5");
        for (StocksEntity sle : StockList){
          String stockName = sle.getStock_id(); 
          stockName = stockName.toUpperCase() ;   
          List<stockPriceEntity> tmpEntityList = SPR.findAllEntitiesSortedByDateesc(stockName);
          // get the latest record
          System.out.println("Tets point 6");
          stockPriceEntity latestStockPriceEntity  = tmpEntityList.get(0); // here is the error point 
          
          // get sstock profile data  
          
          System.out.println("Tets point 7");
          List<profileDataEntity> proDataTmp = PDR.findEntityByQuoteStockCode(stockName) ;
          
          
          profileDataEntity proDataList = proDataTmp.get(proDataTmp.size()-1);

          stockListEntity lastStockEntity  = stockListEntity.builder().name(proDataList.getName())
          .curr_price(latestStockPriceEntity.getCurr_price())
          .price_chg_pct(latestStockPriceEntity.getPrice_chg_pct())
          .SE(sle)
          .logo(proDataList.getLogo())
          .market_cap(proDataList.getMarketCapitalization())
          .build() ;

          SR.save( lastStockEntity);          
        
        

        } 


      }catch ( IndexOutOfBoundsException I){
        System.out.println(" the app is at inital stage.") ; 
      }
      //  SR.deleteAll();

//        System.out.println("Tets point 5");
 //       for (StocksEntity sle : StockList){
      //    String stockName = sle.getStock_id(); 
     //     stockName = stockName.toUpperCase() ;   
     //     List<stockPriceEntity> tmpEntityList = SPR.findAllEntitiesSortedByDateesc(stockName);
          // get the latest record
     //     System.out.println("Tets point 6");
     //     stockPriceEntity latestStockPriceEntity  = tmpEntityList.get(0); // here is the error point 
          
          // get sstock profile data  
          
      //    System.out.println("Tets point 7");
     //     List<profileDataEntity> proDataTmp = PDR.findEntityByQuoteStockCode(stockName) ;
          
          
      //    profileDataEntity proDataList = proDataTmp.get(proDataTmp.size()-1);

     //     stockListEntity lastStockEntity  = stockListEntity.builder().name(proDataList.getName())
       //   .curr_price(latestStockPriceEntity.getCurr_price())
      //    .price_chg_pct(latestStockPriceEntity.getPrice_chg_pct())
     //     .SE(sle)
    //      .logo(proDataList.getLogo())
    //      .market_cap(proDataList.getMarketCapitalization())
    //      .build() ;

     //     SR.save( lastStockEntity);          
        
        

   //     } 

        //stockPriceEntity latestStock = startStockList.get(stockLength);
        //String latestStockName = startStockList.get(stockLength).getQuote_stock_code() ; 
        //int stockLocation = 0 ; 

        //StocksEntity stockTmp = StockList.get(0) ;


        //if( stockLength == 0 ){
       
        //}else {
           
        //for ( int i = 0 ; i  < StockList.size() ; i++){
        //  stockTmp = StockList.get(i) ;
        //  if( stockTmp.getStock_id() == latestStockName){ // to be removed 
        //      stockLocation = i ;
         //     break ; 
         // }  
        
      //}
        //}

       // StocksEntity stockList = StockList.get(stockLocation) ; 
        

       // int profileDataLocation = 0 ;
       // profileDataEntity proDataTmp = StockProfileList.get(profileDataLocation);
       // if (StockProfileList.size()!= 0 ){
       //   profileDataLocation = StockProfileList.size()-1 ;
     // }
     // if( profileDataLocation == 0 ){
       
     // }else {
     //    
    //  for ( int i = 0 ; i  < StockProfileList.size() ; i++){
    //    proDataTmp = StockProfileList.get(i) ;
    //    if( proDataTmp.getQuote_stock_code() == stockList.getStock_id()){
    //      profileDataLocation = i ;
    //        break ; 
    //    }  
      
    //}
     // }

     // profileDataEntity  proDataList = StockProfileList.get(profileDataLocation) ; 

     //   System.out.println("the latest stock is " + stockList.getStock_id());       
        //make a StockEntity 
       // StocksEntity  stocks = 
      //  stockListEntity latestStockListEntity = stockListEntity.builder().name(proDataList.getName())
      //                                          .curr_price(latestStock.getCurr_price())
      //                                          .price_chg_pct(latestStock.getPrice_chg_pct())
      //                                          .SE(stockList)
       //                                         .logo(proDataList.getLogo())
       //                                         .market_cap(proDataList.getMarketCapitalization())
       //                                         .build() ; // to be DONE this part !!!!
     //   String latestStock = startStockList.get(stockLength).getQuote_stock_code().toLowerCase() ; 
        
     //   System.out.println("BE4 coin entity") ; 

      // insert the lat trains into t_product_coins table 
      //CoinsEntity lastCoinEntity  = CoinsEntity.builder().name(latestCoinData.getName())
      //                              .curr_price(latestCoinData.getCurrprice())
      //                              .price_change_pct(latestCoinData.getPrice_change_pct_24h())
      //                              .market_cap(latestCoinData.getMarket_cap()).coinList(coinList).logo(latestCoinData.getImage())
      //                              .build();
                                  
      // update tproduct_coins
   //   CR.deleteAll(); 
   //   SR.deleteAll();

     // CR.save(lastCoinEntity); // to be removed

    //  SR.save(latestStockListEntity);

    //  System.out.println("the latest stock is " + latestStock);


  
        System.out.println("End of restruct the Domain Data");

  }

  
  
  //@Scheduled(fixedRate = 180000)
  @Scheduled(cron="0 0 6 * * *") // 3000ms = 3s
  public void fixedRateTask3() throws InterruptedException {

     

    // 0. get the stock list in tproduct_stock_list 
    List<String> stockList =  PS.getAllStocksProduct() ; 
    //1. get all the trade data from texternal 
    List<stockPriceEntity>  stockPriceData = SPS.getAllStockPrice() ; 


    Set<String> stockSet = new HashSet<>(stockList) ; 

    List<stockPriceEntity> tmpEntity;
    stockPriceEntity tmpLatestStockData ; 
    
    List<stockPriceEntity> tmpList = new ArrayList<>() ; 

    for (String se : stockSet){
     
      System.out.println("the list of stock is : " + se) ;
      tmpEntity = SPR.findAllEntitiesSortedByDateesc(se);
      // return the latest trans as daily finalized data ,i.e the first row in Entity 

      try {
        tmpLatestStockData = tmpEntity.get(0) ; 
      }catch (IndexOutOfBoundsException I){
        break ; 
      }
      
      // put the last row into the tmp List for futher hanlding.
      tmpList.add(tmpLatestStockData);  

      
    }
    System.out.println(tmpList);
    // modify the tmpList and make the dailystockEntity and sent them back to DB 


  //  int stockLength = 0 ;
         
    for ( stockPriceEntity spe : tmpList){

      StocksEntity SE = SLR.findEntityByStockId(spe.getQuote_stock_code()).get(0);
      dailyStockProductEntity dailySPE = dailyStockProductEntity.builder()
                                        .trade_date(spe.getQuote_date())
                                        .day_high(spe.getPrice_day_high())
                                        .day_low(spe.getPrice_day_low())
                                        .day_open(spe.getPrice_prev_close())
                                        .day_close(spe.getCurr_price())
                                        .SE(SE)  
                                        .build() ;  
        DSR.save(dailySPE) ; 
        System.out.println("Daily data saved") ; 
                                      }
    
                


  }

}
