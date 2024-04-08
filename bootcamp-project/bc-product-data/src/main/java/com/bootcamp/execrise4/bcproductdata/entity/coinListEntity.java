package com.bootcamp.execrise4.bcproductdata.entity;

import java.io.Serializable;
import jakarta.annotation.Generated;
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
import lombok.ToString;

@Entity
@Table(name = "tproduct_coin_list")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter 
@Builder
@ToString
public class coinListEntity implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id ; 
  private String coin_code ; 

  @OneToOne(mappedBy ="coinList")
  private CoinsEntity coins ; 
  
}
