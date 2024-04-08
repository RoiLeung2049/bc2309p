package com.bootcamp.execrise2.bccryptocoingecko.config;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.bootcamp.execrise2.bccryptocoingecko.infra.RedisKey;
import com.bootcamp.execrise2.bccryptocoingecko.infra.StringUtil;
import com.bootcamp.execrise2.bccryptocoingecko.model.PriceData.PriceDataBuilder;
import com.bootcamp.execrise2.bccryptocoingecko.service.OutputDataService;
import com.bootcamp.execrise2.bccryptocoingecko.service.RedisService;
import com.bootcamp.execrise2.bccryptocoingecko.model.*;

@Component
public class AppStartRunner implements CommandLineRunner{
  
  
  
    @Autowired
    OutputDataService outputService ; 

    @Autowired
    RedisService redisService ; 


  @Override
  public void run(String... args) throws Exception {
    // TODO Auto-generated method stub
    //throw new UnsupportedOperationException("Unimplemented method 'run'");

    //String initString  = "bitcoin,ethereum,tether,litecoin,ripple" ; 
    System.out.println("Price service app start.") ; 
//getOutputData
    //List<com.bootcamp.execrise2.bccryptocoingecko.model.PriceData> priceData = outputService.getOutputData("usd", initString) ; // default get price from parameters (usd, bitcoin) 


    //List<String> redisKey = StringUtil.getListString("usd", initString);


    //for (com.bootcamp.execrise2.bccryptocoingecko.model.PriceData data : priceData){
    //  redisService.init2("usd".concat(data.getId()),data) ;
    //}
 //   String key = "usd".concat("litecoin");




  //  redisService.init(key, priceData) ;  
  }



}