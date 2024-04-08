package com.bootcamp.execrise4.bcproductdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bootcamp.execrise4.bcproductdata.entity.CoinsEntity;

@Repository
public interface CoinRepository extends JpaRepository<CoinsEntity,Long>{
  
}
