package com.bootcamp.execrise3.bcfinhub.bcstockfinhub.service;

import java.util.List;
import com.bootcamp.execrise3.bcfinhub.bcstockfinhub.dto.response.ProfileData;
import com.bootcamp.execrise3.bcfinhub.bcstockfinhub.dto.response.QuoteData;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface RedisService {


  QuoteData getQuoteData( String key) throws JsonProcessingException;

  QuoteData createQuoteData (String key, QuoteData datas) throws JsonProcessingException;

  ProfileData getProfileData (String key) throws JsonProcessingException ; 

  ProfileData createProfileData (String key, ProfileData datas) throws JsonProcessingException;

//  List<QuoteData> initQuoteData (String key,List<QuoteData> initQuoteData) throws JsonProcessingException;

 // List<QuoteData> initProfileData (String key,List<ProfileData> initProfileData) throws JsonProcessingException;

  //PriceData init2(String key,PriceData initDara) throws JsonProcessingException;

}
