package com.bootcamp.execrise4.bcproductdata.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.bootcamp.execrise4.bcproductdata.entity.CoinsEntity;
import com.bootcamp.execrise4.bcproductdata.entity.stockPriceEntity;


@Repository
public interface StockPriceRepository extends JpaRepository<stockPriceEntity,Long>{
  

  @Query("SELECT s FROM stockPriceEntity s  WHERE s.quote_stock_code = :name ORDER BY s.quote_date DESC")
  List<stockPriceEntity> findAllEntitiesSortedByDateesc(@Param("name") String name) ;
}
