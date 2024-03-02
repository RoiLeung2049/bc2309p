package com.bootcamp.execrise2.bccryptocoingecko.controller.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.execrise2.bccryptocoingecko.controller.PriceOperation;
import com.bootcamp.execrise2.bccryptocoingecko.dto.response.Data;
import com.bootcamp.execrise2.bccryptocoingecko.dto.response.outputData;
import com.bootcamp.execrise2.bccryptocoingecko.infra.ApiResponse;
import com.bootcamp.execrise2.bccryptocoingecko.infra.Syscode;
import com.bootcamp.execrise2.bccryptocoingecko.mapper.CoinMapper;
import com.bootcamp.execrise2.bccryptocoingecko.service.OutputDataService;
import com.bootcamp.execrise2.bccryptocoingecko.service.RedisService;


@RestController
@RequestMapping(value = "/crypto/coingecko/api/v1")
public class PriceController  implements PriceOperation{

  @Autowired
  OutputDataService outputDataService ;


  @Autowired
  RedisService redisService;

  @Override
  public  ApiResponse<List<Data>>  getProductPriceData(String Currency,
      String ids) {

        //public  ApiResponse<outputData>  getProductPriceData(String Currency,
  //    String ids) {
  
    // TODO Auto-generated method stub

        
        List<Data> ApiResponseData = CoinMapper.map(outputDataService.getOutputData(Currency,ids) );
        
    //    System.out.println("THIS iS a test for redis service") ; 

    //    String testKey = "usdlitecoin" ;

    //    try {
    //      System.out.println(redisService.getData(testKey));
    //    }catch (Exception e) {
    //        System.out.println("it doesn't work)"); 
     //   }
   

        return ApiResponse.<List<Data>>builder().status(Syscode.OK)
                                                .data(ApiResponseData).build() ; 
    //throw new UnsupportedOperationException("Unimplemented method 'getProductPriceData'");
  }

  





}