package com.bootcamp.execrise4.bcproductdata.controller.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.execrise4.bcproductdata.controller.ProductListOperation;
import com.bootcamp.execrise4.bcproductdata.dto.CoinData;
import com.bootcamp.execrise4.bcproductdata.dto.CoinList;
import com.bootcamp.execrise4.bcproductdata.dto.CoinOutput;
import com.bootcamp.execrise4.bcproductdata.dto.DailyStockOutput;
import com.bootcamp.execrise4.bcproductdata.dto.Database;
import com.bootcamp.execrise4.bcproductdata.dto.StockList;
import com.bootcamp.execrise4.bcproductdata.dto.StockOutput;
import com.bootcamp.execrise4.bcproductdata.entity.CoinsEntity;
import com.bootcamp.execrise4.bcproductdata.entity.StocksEntity;
import com.bootcamp.execrise4.bcproductdata.entity.coinListEntity;
import com.bootcamp.execrise4.bcproductdata.entity.coinPriceEntity;
import com.bootcamp.execrise4.bcproductdata.entity.dailyStockProductEntity;
import com.bootcamp.execrise4.bcproductdata.entity.profileDataEntity;
import com.bootcamp.execrise4.bcproductdata.entity.stockPriceEntity;
import com.bootcamp.execrise4.bcproductdata.exception.GlobalExceptionHandler;
import com.bootcamp.execrise4.bcproductdata.exception.RedisKeyException;
import com.bootcamp.execrise4.bcproductdata.infra.ApiResponse;
import com.bootcamp.execrise4.bcproductdata.infra.Syscode;
import com.bootcamp.execrise4.bcproductdata.repository.CoinListRepository;
import com.bootcamp.execrise4.bcproductdata.repository.CoinPriceRepository;
import com.bootcamp.execrise4.bcproductdata.repository.DailyStockProductEntityRepository;
import com.bootcamp.execrise4.bcproductdata.repository.ProfileDataRepository;
import com.bootcamp.execrise4.bcproductdata.repository.StockListRepository;
import com.bootcamp.execrise4.bcproductdata.repository.StockPriceRepository;
import com.bootcamp.execrise4.bcproductdata.service.DBService;
import com.bootcamp.execrise4.bcproductdata.service.ProductListService;
import com.bootcamp.execrise4.bcproductdata.service.RedisService;


@RestController
@RequestMapping(value = "/data/api/v1")
public class ProductListOperationList implements ProductListOperation{

  @Autowired
  RedisController  RC ; 

  @Autowired
  private ProductListService PS ; 

  @Autowired
  private CoinPriceRepository CPR ;
  @Autowired
  private ProfileDataRepository PDR; 

  @Autowired
  StockListRepository SLR ; 
  @Autowired
  private DailyStockProductEntityRepository DSR ;
  @Autowired
  private StockPriceRepository SPR ; 
  @Autowired
  private CoinListRepository CLR ; 
  @Autowired
  private DBService DB ; 

  @Autowired
  RedisService RS;
  @Override
  public ApiResponse<coinListEntity> setCoinProductList(CoinList cl) {
    

 
      coinListEntity coinLists = coinListEntity.builder().id(cl.getId()).coin_code(cl.getCoin_id()).build(); // to be deal with it 
      PS.saveAllCoinIds(coinLists);
      return ApiResponse.<coinListEntity>builder().status(Syscode.OK).data(coinLists).build(); 
   
    }

  @Override
  public ApiResponse<StocksEntity> setStockProductList(StockList sl) {
  


   StocksEntity stockLists = StocksEntity.builder().id(sl.getId()).stock_id(sl.getStock_id()).build();
   PS.saveAllStockIds(stockLists);
   return ApiResponse.<StocksEntity>builder().status(Syscode.OK).data(stockLists).build(); 

  }



  

  @Override
  public List<String> getCoinsProductList() {
    
    List<String> output = new ArrayList<>() ; 
    output = PS.getAllCoinsProduct() ; 
    System.out.println(output)  ; 
    return output ; 
    
  }

