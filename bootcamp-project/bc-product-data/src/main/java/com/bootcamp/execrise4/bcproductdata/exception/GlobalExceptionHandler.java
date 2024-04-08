package com.bootcamp.execrise4.bcproductdata.exception;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.RestClientException;
import org.springframework.web.servlet.resource.NoResourceFoundException;
import com.bootcamp.execrise4.bcproductdata.infra.ApiResponse;
import com.bootcamp.execrise4.bcproductdata.infra.Syscode;

@RestControllerAdvice
public class GlobalExceptionHandler  {

  @ExceptionHandler(NoResourceFoundException.class)
  @ResponseStatus(value = HttpStatus.SERVICE_UNAVAILABLE)  // http status code
  public ApiResponse<Void> restclientExceptionHandler() {
    return ApiResponse.<Void>builder() //
        .status(Syscode.REST_CLIENT_EXCEPTION) //
        .data(null) //
        .build();
  }
}
