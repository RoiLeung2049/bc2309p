package com.bootcamp.execrise4.bcproductdata.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.bootcamp.execrise4.bcproductdata.dto.ProfileData;
import com.bootcamp.execrise4.bcproductdata.entity.profileDataEntity;

@Repository
public interface ProfileDataRepository  extends JpaRepository<profileDataEntity,Long>{
    
  @Query("SELECT s FROM profileDataEntity s WHERE s.quote_stock_code = :name "  )
  List<profileDataEntity> findEntityByQuoteStockCode(@Param("name") String name );
}
