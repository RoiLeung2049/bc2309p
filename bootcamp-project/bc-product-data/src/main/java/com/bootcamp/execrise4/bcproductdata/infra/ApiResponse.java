package com.bootcamp.execrise4.bcproductdata.infra;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiResponse<T> {

  private String code;
  private String message;
  private T data;

  public ApiResponse(final String code, final String message, final T data) {
    this.code = code;
    this.message = message;
    this.data = data;
  }

  public static <T> ApiResponseBuilder<T> builder() {
    return new ApiResponseBuilder();
  }

  public static class ApiResponseBuilder<T> {
    private String code;
    private String message;
    private T data;

    ApiResponseBuilder() {

    }

    public ApiResponseBuilder<T> ok() {
      this.code = Syscode.OK.getCode();
      this.message =  Syscode.OK.getMessage();
      return this;
    }

    public ApiResponseBuilder<T> status(Syscode syscode) {
      this.code = syscode.getCode();
      this.message = syscode.getMessage();
      return this;
    }

 

    public ApiResponseBuilder<T> data(final T data) {
      this.data = data;
      return this;
    }

    public ApiResponse<T> build() {
      return new ApiResponse(this.code, this.message, this.data);
    }
    
  }

}