package com.bootcamp.execrise3.bcfinhub.bcstockfinhub.service.Impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.print.DocFlavor.STRING;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.bootcamp.execrise3.bcfinhub.bcstockfinhub.dto.response.ProfileData;
import com.bootcamp.execrise3.bcfinhub.bcstockfinhub.dto.response.QuoteData;
import com.bootcamp.execrise3.bcfinhub.bcstockfinhub.service.QuoteService;

@Service
public class QuoteServiceImpl implements QuoteService{

  //target directory
  //https://www.finnhub.io/api/v1/quote?symbol=AAPL&token=cnheimpr01qhlslitj8gcnheimpr01qhlslitj90
  @Value("https://www.finnhub.io/api/v1/quote?token=")
  private String domainName ;


 // @Value("https://www.finnhub.io/api/v1/stock/profile2?token=")
 // private String domainName2 ;
  //@Value("{$api.finnhub.api_key}")
  @Value("cnheimpr01qhlslitj8gcnheimpr01qhlslitj90")
  private String key;

  @Autowired
  private RestTemplate restTemplate ; 

  @Override
  public List<QuoteData> getData(String symbol) {
    // TODO Auto-generated method stub

    String inputKey  = "" ; 
 //   throw new UnsupportedOperationException("Unimplemented method 'getData'");
    inputKey = domainName.concat(key).concat("&symbol=").concat(symbol);
  //  System.out.println("the link is : " , inputKey) ; 
    
      System.out.println("the input link is " +inputKey) ;
      QuoteData data = restTemplate.getForObject(inputKey,QuoteData.class);

      List<QuoteData> output = new ArrayList<>();
      output.add(data) ;
     // return Arrays.stream(data).collect(Collectors.toList());
      return output ; 
     //return Array.stream(data).collect(Collectors.toList()) ; 
     
  //  return null ; 
}

  
}
