package com.bootcamp.execrise2.bccryptocoingecko.service;

import java.util.List;
import com.bootcamp.execrise2.bccryptocoingecko.dto.response.outputData;
import com.bootcamp.execrise2.bccryptocoingecko.infra.RedisKey;
import com.bootcamp.execrise2.bccryptocoingecko.model.PriceData;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface RedisService {


    PriceData getData( String key) throws JsonProcessingException;

    PriceData createData (String key, PriceData datas) throws JsonProcessingException;

    List<PriceData> init(String key,List<PriceData> initDara) throws JsonProcessingException;

    PriceData init2(String key,PriceData initDara) throws JsonProcessingException;
  
}
