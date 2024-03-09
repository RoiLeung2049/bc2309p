package com.bootcamp.execrise3.bcfinhub.bcstockfinhub.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.bootcamp.execrise3.bcfinhub.bcstockfinhub.dto.response.ProfileData;
import com.bootcamp.execrise3.bcfinhub.bcstockfinhub.dto.response.QuoteData;
import com.bootcamp.execrise3.bcfinhub.bcstockfinhub.infra.ApiResponse;



public interface QuoteService {


    List<QuoteData> getData(String symbol) ;

    
  
}
