package com.bootcamp.execrise4.bcproductdata.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.bootcamp.execrise4.bcproductdata.entity.coinPriceEntity;

@Repository
public interface CoinPriceRepository extends JpaRepository<coinPriceEntity,Long> {
  
  @Query("SELECT s FROM coinPriceEntity s WHERE s.name = :name ORDER BY s.quote_date DESC")
  List<coinPriceEntity> findEntityByName(@Param("name") String name );
}
