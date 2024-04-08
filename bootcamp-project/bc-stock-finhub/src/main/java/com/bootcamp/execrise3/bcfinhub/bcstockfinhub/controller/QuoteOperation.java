package com.bootcamp.execrise3.bcfinhub.bcstockfinhub.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.bootcamp.execrise3.bcfinhub.bcstockfinhub.dto.response.ProfileData;
import com.bootcamp.execrise3.bcfinhub.bcstockfinhub.dto.response.QuoteData;
import com.bootcamp.execrise3.bcfinhub.bcstockfinhub.infra.ApiResponse;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface QuoteOperation {
   
  @GetMapping(value = "/quote")
  public  ApiResponse<List<QuoteData>> getQuote(@RequestParam (value = "symbol") String symbol) throws JsonProcessingException ;


  
  @GetMapping(value = "/profile2")
  public  ApiResponse<List<ProfileData>> getProfile(@RequestParam (value = "symbol") String symbol) ;
}
