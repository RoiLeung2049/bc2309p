package com.bootcamp.execrise4.bcproductdata.infra;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import com.bootcamp.execrise4.bcproductdata.dto.CoinData;
import com.bootcamp.execrise4.bcproductdata.dto.CoinPriceData;
import com.bootcamp.execrise4.bcproductdata.entity.coinPriceEntity;

public class CoinMapper {
  
public static coinPriceEntity map ( CoinData cd) throws ParseException{
 

  java.util.Date date = new java.util.Date() ;
    coinPriceEntity  outputEntity = coinPriceEntity.builder()
       // .id(Integer.valueOf(cd.getId()))
        .quote_date(new Timestamp(date.getTime()))
        .quote_coin_code(cd.getSymbol())
        .name(cd.getName())
        .quote_curency("USD")
        .image(cd.getImage())
        .currprice(cd.getCurrentPrice())
        .market_cap(cd.getMarketCap())
        .market_cap_rank(cd.getMarketCapRank())
        .fully_diluted_valuation(cd.getFullyDilutedValuation())
        .total_volume(cd.getTotalVolume())
        .high_24h(cd.getHigh24h())
        .low_24h(cd.getLow_24h())
        .price_change_24h(cd.getPriceChange24h())
        .price_change_pct_24h(cd.getPriceChangePercentage24h())
        .market_cap_change_pct_24h(cd.getMarketCapChangePercentage24h())
        .circulating_supply(cd.getCirculatingSupply())
        .total_supply(cd.getTotalSupply())
        .max_supply(cd.getMaxSupply())
        .ath(cd.getAth())
        .ath_change_percentage(cd.getAthChangePercentage())
        .ath_date(new Timestamp((new SimpleDateFormat( "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")).parse(cd.getAthDate()).getTime()))
        .atl(cd.getAtl())
        .atl_change_percentage(cd.getAthChangePercentage())
        .atl_date(new Timestamp((new SimpleDateFormat( "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")).parse(cd.getAthDate()).getTime()))
        .build();
        


    return outputEntity ; 
  }
}
