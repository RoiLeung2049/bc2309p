package com.bootcamp.execrise4.bcproductdata.service.Impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.bootcamp.execrise4.bcproductdata.dto.CoinData;
import com.bootcamp.execrise4.bcproductdata.dto.StockData;
import com.bootcamp.execrise4.bcproductdata.entity.coinPriceEntity;
import com.bootcamp.execrise4.bcproductdata.entity.stockPriceEntity;
import com.bootcamp.execrise4.bcproductdata.infra.ApiResponse;
import com.bootcamp.execrise4.bcproductdata.infra.CoinMapper;
import com.bootcamp.execrise4.bcproductdata.infra.StockMapper;
import com.bootcamp.execrise4.bcproductdata.repository.StockPriceRepository;
import com.bootcamp.execrise4.bcproductdata.service.StockPriceService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class StockPriceServiceImpl implements StockPriceService{


      
  @Autowired
  private StockPriceRepository SPR ; 
  @Autowired
  private RestTemplate restTemplate;
  
  //@Value("localhost:8090/crypto/coingecko/api/v1/coins?currency=usd&ids=")
  private String targetUrl ;
  

  @Override
  public List<StockData> getPrice(String stock ) {
    // TODO Auto-generated method stub



 
    // TODO Auto-generated method stub
   
    this.targetUrl = "http://localhost:8091/stock/finnhub/api/v1/quote?symbol=" ;
    String parameterString  = stock ;
    String targetString = targetUrl.concat(parameterString);

    ApiResponse<List<StockData>> data = restTemplate.getForObject(targetString, ApiResponse.class) ; 
 

    List<StockData> tmpStockOutput = new ArrayList<>() ; 
    tmpStockOutput = data.getData(); 

        ObjectMapper mapper2 = new ObjectMapper();
         if ( tmpStockOutput instanceof List<StockData> ){
 
      tmpStockOutput = (List<StockData>) tmpStockOutput ;
   }

   List<StockData> sdtest = mapper2.convertValue(tmpStockOutput, new TypeReference<List<StockData>>() {});

   sdtest.get(0).setCode(parameterString); 

   data.setData(sdtest);

 
    return  data.getData() ; 
   // throw new UnsupportedOperationException("Unimplemented method 'getData'");
   
  }


  @Override
  public stockPriceEntity save(StockData stockData) {
    // TODO Auto-generated method stub
  //  throw new UnsupportedOperationException("Unimplemented method 'save'");

 
   stockPriceEntity SPEntity = StockMapper.map(stockData) ; 
   
    return SPR.save(SPEntity) ; 
  }


	@Override
	public List<stockPriceEntity> getAllStockPrice() {
		// TODO Auto-generated method stub



        List<stockPriceEntity>  sPEList = new ArrayList<>() ; 
    
    sPEList = SPR.findAll() ; 

    List<stockPriceEntity> output = new ArrayList<>() ; 
        //ObjectMapper mapper = new ObjectMapper();

   if ( sPEList instanceof List<stockPriceEntity> ){
 
    sPEList = (List<stockPriceEntity>) sPEList ;
 }


  for ( int i = 0 ;  i < sPEList.size(); i++){
    
  output.add(sPEList.get(i));
}
    return output;


	//	throw new UnsupportedOperationException("Unimplemented method 'getAllStockPrice'");
	}
  
}
