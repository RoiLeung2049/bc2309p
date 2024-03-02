package com.bootcamp.execrise2.bccryptocoingecko.dto.response;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.bootcamp.execrise2.bccryptocoingecko.dto.response.Data;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class outputData {// the data format to be used for web  request


//    private String code ; 
//    private String message; 
    private List<Data> data ; 

   




  
}
