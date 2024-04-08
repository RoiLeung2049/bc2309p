package com.bootcamp.execrise3.bcfinhub.bcstockfinhub.controller.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.execrise3.bcfinhub.bcstockfinhub.controller.QuoteOperation;
import com.bootcamp.execrise3.bcfinhub.bcstockfinhub.dto.response.ProfileData;
import com.bootcamp.execrise3.bcfinhub.bcstockfinhub.dto.response.QuoteData;
import com.bootcamp.execrise3.bcfinhub.bcstockfinhub.infra.ApiResponse;
import com.bootcamp.execrise3.bcfinhub.bcstockfinhub.infra.Syscode;
import com.bootcamp.execrise3.bcfinhub.bcstockfinhub.service.ProfileService;
import com.bootcamp.execrise3.bcfinhub.bcstockfinhub.service.QuoteService;
import com.bootcamp.execrise3.bcfinhub.bcstockfinhub.service.RedisService;
import com.fasterxml.jackson.core.JsonProcessingException;


@RestController
@RequestMapping(value= "/stock/finnhub/api/v1")
public class QuoteOperationImpl implements QuoteOperation{

  @Autowired 
  QuoteService quoteService ;

  @Autowired
  RedisService redisService ; 

@Autowired
ProfileService profileService ; 

  @Override
  public ApiResponse<List<QuoteData>> getQuote(String symbol) {
    // TODO Auto-generated method stub
  //  throw new UnsupportedOperationException("Unimplemented method 'getQuote'");

  List<QuoteData> ApiResponseData = quoteService.getData(symbol) ;
    try {
      redisService.createQuoteData(symbol,ApiResponseData.get(0));
    } catch (JsonProcessingException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return ApiResponse.<List<QuoteData>>builder().status(Syscode.OK).data(ApiResponseData).build();
     // return ApiResponse<List<QuoteData>>.builder().static(Syscode.OK).data(quoteService.getData(symbol)).build() ; 

}

  @Override
  public ApiResponse<List<ProfileData>> getProfile(String symbol) {
    // TODO Auto-generated method stub
  //  throw new UnsupportedOperationException("Unimplemented method 'getProfile'");
    
    List<ProfileData> ApiResponseData = profileService.getProfileData(symbol) ;

    try {
      redisService.createProfileData(symbol,ApiResponseData.get(0));
    } catch (JsonProcessingException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return ApiResponse.<List<ProfileData>>builder().status(Syscode.OK).data(ApiResponseData).build();
      //return null ; 

}
  
}
