package com.bootcamp.execrise2.bccryptocoingecko.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Optional;
import com.bootcamp.execrise2.bccryptocoingecko.dto.response.RoiOutput; 

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Data {
 
  private String id ; 
  private String symbol ;
  private String name ; 
  private String image ; 
  private double currentPrice ; 
  private double marketCap ;
  private double marketCapRank ; 
  private double fullyDilutedValuation ;   
  private double totalVolume ;
  private double high24h ;
  private double low_24h;
  private  double priceChange24h ;
  private double priceChangePercentage24h;
  private double marketCapChange24h ;
  private double marketCapChangePercentage24h ;
  private double circulatingSupply ;
  private double totalSupply ;
  private double maxSupply ;
  private double ath ;
  private double athChangePercentage;
  private String athDate ;
  private double atl ;
  private double atlChangePercentage ;
  private String atlDate ;
  private RoiOutput roi ; 
  private String lastUpdated ; 
}
