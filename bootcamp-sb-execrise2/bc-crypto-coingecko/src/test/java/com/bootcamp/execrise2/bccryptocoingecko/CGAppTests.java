package com.bootcamp.execrise2.bccryptocoingecko;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import com.bootcamp.execrise2.bccryptocoingecko.model.PriceData;
import com.bootcamp.execrise2.bccryptocoingecko.service.OutputDataService;
import com.bootcamp.execrise2.bccryptocoingecko.service.RedisService;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

@WebMvcTest(BcCryptoCoingeckoApplication.class)
public class CGAppTests {

  @MockBean
  private OutputDataService ODS ; 


  @MockBean
  private RedisService RS ; 

  @Autowired 
  private MockMvc mockMvc ; 


  public static List<PriceData> bitcoinData =  new ArrayList<PriceData>(); 
  
 
 
@Test
  void testGetOutpuData() throws Exception{
    
    bitcoinData.add( PriceData.builder().id("bitcoin").symbol("btc").name("Bitcoin").build()    ) ;
    Mockito.when(ODS.getOutputData("usd", "bitcon")).thenReturn(bitcoinData) ;
    
    mockMvc.perform(get("/crypto/coingecko/api/v1/coins?currency={usd}&ids={bitcoin}","usd","bitcoin"))
           
            .andExpect(jsonPath("$.data[0].id").value("bitcoin"))
            .andExpect(jsonPath("$.symbol").value("btc"))
            .andExpect(jsonPath("$.name").value("Bitcoin"))
            .andDo(print());
  }
  
}
