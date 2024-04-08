package com.bootcamp.execrise3.bcfinhub.bcstockfinhub.service;

import java.util.List;
import com.bootcamp.execrise3.bcfinhub.bcstockfinhub.dto.response.ProfileData;

public interface ProfileService {
  

  List<ProfileData> getProfileData(String symbol) ; 
}
