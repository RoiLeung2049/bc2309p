package com.bootcamp.execrise4.bcproductdata.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.bootcamp.execrise4.bcproductdata.entity.dailyStockProductEntity;
import com.bootcamp.execrise4.bcproductdata.entity.stockPriceEntity;

@Repository
public interface DailyStockProductEntityRepository extends JpaRepository<dailyStockProductEntity, Long> {
  
  @Query("SELECT s FROM dailyStockProductEntity s  WHERE s.SE.id = :ID ORDER BY s.trade_date DESC")
  List<dailyStockProductEntity> findAllEntitiesById(@Param("ID") Long ID) ;
}
