package com.bootcamp.execrise4.bcproductdata.repository;

import java.util.List;
import com.bootcamp.execrise4.bcproductdata.entity.CoinsEntity;
import com.bootcamp.execrise4.bcproductdata.entity.StocksEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository

public interface StockListRepository extends JpaRepository<StocksEntity,Long>{
  

  List<StocksEntity> findAll() ;
  
  @Query("SELECT s FROM StocksEntity s  WHERE s.stock_id = :name ")
  List<StocksEntity> findEntityByStockId(@Param("name") String name);
  
}
