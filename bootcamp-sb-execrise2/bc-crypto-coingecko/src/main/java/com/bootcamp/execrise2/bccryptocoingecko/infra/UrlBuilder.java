package com.bootcamp.execrise2.bccryptocoingecko.infra;

import org.springframework.web.util.UriComponentsBuilder;

public class UrlBuilder {

  public static String getUrl(Scheme scheme , String domain , String uri){
    return UriComponentsBuilder.newInstance()
          .scheme(scheme.toLowerCase())
          .host(domain)  
          .path(uri)
          .toUriString();
        }
  
      }
