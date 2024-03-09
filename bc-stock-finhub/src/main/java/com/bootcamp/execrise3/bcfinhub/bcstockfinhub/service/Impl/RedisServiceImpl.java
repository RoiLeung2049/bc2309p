package com.bootcamp.execrise3.bcfinhub.bcstockfinhub.service.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bootcamp.execrise3.bcfinhub.bcstockfinhub.dto.response.ProfileData;
import com.bootcamp.execrise3.bcfinhub.bcstockfinhub.dto.response.QuoteData;
import com.bootcamp.execrise3.bcfinhub.bcstockfinhub.infra.RedisHelper;
import com.bootcamp.execrise3.bcfinhub.bcstockfinhub.service.RedisService;
import com.bootcamp.execrise3.bcfinhub.bcstockfinhub.infra.RedisKeySetUp;
import com.fasterxml.jackson.core.JsonProcessingException;


@Service
public class RedisServiceImpl  implements RedisService{


  @Autowired 
  private RedisHelper redisHelper ;

  @Override
  public QuoteData getQuoteData(String key) throws JsonProcessingException { 
    // TODO Auto-generated method stub
    //throw new UnsupportedOperationException("Unimplemented method 'getQuoteData'");
    String redisKey = new RedisKeySetUp().quoteKeySetUp(key) ; 
   // String redisKey =  new RedisKeySetUP.quoteKeySetUp(key);
    return redisHelper.get(redisKey) ; 
  }

  @Override
  public QuoteData createQuoteData(String key, QuoteData datas)
      throws JsonProcessingException {
    // TODO Auto-generated method stub
   // throw new UnsupportedOperationException("Unimplemented method 'createQuoteData'");
        redisHelper.set(new RedisKeySetUp().quoteKeySetUp(key),datas); 

        return datas ;
 
  }

  @Override
  public ProfileData getProfileData(String key) throws JsonProcessingException {
    // TODO Auto-generated method stub
  //  throw new UnsupportedOperationException("Unimplemented method 'getProfileData'");
  
    String redisKey = new RedisKeySetUp().profileKeySetUp(key);
    return redisHelper.get2(redisKey);
}

  @Override
  public ProfileData createProfileData(String key, ProfileData datas)
      throws JsonProcessingException {
   // throw new UnsupportedOperationException("Unimplemented method 'createQuoteData'");
   redisHelper.set(new RedisKeySetUp().profileKeySetUp(key),datas); 

   return datas ;

  }

 

 

}
