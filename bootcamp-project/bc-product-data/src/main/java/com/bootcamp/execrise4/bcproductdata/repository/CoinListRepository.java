package com.bootcamp.execrise4.bcproductdata.repository;

import org.springframework.stereotype.Repository;
import com.bootcamp.execrise4.bcproductdata.entity.CoinsEntity;
import com.bootcamp.execrise4.bcproductdata.entity.coinListEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CoinListRepository extends JpaRepository<coinListEntity,Long>{
  
  

   List<coinListEntity> findAll() ; 
}
