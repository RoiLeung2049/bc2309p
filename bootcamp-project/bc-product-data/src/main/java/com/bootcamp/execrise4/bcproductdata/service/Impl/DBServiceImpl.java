package com.bootcamp.execrise4.bcproductdata.service.Impl;

import org.springframework.stereotype.Service;
import com.bootcamp.execrise4.bcproductdata.dto.Database;
import com.bootcamp.execrise4.bcproductdata.service.DBService;

@Service
public class DBServiceImpl  implements DBService{

  @Override
  public String getName(int index) {
    
    throw new UnsupportedOperationException("Unimplemented method 'getName'");
  }

  @Override
  public void setName(int index, String name) {

    Database.setId(index, name);
  }

  @Override
  public String getNames() {
    
      return Database.getId() ; 

  }
  
}
