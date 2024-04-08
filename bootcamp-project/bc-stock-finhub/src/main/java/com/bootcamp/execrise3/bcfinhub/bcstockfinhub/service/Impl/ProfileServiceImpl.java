package com.bootcamp.execrise3.bcfinhub.bcstockfinhub.service.Impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.bootcamp.execrise3.bcfinhub.bcstockfinhub.dto.response.ProfileData;
import com.bootcamp.execrise3.bcfinhub.bcstockfinhub.service.ProfileService;


@Service
public class ProfileServiceImpl  implements ProfileService {



  @Value("https://www.finnhub.io/api/v1/stock/profile2?token=")
  private String domainName2 ;
  //@Value("{$api.finnhub.api_key}")

  @Value("cnheimpr01qhlslitj8gcnheimpr01qhlslitj90")
  private String key;

  @Autowired
  private RestTemplate restTemplate ; 

    @Override
  public List<ProfileData> getProfileData(String symbol) {
    // TODO Auto-generated method stub
    //throw new UnsupportedOperationException("Unimplemented method 'getProfileData'");

    String inputKey = "" ; 
    inputKey = domainName2.concat(key).concat("&symbol=").concat(symbol);

    System.out.println("the corp input link is " +inputKey) ;
    ProfileData data = restTemplate.getForObject(inputKey,ProfileData.class);

    List<ProfileData> output = new ArrayList<>();
    output.add(data) ;
   // return Arrays.stream(data).collect(Collectors.toList());
    return output ; 


  }
  
  
}
