package com.sbexecrise.simplecalculatorservice;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sbexecrise.simplecalculatorservice.controller.calculatorController;
import com.sbexecrise.simplecalculatorservice.dto.inputDTO;
import com.sbexecrise.simplecalculatorservice.service.CalculationService;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.ResultActions.* ;
import org.springframework.http.MediaType;

@WebMvcTest(calculatorController.class)
public class CalculatorControllerTest {
  
  @MockBean
  private CalculationService CS ; 
  
  @Autowired
  private MockMvc mockMvc ; 


  @Test
  void testGetter() throws Exception {
   // inputDTO input ; // = new inputDTO("1","2","add") ; 
 

    Mockito.when(CS.compute("1", "2", "add")).thenReturn("3");

    mockMvc.perform(get("/?x={x}&y={y}&operation={operation}", "1","2","add"))
        .andExpect(content().contentType(MediaType.APPLICATION_JSON)) // assert
        .andExpect(jsonPath("$.x").value("1")) //
        .andExpect(jsonPath("$.y").value("2")) //
        .andExpect(jsonPath("$.operation").value("add"))
        .andExpect(jsonPath("$.result").value("3"))
        .andDo(print());
        //.andDo(print());
  }


  @Test
  void testGetter2() throws Exception {
   // inputDTO input ; // = new inputDTO("1","2","add") ; 
 

    Mockito.when(CS.compute("1", "2", "div")).thenReturn("0.5");

    mockMvc.perform(get("/{x}/{y}/{operation}", "1","2","div"))
        .andExpect(content().contentType(MediaType.APPLICATION_JSON)) // assert
        .andExpect(jsonPath("$.x").value("1")) //
        .andExpect(jsonPath("$.y").value("2")) //
        .andExpect(jsonPath("$.operation").value("div"))
        .andExpect(jsonPath("$.result").value("0.5"))
        .andDo(print());
        //.andDo(print());
  }

  @Test
  void testPostter() throws Exception {
    inputDTO input  = new inputDTO() ; 
    //inputDTO input = new inputDTO(null, null, null)
    input.setX("1");
    input.setY("2");
    input.setOperation("sub");
    
    String contentStr = new ObjectMapper().writeValueAsString(input) ; 

   // System.out.println(contentStr) ;
    Mockito.when(CS.create(input)).thenReturn("-1");


    MockHttpServletRequestBuilder mt = MockMvcRequestBuilders.post("/").contentType(MediaType.APPLICATION_JSON).content(contentStr) ;

    mockMvc.perform(mt) // assert
    .andExpect(jsonPath("$.x").value("1")) //
    .andExpect(jsonPath("$.y").value("2")) //
    .andExpect(jsonPath("$.operation").value("sub"))
    .andExpect(jsonPath("$.result").value("-1"))
    .andDo(print());

    
   // mockMvc.perform(post("/")
   //               .contentType(MediaType.APPLICATION_JSON)
   //               .content(contentStr))
   //               .andExpect(content().contentType(MediaType.APPLICATION_JSON)) // assert
   //               .andExpect(jsonPath("$.x").value("1")) //
   //               .andExpect(jsonPath("$.y").value("2")) //
   //               .andExpect(jsonPath("$.operation").value("sub"))
   //               .andExpect(jsonPath("$.result").value("-1"))
   //               .andDo(print());
  }


 

}
