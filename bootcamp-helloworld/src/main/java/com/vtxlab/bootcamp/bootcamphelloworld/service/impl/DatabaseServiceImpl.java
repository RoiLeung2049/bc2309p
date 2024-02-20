package com.vtxlab.bootcamp.bootcamphelloworld.service.impl;

import org.springframework.stereotype.Service;
import com.vtxlab.bootcamp.bootcamphelloworld.model.Database;
import com.vtxlab.bootcamp.bootcamphelloworld.service.DatabaseService;


@Service
public class DatabaseServiceImpl  implements DatabaseService{

  @Override 
  public String getName (int index) {
    return Database.getString(index);
  }

  @Override
  public void setName(int index, String name) {
    // TODO Auto-generated method stub
    Database.setString(index, name);
  }
  

  
}
