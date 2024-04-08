package com.bootcamp.execrise3.bcfinhub.bcstockfinhub.infra;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum Syscode {
  OK("000000", "OK."), //
  NOTFOUND("000001", "Resource Not Found."), //
  REST_CLIENT_EXCEPTION("900000", "Finnhub Service is unavailable."), //
  NULL_POINTER_EXCEPTION("900002", "NPE."), //
  GENERAL_EXCEPTION ("999999", "Unhandled Other Exceptions."), //
  
  ;

  private String code;
  private String message;

}
