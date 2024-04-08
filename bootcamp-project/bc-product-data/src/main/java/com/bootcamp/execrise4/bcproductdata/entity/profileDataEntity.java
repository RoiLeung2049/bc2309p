package com.bootcamp.execrise4.bcproductdata.entity;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "texternal_stock_finnhub_profile2")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class profileDataEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id ; 
  private Timestamp quote_date ; 
  private String quote_stock_code ; 
  private String country ; 
  private String currency ; 
  private String estimateCurrency ; 
  private String exchange ; 
  private String finnhubIndustry ; 
  private String ipo ; 
  private String logo ; 
  private double marketCapitalization ; 
  private String name ; 
  private String phone ; 
  private double shareOutstanding ; 
  private String ticker ; 
  private String weburl ; 
  
}
