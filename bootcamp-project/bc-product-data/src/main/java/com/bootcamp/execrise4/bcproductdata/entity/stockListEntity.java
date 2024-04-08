package com.bootcamp.execrise4.bcproductdata.entity;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.CascadeType;
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

@Entity
@Table(name = "tproduct_stocks")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter 
@Builder
public class stockListEntity implements Serializable{

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id ;
  
  private String name ;
  private double curr_price ; 
  private double price_chg_pct ; 
  private double market_cap ; 
  private String logo; 
  
  @OneToOne(cascade = CascadeType.MERGE)
  @JoinColumn(name = "stock_id" , referencedColumnName = "id")
  private StocksEntity SE ; 
  


}
