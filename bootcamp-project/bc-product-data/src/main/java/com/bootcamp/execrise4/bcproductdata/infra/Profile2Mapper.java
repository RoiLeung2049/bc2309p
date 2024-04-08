package com.bootcamp.execrise4.bcproductdata.infra;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import com.bootcamp.execrise4.bcproductdata.dto.CoinData;
import com.bootcamp.execrise4.bcproductdata.dto.ProfileData;
import com.bootcamp.execrise4.bcproductdata.entity.coinPriceEntity;
import com.bootcamp.execrise4.bcproductdata.entity.profileDataEntity;

public class Profile2Mapper {
  


  public static profileDataEntity map ( ProfileData pd){

    java.util.Date date = new java.util.Date() ;
    profileDataEntity  outputEntity = profileDataEntity.builder()
       // .id(Integer.valueOf(cd.getId()))
        .quote_date(new Timestamp(date.getTime()))
        .quote_stock_code(pd.getTicker())
        .name(pd.getName())
        .country(pd.getCountry())
        .currency(pd.getCurrency())
        .marketCapitalization(pd.getMarketCapitalization())
        .phone(pd.getPhone())
        .logo(pd.getLogo())
        .estimateCurrency(pd.getEstimateCurrency())
        .exchange(pd.getExchange())
        .ipo(pd.getIpo())
        .shareOutstanding(pd.getShareOutstanding())
        .weburl(pd.getWeburl())
        .finnhubIndustry(pd.getFinnhubIndustry())
        .build();
        


    return outputEntity ; 
  }
}
