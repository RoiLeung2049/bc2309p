package com.bootcamp.execrise3.bcfinhub.bcstockfinhub.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpClientErrorException;
import com.bootcamp.execrise3.bcfinhub.bcstockfinhub.infra.ApiResponse;
import com.bootcamp.execrise3.bcfinhub.bcstockfinhub.infra.Syscode;

public class GlobalExceptionHandler {
 
    @ExceptionHandler(Exception.class )
  @ResponseStatus(value = HttpStatus.RESET_CONTENT)  // http status code
  public ApiResponse<Void> httpClientExceptionHandler() {
    return ApiResponse.<Void>builder() //
        .status(Syscode.REST_CLIENT_EXCEPTION)//
        .data(null) //
        .build();
  }
}
