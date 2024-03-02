package com.bootcamp.execrise2.bccryptocoingecko.model;

import java.io.Serializable;
import java.util.Optional;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
public class PriceData  implements Serializable{


  private String id ;
  private String symbol;
  private String name ;
  private String image ;
  private double current_price ;
  private double market_cap ;
  private Integer market_cap_rank ;
  private double fully_diluted_valuation ;
  private double total_volume ;
  private double high_24h ;
  private double low_24h ;
  private double price_change_24h ;
  private double price_change_percentage_24h ;
  private double market_cap_change_24h ;
  private double market_cap_change_percentage_24h ;
  private double circulating_supply ;
  private double total_supply ;
  private double max_supply ;
  private double ath ;
  private double ath_change_percentage ;
  private String ath_date ;
  private double atl ;
  private double atl_change_percentage ;
  private String atl_date;
  private Roi  roi ;
  private String last_updated ;



  
}
