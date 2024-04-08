package com.bootcamp.execrise4.bcproductdata.entity;

import java.io.Serializable;
import java.util.List;
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
@Table(name = "tproduct_stocks_list") // -> tproduct_stock_list
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter 
@Builder
@ToString
public class StocksEntity  implements Serializable{
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  
  
  //@JoinColumn(name="id", nullable=false)
  private Long id ; 

  private String stock_id ; 

  @OneToMany(mappedBy ="SE")
  @JsonManagedReference
  private List<dailyStockProductEntity> dailyStockProduct ; 

  @OneToOne(mappedBy = "SE") // 1-1
  private stockListEntity SLE ; 

  
}
