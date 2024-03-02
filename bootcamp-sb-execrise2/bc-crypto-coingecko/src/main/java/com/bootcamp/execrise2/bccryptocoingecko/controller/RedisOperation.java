package com.bootcamp.execrise2.bccryptocoingecko.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import com.bootcamp.execrise2.bccryptocoingecko.dto.response.Data;
import com.bootcamp.execrise2.bccryptocoingecko.dto.response.outputData;
import com.bootcamp.execrise2.bccryptocoingecko.infra.ApiResponse;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface RedisOperation {

  @GetMapping(value="/coins2")
  public ApiResponse<List<Data>> getProductPriceDataWithRedis(@RequestParam(value = "currency",required = true) String Currency , 
  @RequestParam(value = "ids",required = false ) String ids); 
}
