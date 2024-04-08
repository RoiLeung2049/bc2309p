package com.bootcamp.execrise2.bccryptocoingecko.service.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bootcamp.execrise2.bccryptocoingecko.dto.response.outputData;
import com.bootcamp.execrise2.bccryptocoingecko.infra.RedisHelper;
import com.bootcamp.execrise2.bccryptocoingecko.infra.RedisKey;
import com.bootcamp.execrise2.bccryptocoingecko.model.PriceData;
import com.bootcamp.execrise2.bccryptocoingecko.service.RedisService;
import com.fasterxml.jackson.core.JsonProcessingException;


@Service
public class RedisServiceImpl  implements RedisService {


  @Autowired
  private RedisHelper redisHelper;

  @Override
  public PriceData getData(String key) throws JsonProcessingException {
    // TODO Auto-generated method stub
    //throw new UnsupportedOperationException("Unimplemented method 'getData'");

    return redisHelper.get(key);



  }

  @Override
  public PriceData createData(String key, PriceData datas)
      throws JsonProcessingException {

        redisHelper.set(key, datas);
        return datas;
    // TODO Auto-generated method stub
    //throw new UnsupportedOperationException("Unimplemented method 'createData'");
  }

  @Override
  public List<PriceData> init(String key, List<PriceData> initData)
      throws JsonProcessingException {
    // TODO Auto-generated method stub
   // throw new UnsupportedOperationException("Unimplemented method 'init'");

       for (PriceData data : initData){
          redisHelper.set(key,data) ; 
           
       } 
       return initData ;


  }





  @Override
  public PriceData init2(String key, PriceData initData)
      throws JsonProcessingException {
    // TODO Auto-generated method stub
   // throw new UnsupportedOperationException("Unimplemented method 'init'");

//       for (PriceData data : initData){
          redisHelper.set(key,initData) ; 
           
  //     } 
       return initData ;


  }
  
  
}