  @Override
  public ApiResponse<List<Object>> getAllProduct() { //to  be mod
    
    
    ApiResponse<List<CoinOutput>>  coinProduct = this.getAllCoinsProductList() ;
    ApiResponse<List<StockOutput>> stockProduct = this.getAllStocksProductList(); 

    List<CoinOutput> input1 = coinProduct.getData();
    List<StockOutput> input2 = stockProduct.getData();


    List<Object> output = new ArrayList<>() ; 
    input1.stream().forEach(c -> output.add(c));
    input2.stream().forEach(s -> output.add(s));


    return ApiResponse.<List<Object>>builder().status(Syscode.OK).data(output).build();
 
  }

 

  @Override
  public boolean delete(String coin_id) {
    

    
    // check if the coin_id is in the product list 
    List<String> coinList = new ArrayList<>() ; 
    coinList = PS.getAllCoinsProduct() ; 
    System.out.println("the list is : "  + coinList );
    boolean isExist  = coinList.contains(coin_id) ; 
    
    Integer id =0;
   
    List<Long> coinIndexList = new ArrayList<>() ;
    coinIndexList = PS.getAllCoinPListIndex() ; 
    Long deleteTarget = 0L; 
    

    if( isExist == true){
        // get the id and delete the Entity ; 
        id = coinList.indexOf(coin_id) ; 
        deleteTarget = coinIndexList.get(id) ;  
        System.out.println(deleteTarget);
          CLR.deleteById(deleteTarget);
    }
    
    return isExist ; 

   
  }

  @Override
  public List<String> getStocksProductList() {
    
  
  List<String> output = new ArrayList<>() ; 
  output = PS.getAllStocksProduct() ; 
  System.out.println(output)  ; 
  return output ; 
  }

  @Override
  public ApiResponse<List<StockOutput>> getAllStocksProductList() {
    
  
 
    // get the stock list from t_productlist
    List<String> stockList =  PS.getAllStocksProduct();


    int numOfStock = stockList.size() ; 

    // get the Stock Entity , stockPrice Entity : currentPrice , price CahangePct ,
    //stock profile data : productId , name  , marketCap , logo  
      List<profileDataEntity> tmpEntity;

      List<StockOutput> outputData  = new ArrayList<>() ;
      
      List<stockPriceEntity> tmpStockPriceEntity ; 
    for (String s : stockList){
        tmpEntity = PDR.findEntityByQuoteStockCode(s) ; 
        tmpStockPriceEntity = SPR.findAllEntitiesSortedByDateesc(s);
        StockOutput tmpSO = StockOutput.builder().productId(s)
                            .marketCap(tmpEntity.get(0).getMarketCapitalization())
                            .logo(tmpEntity.get(0).getLogo())
                            .name(tmpEntity.get(0).getName())
                            .currentPrice(tmpStockPriceEntity.get(0).getCurr_price())
                            .priceChangePct(tmpStockPriceEntity.get(0).getPrice_chg_pct())
                            .build() ; 
      outputData.add(tmpSO);
    }
    
      return ApiResponse.<List<StockOutput>>builder().status(Syscode.OK).data(outputData).build(); 

  }

	@Override
	public ApiResponse<List<CoinOutput>> getAllCoinsProductList() {
	
		
    List<String> coinList =  PS.getAllCoinsProduct();
    int numOfCoin = coinList.size() ;
    List<CoinOutput> outputData  = new ArrayList<>() ;
    List<coinPriceEntity> tmpCoinPriceEntity ; 

    for( String c : coinList){
        String input = c.substring(0,1).toUpperCase() + c.substring(1);
        tmpCoinPriceEntity = CPR.findEntityByName(input) ;
        CoinOutput  tmpCO = CoinOutput.builder().productId(c)
                                      .name(tmpCoinPriceEntity.get(0).getName())
                                      .currentPrice(tmpCoinPriceEntity.get(0).getCurrprice()) 
                                      .priceChangePct(tmpCoinPriceEntity.get(0).getPrice_change_pct_24h())
                                      .marketCap(tmpCoinPriceEntity.get(0).getMarket_cap())
                                      .logo(tmpCoinPriceEntity.get(0).getImage())
                                      .build() ; 
      outputData.add(tmpCO) ;
    }


    return ApiResponse.<List<CoinOutput>>builder().status(Syscode.OK).data(outputData).build(); 
  
	}

