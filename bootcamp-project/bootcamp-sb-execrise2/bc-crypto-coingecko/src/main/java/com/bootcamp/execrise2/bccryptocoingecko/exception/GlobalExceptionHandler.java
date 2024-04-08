package com.bootcamp.execrise2.bccryptocoingecko.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import com.bootcamp.execrise2.bccryptocoingecko.infra.ApiResponse;
import com.bootcamp.execrise2.bccryptocoingecko.infra.Syscode;




//@RestControllerAdvice
public class GlobalExceptionHandler {


  @ExceptionHandler(HttpClientErrorException.class )
  @ResponseStatus(value = HttpStatus.RESET_CONTENT)  // http status code
  public ApiResponse<Void> httpClientExceptionHandler() {
    return ApiResponse.<Void>builder() //
        .status(Syscode.REST_CLIENT_EXCEPTION)//
        .data(null) //
        .build();
  }
  
}
