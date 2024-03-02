package com.bootcamp.execrise2.bccryptocoingecko.controller;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.bootcamp.execrise2.bccryptocoingecko.dto.response.outputData;
import com.bootcamp.execrise2.bccryptocoingecko.infra.ApiResponse;

public interface PriceOperation {
  
  @GetMapping(value="/coins")
  public  ApiResponse getProductPriceData(@RequestParam(value = "currency",required = true) String Currency , 
  @RequestParam(value = "ids",required = false ) String ids); 
  





}
