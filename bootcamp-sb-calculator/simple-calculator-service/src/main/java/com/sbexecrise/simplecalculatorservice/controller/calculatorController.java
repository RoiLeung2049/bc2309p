package com.sbexecrise.simplecalculatorservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import com.sbexecrise.simplecalculatorservice.dto.inputDTO;
import com.sbexecrise.simplecalculatorservice.dto.operation;
import com.sbexecrise.simplecalculatorservice.infra.ApiResponse;

public interface calculatorController {
// get the user request 
 //URI : /?x=xxx&y=yyy&operation=ooo
  @GetMapping(value = "/")
  ApiResponse<inputDTO> getResult(@RequestParam(value="x") String x , @RequestParam(value="y")  String y , @RequestParam(value="operation") String op) ;

  
  @PostMapping(value = "/")
  ApiResponse<inputDTO> postResult(@RequestBody inputDTO input) ;

  @GetMapping(value = "/{x}/{y}/{operation}")
  ApiResponse<inputDTO> getResult2(@PathVariable(name="x") String x , @PathVariable(name="y")  String y , @PathVariable(name="operation") String op) ;

  
}
