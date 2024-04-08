package com.bootcamp.execrise4.bcproductdata.service.Impl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.bootcamp.execrise4.bcproductdata.dto.CoinData;
import com.bootcamp.execrise4.bcproductdata.dto.CoinPriceData;
import com.bootcamp.execrise4.bcproductdata.entity.CoinsEntity;
import com.bootcamp.execrise4.bcproductdata.entity.coinPriceEntity;
import com.bootcamp.execrise4.bcproductdata.infra.ApiResponse;
import com.bootcamp.execrise4.bcproductdata.infra.CoinMapper;
import com.bootcamp.execrise4.bcproductdata.repository.CoinListRepository;
import com.bootcamp.execrise4.bcproductdata.repository.CoinPriceRepository;
import com.bootcamp.execrise4.bcproductdata.service.CoinPriceService;
import com.fasterxml.jackson.databind.ObjectMapper;



@Service
public class CoinPriceServiceImpl implements CoinPriceService{

  @Autowired
  private RestTemplate restTemplate;


  @Autowired
  private CoinPriceRepository CPR;
  
  //@Value("localhost:8090/crypto/coingecko/api/v1/coins?currency=usd&ids=")
  private String targetUrl ;
  @Override
  public List<CoinData> getPrice(String code ) {
 
    
  
    this.targetUrl = "http://localhost:8090/crypto/coingecko/api/v1/coins?currency=usd&ids=" ;
    
    String parameterString  = code ;
    String targetString = targetUrl.concat(parameterString);
    System.out.println( "the input URL is : " + targetString ) ; 
  

    
    ApiResponse<List<CoinData>> data = restTemplate.getForObject(targetString, ApiResponse.class) ; 
    return   data.getData() ; 
  }



  @Override
  public com.bootcamp.execrise4.bcproductdata.entity.coinPriceEntity save(CoinData coinData) throws ParseException {
   
 
   com.bootcamp.execrise4.bcproductdata.entity.coinPriceEntity CPEntity = CoinMapper.map(coinData) ; 
   
    return CPR.save(CPEntity) ; 
  }

  @Override
  public List<coinPriceEntity> getAllCoinPrice() {
    

    List<coinPriceEntity>  cPEList = new ArrayList<>() ; 
    
    cPEList = CPR.findAll() ; 

    List<coinPriceEntity> output = new ArrayList<>() ; 
    

   if ( cPEList instanceof List<coinPriceEntity> ){
 
    cPEList = (List<coinPriceEntity>) cPEList ;
 }


  for ( int i = 0 ;  i < cPEList.size(); i++){
    
  output.add(cPEList.get(i));
}
    return output;


  }




  
  
}
