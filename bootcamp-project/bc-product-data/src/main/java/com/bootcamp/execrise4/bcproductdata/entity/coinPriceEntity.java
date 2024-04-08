package com.bootcamp.execrise4.bcproductdata.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "texternal_crypto_coingecko_market")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter 
@Builder
@ToString
public class coinPriceEntity implements Serializable{

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id ;
  private Timestamp quote_date ; 
  private String quote_coin_code ; 
  private String quote_curency ;
  private String name;
  private String image;
  private double currprice;
  private double market_cap;
  private double market_cap_rank;
  private double fully_diluted_valuation;
  private double total_volume;
  private double high_24h;
  private double low_24h ; 
  private double price_change_24h ; 
  private double price_change_pct_24h ; 
  private double market_cap_change_pct_24h ; 
  private double circulating_supply ; 
  private double total_supply; 
  private double max_supply; 
  private double ath ; 
  private double ath_change_percentage;
  private Timestamp ath_date ; 
  private double atl ; 
  private double atl_change_percentage ; 
  private Timestamp atl_date ; 

  

}
