package com.bootcamp.execrise4.bcproductdata.controller.Impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.execrise4.bcproductdata.controller.RedisOperation;
import com.bootcamp.execrise4.bcproductdata.dto.DailyStockOutput;
import com.bootcamp.execrise4.bcproductdata.entity.dailyStockProductEntity;
import com.bootcamp.execrise4.bcproductdata.infra.ApiResponse;
import com.bootcamp.execrise4.bcproductdata.infra.Syscode;
import com.bootcamp.execrise4.bcproductdata.service.RedisService;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@RestController
@RequestMapping(value = "/data/api/v1")
public class RedisController implements RedisOperation{


  @Autowired
  RedisService redisService ; 

  @Override
  //@ResponseStatus(code = HttpStatus.SERVICE_UNAVAILABLE )
  public ApiResponse<List<DailyStockOutput>> getDailyPriceDataWithRedis(
      String Stock_code) {
    // TODO Auto-generated method stub
    //throw new UnsupportedOperationException("Unimplemented method 'getDailyPriceDataWithRedis'");
 
        String inputKey = "stock:daily:".concat(Stock_code);

        List<DailyStockOutput> outputData = new ArrayList<>() ; 
        System.out.println("Before enter the try in getDailyPriceDatawithredis");
        try {
          outputData= redisService.getData(inputKey);
           return ApiResponse.<List<DailyStockOutput>>builder().status(Syscode.OK)
          .data(outputData).build() ; 
        }catch (Exception e) {
        
          return ApiResponse.<List<DailyStockOutput>>builder().status(Syscode.REST_CLIENT_EXCEPTION)
          .data(outputData).build() ; 

        }

       

        
  }

  @Override
  public ApiResponse<List<dailyStockProductEntity>> setDailyPriceDataWithRedis(
      String key, List<dailyStockProductEntity> initData)
       {
    List<dailyStockProductEntity> outputData = new ArrayList<>() ; 
        System.out.println("TEst POint");
    try {
     
      System.out.println("Before setDailyPriceDataWithRedis" + initData.size()) ; 
      System.out.println(initData.get(0));
     
      outputData =  initData ; 
      System.out.println("After setDailyPriceDataWithRedis") ; 
       return ApiResponse.<List<dailyStockProductEntity>>builder().status(Syscode.OK)
      .data(outputData).build() ; 
    }catch (Exception e) {
      System.out.println("Enter execption");
      return ApiResponse.<List<dailyStockProductEntity>>builder().status(Syscode.REST_CLIENT_EXCEPTION)
      .data(outputData).build() ; 

    }
        
  }
  
}
