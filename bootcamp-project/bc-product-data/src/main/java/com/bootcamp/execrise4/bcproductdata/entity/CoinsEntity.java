package com.bootcamp.execrise4.bcproductdata.entity;

import java.io.Serializable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tproduct_coins")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter 
@Builder
public class CoinsEntity implements Serializable {


  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id ; 

  
  
  private String name;
  private double curr_price;
  private double price_change_pct ; 
  private double market_cap;
  private String logo ; 


  @OneToOne
  @JoinColumn(name = "coin_id", referencedColumnName = "id") // the FK using the private keyin coinsListEntity
  private coinListEntity coinList;
}
