package com.sbexecrise.simplecalculatorservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.sbexecrise.simplecalculatorservice.dto.inputDTO;
import com.sbexecrise.simplecalculatorservice.infra.ErrorApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
  @ExceptionHandler(NumberFormatException.class)
  @ResponseStatus(value = HttpStatus.BAD_REQUEST)  // http status code
  public ErrorApiResponse<inputDTO> numberFormatExceptionHandler() {
  //  return ApiResponse.<inputDTO>builder().x("1").y("1").operation("1").result("1").build(); //
    return ErrorApiResponse.<inputDTO>builder().Code(9).Message("Invalid Input.").build();
        
  }

  //java.lang.IllegalArgumentException
  @ExceptionHandler(IllegalArgumentException.class)
  @ResponseStatus(value = HttpStatus.BAD_REQUEST)  // http status code
  public ErrorApiResponse<inputDTO> illegalArguementExceptionHandler() {
  //  return ApiResponse.<inputDTO>builder().x("1").y("1").operation("1").result("1").build(); //
    return ErrorApiResponse.<inputDTO>builder().Code(9).Message("Invalid Input.").build();
        
  }
}
