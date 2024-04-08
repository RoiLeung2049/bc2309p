package com.bootcamp.execrise4.bcproductdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bootcamp.execrise4.bcproductdata.entity.stockListEntity;

public interface StocksRepository extends JpaRepository<stockListEntity, Long>  {
  
}
