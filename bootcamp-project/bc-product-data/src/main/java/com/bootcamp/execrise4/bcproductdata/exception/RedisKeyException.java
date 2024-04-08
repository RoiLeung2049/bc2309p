package com.bootcamp.execrise4.bcproductdata.exception;

import com.bootcamp.execrise4.bcproductdata.infra.ApiResponse;
import com.bootcamp.execrise4.bcproductdata.infra.Syscode;

public class RedisKeyException extends IllegalArgumentException {
  

  public ApiResponse<Void> restclientExceptionHandler() {
    return ApiResponse.<Void>builder() //
        .status(Syscode.REST_CLIENT_EXCEPTION) //
        .data(null) //
        .build();
}

}