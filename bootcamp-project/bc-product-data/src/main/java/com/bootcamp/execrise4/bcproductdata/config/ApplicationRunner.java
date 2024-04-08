package com.bootcamp.execrise4.bcproductdata.config;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.bootcamp.execrise4.bcproductdata.dto.CoinData;
import com.bootcamp.execrise4.bcproductdata.dto.ProfileData;
import com.bootcamp.execrise4.bcproductdata.dto.StockData;
import com.bootcamp.execrise4.bcproductdata.service.CoinPriceService;
import com.bootcamp.execrise4.bcproductdata.service.ProductListService;
import com.bootcamp.execrise4.bcproductdata.service.ProfileDataService;
import com.bootcamp.execrise4.bcproductdata.service.StockPriceService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class ApplicationRunner  implements CommandLineRunner{


  @Autowired
  CoinPriceService CPS ; 


  @Autowired
  ProfileDataService PDS;

  @Autowired
  StockPriceService SPS ; 
  

  @Autowired 
  ProductListService PS ; 

  @Override
  public void run(String... args) throws Exception {
    // TODO Auto-generated method stub
  //  throw new UnsupportedOperationException("Unimplemented method 'run'");

 // Thread thread1 = new Thread(() ->{



    System.out.println( " App runner ." ) ;

    String stock = "AAPL" ; 
    String coin ="bitcoin" ;
  
    List<String> coinList =  PS.getAllCoinsProduct();
    List<String> stockList =  PS.getAllStocksProduct();
  
    int numberOfCoin = coinList.size(); 
    int numberOfStock = stockList.size() ; 
    
  
    if ( numberOfCoin == 0){
      PS.saveCoinId(coin);
      List<CoinData> tmpTest = CPS.getPrice(coin);  
      ObjectMapper mapper1 = new ObjectMapper();
      List<CoinData> cdtest = mapper1.convertValue(tmpTest, new TypeReference<List<CoinData>>() {});
      
        CPS.save(cdtest.get(0));
      //} catch (ParseException e) {
        // TODO Auto-generated catch block
      //  e.printStackTrace();
      //}
    
    }
    if(numberOfStock == 0 ){
      PS.saveStockId(stock);
        List<StockData> tmpStockOutput = new ArrayList<>() ; 
        List<ProfileData> tmpProfileDataOutput = new ArrayList<>() ; 
        for ( int i = 0 ; i < stockList.size() ; i++){
         // System.out.println("Print i :" + i); 
          
          
          List<StockData> tmpStockTest = SPS.getPrice(stock); 
          List<ProfileData> tmpProfileData = PDS.getData(stock);  // no need 
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
  
    }
    
  
  
    
  
     // System.out.println("end of APP run ") ; 

  //});
  //thread1.setPriority(Thread.MAX_PRIORITY);

  

    System.out.println("end of APP run ") ; 

  }
  
}
