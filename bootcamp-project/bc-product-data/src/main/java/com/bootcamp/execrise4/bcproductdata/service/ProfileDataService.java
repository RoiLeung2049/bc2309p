package com.bootcamp.execrise4.bcproductdata.service;

import java.util.List;
import com.bootcamp.execrise4.bcproductdata.dto.ProfileData;
import com.bootcamp.execrise4.bcproductdata.dto.StockData;
import com.bootcamp.execrise4.bcproductdata.entity.profileDataEntity;
import com.bootcamp.execrise4.bcproductdata.entity.stockPriceEntity;

public interface ProfileDataService {
    List<ProfileData> getData(String stocck_list) ; 

    profileDataEntity  save(ProfileData profileData); 
}
