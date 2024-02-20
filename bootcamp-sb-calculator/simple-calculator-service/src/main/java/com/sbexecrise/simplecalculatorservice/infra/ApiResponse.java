package com.sbexecrise.simplecalculatorservice.infra;

import lombok.Getter;

@Getter
public class ApiResponse<T> {
  private String x;
  private String y;
  private String operation;
  private String result ; 

  public ApiResponse(final String x, final String y, final String op , String result) {
    this.x = x;
    this.y = y;
    this.operation = op;
    this.result = result ; 
  }

  
  public static <T> ApiResponseBuilder<T> builder() {
    return new ApiResponseBuilder();
  }
  

  public static class ApiResponseBuilder<T> {
    private String x;
    private String y;
    private String operation;
    private String result ;

    ApiResponseBuilder() {

    }

    public ApiResponseBuilder<T> x(String x) {
      this.x = x;
      //this.message = syscode.getMessage();
      return this;
    }

    public ApiResponseBuilder<T> y(String y) {
      this.y = y;
      //this.message = syscode.getMessage();
      return this;
    }


    public ApiResponseBuilder<T> operation(String op) {
      this.operation = op ;
      //this.message = syscode.getMessage();
      return this;
    }



    public ApiResponseBuilder<T> result(String result) {
      this.result = result;
      //this.message = syscode.getMessage();
      return this;
    }

    public ApiResponse<T> build() {
      return new ApiResponse(this.x, this.y, this.operation,this.result);
    }

  }
}