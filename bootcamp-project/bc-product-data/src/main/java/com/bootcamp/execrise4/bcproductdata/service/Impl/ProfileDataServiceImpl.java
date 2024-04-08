package com.bootcamp.execrise4.bcproductdata.service.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.bootcamp.execrise4.bcproductdata.dto.ProfileData;
import com.bootcamp.execrise4.bcproductdata.dto.StockData;
import com.bootcamp.execrise4.bcproductdata.entity.profileDataEntity;
import com.bootcamp.execrise4.bcproductdata.entity.stockPriceEntity;
import com.bootcamp.execrise4.bcproductdata.infra.ApiResponse;
import com.bootcamp.execrise4.bcproductdata.infra.Profile2Mapper;
import com.bootcamp.execrise4.bcproductdata.infra.StockMapper;
import com.bootcamp.execrise4.bcproductdata.repository.ProfileDataRepository;
import com.bootcamp.execrise4.bcproductdata.service.ProfileDataService;


@Service
public class ProfileDataServiceImpl implements ProfileDataService {


  @Autowired
  ProfileDataRepository PDR ; 
        
  @Autowired
  private RestTemplate restTemplate;
  
  //@Value("localhost:8090/crypto/coingecko/api/v1/coins?currency=usd&ids=")
  private String targetUrl ;
  
  @Override
  public List<ProfileData> getData(String stock_list) {
    
    
    this.targetUrl = "http://localhost:8091/stock/finnhub/api/v1/profile2?symbol=" ;
    String parameterString  = stock_list ;
    String targetString = targetUrl.concat(parameterString);

    ApiResponse<List<ProfileData>> data = restTemplate.getForObject(targetString, ApiResponse.class) ; 
    return  data.getData() ; 
  }

  @Override
  public profileDataEntity save(ProfileData profileData) {
    
    
   profileDataEntity PDEntity = Profile2Mapper.map(profileData) ; 
   
    return PDR.save(PDEntity) ; 
  }
  
}
