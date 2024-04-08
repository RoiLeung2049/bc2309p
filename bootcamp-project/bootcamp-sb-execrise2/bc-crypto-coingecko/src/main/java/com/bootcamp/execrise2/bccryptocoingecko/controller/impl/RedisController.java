package com.bootcamp.execrise2.bccryptocoingecko.controller.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.execrise2.bccryptocoingecko.controller.RedisOperation;
import com.bootcamp.execrise2.bccryptocoingecko.dto.response.Data;
import com.bootcamp.execrise2.bccryptocoingecko.dto.response.outputData;
import com.bootcamp.execrise2.bccryptocoingecko.infra.ApiResponse;
import com.bootcamp.execrise2.bccryptocoingecko.infra.Syscode;
import com.bootcamp.execrise2.bccryptocoingecko.mapper.CoinMapper;
import com.bootcamp.execrise2.bccryptocoingecko.model.PriceData;
import com.bootcamp.execrise2.bccryptocoingecko.service.OutputDataService;
import com.bootcamp.execrise2.bccryptocoingecko.service.RedisService;
import com.bootcamp.execrise2.bccryptocoingecko.service.Impl.RedisServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.bootcamp.execrise2.bccryptocoingecko.infra.StringUtil;

@RestController
@RequestMapping(value = "/crypto/coingecko/api/v1")
public class RedisController implements RedisOperation{



   @Autowired
  RedisService redisService ;

  @Override
  public ApiResponse<List<Data>> getProductPriceDataWithRedis(String Currency, String ids) {
    // TODO Auto-generated method stub
    //String inputLey = Currency.concat(ids);

    List<String> inputKeys =  StringUtil.getListString(Currency,ids);
    //getListString(Currency , ids) ;
   //  outputData ApiResponseData = CoinMapper.map(redisService.getData(inputLey) );
        
   //     return ApiResponse.<outputData>builder().status(Syscode.OK)
    //                                            .data(ApiResponseData).build() ; 
    //throw new UnsupportedOperationException("Unimplemented method 'getProductPriceData'");

    List<PriceData> beforeData = new ArrayList<>();

    for (String id : inputKeys){

      try {


       
        beforeData.add(redisService.getData((id)));
       // System.out.println("the redis controller key is :" +id);
       //System.out.println(redisService.getData(id)) ;
        }catch (Exception e) {
        
          System.out.println(e); 
        }

       
   
    }  

    List<Data> ApiResponseData = CoinMapper.map(beforeData );

    return ApiResponse.<List<Data>>builder().status(Syscode.OK)
    .data(ApiResponseData).build() ; 

 //   return null ;
  }

}
