package com.bootcamp.execrise4.bcproductdata.service.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bootcamp.execrise4.bcproductdata.dto.DailyStockOutput;
import com.bootcamp.execrise4.bcproductdata.entity.dailyStockProductEntity;
import com.bootcamp.execrise4.bcproductdata.infra.RedisHelper;
import com.bootcamp.execrise4.bcproductdata.service.RedisService;
import com.fasterxml.jackson.core.JsonProcessingException;


@Service
public class RedisServiceImpl implements RedisService{


  @Autowired
  private RedisHelper redisHelper;

  @Override
  public List<DailyStockOutput>  getData(String key) throws JsonProcessingException {
      return redisHelper.get(key);
  
  }

  

  @Override
  public List<DailyStockOutput> init(String key,
     List<DailyStockOutput> initData) throws JsonProcessingException {

      System.out.println("BEFORE the potential ERROR POINT ") ;
      System.out.println("sie of initData is " + initData);
      redisHelper.set(key,initData) ; 
      System.out.println("the set of data in redis");
       
     return initData ;

  
  }

  
  
}
