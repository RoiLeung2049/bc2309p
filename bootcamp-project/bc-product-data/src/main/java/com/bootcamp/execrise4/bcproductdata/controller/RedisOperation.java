package com.bootcamp.execrise4.bcproductdata.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;
import com.bootcamp.execrise4.bcproductdata.dto.DailyStockOutput;
import com.bootcamp.execrise4.bcproductdata.entity.dailyStockProductEntity;
import com.bootcamp.execrise4.bcproductdata.infra.ApiResponse;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface RedisOperation {
  
 public ApiResponse<List<DailyStockOutput>> getDailyPriceDataWithRedis( String Stock_code); 

 public ApiResponse<List<dailyStockProductEntity>> setDailyPriceDataWithRedis( String key ,  
      List<dailyStockProductEntity> initData) ; 
}
