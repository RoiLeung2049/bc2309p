package com.bootcamp.execrise4.bcproductdata.infra;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import com.bootcamp.execrise4.bcproductdata.dto.CoinData;
import com.bootcamp.execrise4.bcproductdata.dto.StockData;
import com.bootcamp.execrise4.bcproductdata.entity.coinPriceEntity;
import com.bootcamp.execrise4.bcproductdata.entity.stockPriceEntity;

public class StockMapper {
  public static stockPriceEntity map ( StockData sd){
  
    java.util.Date date = new java.util.Date() ;
    stockPriceEntity  outputEntity = stockPriceEntity.builder()
      
        .quote_date(new Timestamp(date.getTime()))
        .quote_stock_code(sd.getCode())
        .curr_price(sd.getC())
        .price_chg(sd.getD())
        .price_chg_pct(sd.getDp())
        .price_day_high(sd.getH())
        .price_day_low(sd.getL())
        .price_prev_open(sd.getO())
        .price_prev_close(sd.getPc())
        .build();
        


    return outputEntity ; 
  }
}