  @Override
  public ResponseEntity<ApiResponse<List<DailyStockOutput>>> getDailyStockData(String Stock_code) {
    

  //get the ID of input StockCode
    System.out.println("the input stock_code is" + Stock_code) ; 
    List<StocksEntity> StockList = SLR.findAll() ; 
   
    List<DailyStockOutput> output = new ArrayList<>() ; 
    
    Long ID = 0L; // need to handle the case for ID can't be found
    boolean isExist =false  ; 
    for (StocksEntity s : StockList){
    
      System.out.println("the Stock_code input  is " + Stock_code) ;
      System.out.println("the ID is " + s.getId()) ;
      System.out.println("the Stock ID is " + s.getStock_id()) ;
     
      isExist = s.getStock_id().equals(Stock_code);
      if(s.getStock_id().equals(Stock_code)){
       
        ID = s.getId();
        break ; 
      }

     


    }
    System.out.println("is exist is" + isExist);
    if(isExist == false ){
      System.out.println("Entered");
      //new  HttpServletResponse()
     // new HttpStatus()
      //new HttpStatus().SERVICE_UNAVAILABLE ;
      return new ResponseEntity<>( ApiResponse.<List<DailyStockOutput>>builder() //
      .status(Syscode.REST_CLIENT_EXCEPTION) //
      .data(null) //
      .build() ,HttpStatus.SERVICE_UNAVAILABLE);
    }
    
    
    try{
      // the point using Redis
      List<DailyStockOutput> dailyStockData  =  RC.getDailyPriceDataWithRedis(Stock_code).getData() ;
   
      if(dailyStockData.size() ==0){
        System.out.println("There is no data in Redis . Trying to get this in Database now ! ");
        

        try {
       
            List<dailyStockProductEntity> dailyStockDataFromDB  = DSR.findAllEntitiesById(ID) ; 
    

           for ( dailyStockProductEntity dse : dailyStockDataFromDB){
             DailyStockOutput tmp = DailyStockOutput.builder().productId(Stock_code)
             .tradeDate(dse.getTrade_date().toString())
             .dayHigh(dse.getDay_high())
           .dayLow(dse.getDay_low())
             .dayOpen(dse.getDay_open())
             .dayClose(dse.getDay_close())
             .build() ; 
       
             output.add(tmp);
          
         }
             // add the data in Redis for next time usage 
      String inputKey = "stock:daily:".concat(Stock_code);

      try {
        RS.init(inputKey,output);
        System.out.println("data has been added into Redis !") ; 
      }catch( Exception e ){
        output = new ArrayList<>(); 
      }
      
         
        }catch(NullPointerException d){
             output = new ArrayList<>(); 
             return new ResponseEntity<>(ApiResponse.<List<DailyStockOutput>>builder() //
             .status(Syscode.REST_CLIENT_EXCEPTION) //
             .data(null) //
             .build(),HttpStatus.SERVICE_UNAVAILABLE);  
         }

      }else {
        // i..e there is data in Redis
      
       System.out.println("Get Data from Redis");
        for ( DailyStockOutput dse : dailyStockData){
        
          DailyStockOutput tmp = DailyStockOutput.builder().productId(Stock_code)
          .tradeDate(dse.getTradeDate().toString())
          .dayHigh(dse.getDayHigh())
          .dayLow(dse.getDayLow())
          .dayOpen(dse.getDayOpen())
          .dayClose(dse.getDayClose())
          .build() ; 
    

        
          output.add(tmp);
         
      
      }
      
    
        
   
      }
          
      
   
  
 
} catch (Exception f){
  output = new ArrayList<>(); 
  return new ResponseEntity<>(ApiResponse.<List<DailyStockOutput>>builder() //
        .status(Syscode.REST_CLIENT_EXCEPTION) //
        .data(null) //
        .build(),HttpStatus.SERVICE_UNAVAILABLE);
 // new RedisKeyException().restclientExceptionHandler() ;  
}

return new ResponseEntity<>(ApiResponse.<List<DailyStockOutput>>builder().status(Syscode.OK).data(output).build(),HttpStatus.OK);
  }

  //@Override
  public ApiResponse<List<DailyStockOutput>> getDailyStockDataTest(
      String Stock_code) {
  

   List<StocksEntity> StockList = SLR.findAll() ; 
  
   List<DailyStockOutput> output = new ArrayList<>() ;
   System.out.println("the length is " + StockList.size());
   return ApiResponse.<List<DailyStockOutput>>builder().status(Syscode.OK).data(output).build(); 
  }

 
  
}
