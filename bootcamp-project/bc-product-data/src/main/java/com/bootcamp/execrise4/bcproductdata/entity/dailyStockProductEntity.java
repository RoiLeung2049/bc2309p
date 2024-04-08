package com.bootcamp.execrise4.bcproductdata.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tproduct_stocks_daily")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter 
@Builder
@ToString
public class dailyStockProductEntity implements Serializable{

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  
  private Long id ;
   
   
  private Timestamp trade_date ;
  private double day_high ; 
  private double day_low ; 
  private double day_open ; 
  private double day_close ; 



  @ManyToOne
  @JoinColumn(name ="stock_id",nullable = false )
  @JsonBackReference  
  private StocksEntity SE ; 
  
  
}
