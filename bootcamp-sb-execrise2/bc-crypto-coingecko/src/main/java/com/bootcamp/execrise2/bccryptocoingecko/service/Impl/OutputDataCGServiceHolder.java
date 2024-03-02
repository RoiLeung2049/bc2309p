package com.bootcamp.execrise2.bccryptocoingecko.service.Impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import com.bootcamp.execrise2.bccryptocoingecko.dto.response.outputData;
import com.bootcamp.execrise2.bccryptocoingecko.infra.Scheme;
import com.bootcamp.execrise2.bccryptocoingecko.infra.UrlBuilder;
import com.bootcamp.execrise2.bccryptocoingecko.model.PriceData;
import com.bootcamp.execrise2.bccryptocoingecko.service.OutputDataService;
import com.bootcamp.execrise2.bccryptocoingecko.model.PriceData;


@Service  // need a bean for this service 
public class OutputDataCGServiceHolder  implements OutputDataService{

//  @Value("${api.coingecko.domain}")
//  private String domain ; 

 // @Value("${api.coingecko.endpoints}")
 // private String uri;


 // @Value("https://api.coingecko.com/api/v3/coins/markets?x_cg_demo_api_key=CG-PBxD9FeV3smxWJKNC96JTDtU" )
  @Value("https://api.coingecko.com/api/v3/coins/markets?x_cg_demo_api_key=" )
  private String inputKey ; // this one works


  
  @Value("{$api.coingecko.api_key}")
  private String key ;

  @Autowired
  private RestTemplate restTemplate ; 

  @Override
  public List<PriceData> getOutputData(String currency , String ids) throws RestClientException{
      // 1 use RestTemplate to call https://api.coingecko.com/api/v3/coins/markets
      // 2 deserial JSON data received 




     // String url =  UrlBuilder.getUrl(Scheme.HTTPS, domain, uri) ; 
      //url = url.concat("&vs_currency=").concat(currency).concat("&ids=").concat(ids);
     // url = url.concat(key);
     // url =url.concat("&vs_currency=").concat(currency).concat("&ids=").concat(ids);


      
      inputKey.concat(key);
     // System.out.print("the url is : " + url) ; 
      inputKey = inputKey.concat("&vs_currency=").concat(currency).concat("&ids=").concat(ids);
      PriceData[] data = restTemplate.getForObject(inputKey,PriceData[].class);

      return Arrays.stream(data).collect(Collectors.toList());
      //https://api.coingecko.com/api/v3/coins/markets?x_cg_demo_api_key=
      
    
  }
  
}
