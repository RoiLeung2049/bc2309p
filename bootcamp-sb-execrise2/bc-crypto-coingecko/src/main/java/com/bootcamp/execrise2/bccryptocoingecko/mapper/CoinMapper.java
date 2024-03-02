package com.bootcamp.execrise2.bccryptocoingecko.mapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import com.bootcamp.execrise2.bccryptocoingecko.dto.response.outputData;
import com.bootcamp.execrise2.bccryptocoingecko.dto.response.outputData;
import com.bootcamp.execrise2.bccryptocoingecko.dto.response.Data;
import com.bootcamp.execrise2.bccryptocoingecko.dto.response.RoiOutput;
import com.bootcamp.execrise2.bccryptocoingecko.model.PriceData;
import com.bootcamp.execrise2.bccryptocoingecko.model.Roi;

public class CoinMapper {
  // the mapping between PriceData to outputData 


  public static List<Data> map( List<PriceData> Datas){
    //public static outputData map( List<PriceData> Datas){

    List<Data> tmpData = outputData.builder()
                  .data( Datas.stream().map( p ->{




                      Optional<Roi> roiData = Optional.ofNullable(p.getRoi());
                    // Optional<Double> marketCapRank = Optional.ofNullable(p.getMarket_cap_rank());
                    
                      Data DatawithRoihandled;

                      if(roiData.isPresent()){ // if roi is not null then insert the data according to RoiPutput's data structure into field "roi"

                        
                        DatawithRoihandled = Data.builder().id(p.getId()).symbol(p.getSymbol()).name(p.getName())
                          .image(p.getImage()).currentPrice(p.getCurrent_price())
                          .marketCap(p.getMarket_cap()).marketCapRank(p.getMarket_cap_rank()) 
                          .fullyDilutedValuation(p.getFully_diluted_valuation()).totalVolume(p.getTotal_volume())
                          .high24h(p.getHigh_24h()).low_24h(p.getLow_24h())
                          .priceChange24h(p.getPrice_change_24h()).priceChangePercentage24h(p.getPrice_change_percentage_24h())
                          .marketCapChange24h(p.getMarket_cap_change_24h()).marketCapChangePercentage24h(p.getMarket_cap_change_percentage_24h())
                           .circulatingSupply(p.getCirculating_supply()).totalSupply(p.getTotal_supply())
                           .maxSupply(p.getMax_supply()).ath(p.getAth())
                           .athChangePercentage(p.getAth_change_percentage())
                           .athDate(p.getAth_date()).atl(p.getAtl())
                            .atlChangePercentage(p.getAtl_change_percentage()).atlDate(p.getAtl_date()) // above confirmed has no compile error
                           .roi(RoiOutput.builder().times(p.getRoi().getTimes()).currency(p.getRoi().getCurrency()).percentage(p.getRoi().getPercentage()).build())
                            .lastUpdated(p.getLast_updated())
                             
                      .build();

                      

                      }else {  // if roi is null return null to field "roi" 

                 
                        DatawithRoihandled = Data.builder().id(p.getId()).symbol(p.getSymbol()).name(p.getName())
                        .image(p.getImage()).currentPrice(p.getCurrent_price())
                        .marketCap(p.getMarket_cap()).marketCapRank(p.getMarket_cap_rank()) 
                        .fullyDilutedValuation(p.getFully_diluted_valuation()).totalVolume(p.getTotal_volume())
                        .high24h(p.getHigh_24h()).low_24h(p.getLow_24h())
                        .priceChange24h(p.getPrice_change_24h()).priceChangePercentage24h(p.getPrice_change_percentage_24h())
                        .marketCapChange24h(p.getMarket_cap_change_24h()).marketCapChangePercentage24h(p.getMarket_cap_change_percentage_24h())
                         .circulatingSupply(p.getCirculating_supply()).totalSupply(p.getTotal_supply())
                         .maxSupply(p.getMax_supply()).ath(p.getAth())
                         .athChangePercentage(p.getAth_change_percentage())
                         .athDate(p.getAth_date()).atl(p.getAtl())
                          .atlChangePercentage(p.getAtl_change_percentage()).atlDate(p.getAtl_date()) // above confirmed has no compile error
                        // .roi(RoiOutput.builder().times(p.getRoi().getTimes()).currency(p.getRoi().getCurrency()).percentage(p.getRoi().getPercentage()).build())
                          .lastUpdated(p.getLast_updated())
                           
                    .build();

                      }

                        return DatawithRoihandled;

                 //     return Data.builder().id(p.getId()).symbol(p.getSymbol()).name(p.getName())
                 //               .image(p.getImage()).currentPrice(p.getCurrent_price())
                  //              .marketCap(p.getMarket_cap()).marketCapRank(p.getMarket_cap_rank()) 
                 //               .fullyDilutedValuation(p.getFully_diluted_valuation()).totalVolume(p.getTotal_volume())
                  //              .high24h(p.getHigh_24h()).low_24h(p.getLow_24h())
                 //               .priceChange24h(p.getPrice_change_24h()).priceChangePercentage24h(p.getPrice_change_percentage_24h())
                  //              .marketCapChange24h(p.getMarket_cap_change_24h()).marketCapChangePercentage24h(p.getMarket_cap_change_percentage_24h())
                 //                .circulatingSupply(p.getCirculating_supply()).totalSupply(p.getTotal_supply())
                  //               .maxSupply(p.getMax_supply()).ath(p.getAth())
                  //               .athChangePercentage(p.getAth_change_percentage())
                  //               .athDate(p.getAth_date()).atl(p.getAtl())
                  //                .atlChangePercentage(p.getAtl_change_percentage()).atlDate(p.getAtl_date()) // above confirmed has no compile error
                             //    .roi(RoiOutput.builder().times(p.getRoi().getTimes()).currency(p.getRoi().getCurrency()).percentage(p.getRoi().getPercentage()).build())
                  //                .lastUpdated(p.getLast_updated())
                                   
                  //          .build();

                  //}).collect(Collectors.toList())).build() ;
                }).collect(Collectors.toList())).build().getData() ;

                  
                  
                


                  return tmpData ; 

    


   

    
  }

}
