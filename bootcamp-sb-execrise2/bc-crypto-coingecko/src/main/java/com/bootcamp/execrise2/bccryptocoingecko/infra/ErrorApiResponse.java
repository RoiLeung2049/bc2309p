package com.bootcamp.execrise2.bccryptocoingecko.infra;

import lombok.Getter;


@Getter
public class ErrorApiResponse<T>{

  private double  Code  ; 
  private String Message ; 
  

  public ErrorApiResponse(final double Code, final String Message) {
    this.Code = Code;
    this.Message = Message;
    
  }

  public static <T> ErrorApiResponseBuilder<T> builder() {
    return new ErrorApiResponseBuilder();
  }
  

  public static class ErrorApiResponseBuilder<T> {
    private double Code;
    private String Message;
    
    ErrorApiResponseBuilder() {

    }

    public ErrorApiResponseBuilder<T> Code(double Code) {
      this.Code = Code;
     
      return this;
    }

    public ErrorApiResponseBuilder<T> Message(String Message) {
      this.Message = Message;
      return this;
    }




    public ErrorApiResponse<T> build() {
      return new ErrorApiResponse(this.Code, this.Message);
    }

  }
}
