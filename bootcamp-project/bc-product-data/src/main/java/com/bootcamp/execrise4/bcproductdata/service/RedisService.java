package com.bootcamp.execrise4.bcproductdata.service;

import java.util.List;
import com.bootcamp.execrise4.bcproductdata.dto.DailyStockOutput;
import com.bootcamp.execrise4.bcproductdata.entity.dailyStockProductEntity;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface RedisService {

      List<DailyStockOutput>  getData( String key) throws JsonProcessingException;

   

      List<DailyStockOutput> init(String key,List<DailyStockOutput> initData) throws JsonProcessingException;


  
  
}
