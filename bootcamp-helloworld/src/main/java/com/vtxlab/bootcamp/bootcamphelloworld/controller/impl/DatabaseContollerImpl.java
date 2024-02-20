package com.vtxlab.bootcamp.bootcamphelloworld.controller.impl;

import org.springframework.web.bind.annotation.RestController;
import com.vtxlab.bootcamp.bootcamphelloworld.controller.DatabaseController;
import com.vtxlab.bootcamp.bootcamphelloworld.service.DatabaseService;
import com.vtxlab.bootcamp.bootcamphelloworld.service.impl.DatabaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping(value = "/api/v1")


public class DatabaseContollerImpl implements DatabaseController {



  @Autowired  //( server start)
  private DatabaseService databaseService ; // interface

  // @Autowire will check if there is any object CAN be injected into DatabaseService interface . 
  @Override
  public String getName(int index) {
  //  strings[0] = "Peter" ;
     return new DatabaseServiceImpl().getName(index) ; 
    }

  @Override
  public void setName(int index, String name) {
    // TODO Auto-generated method stub
   // throw new UnsupportedOperationException("Unimplemented method 'setName'");
   databaseService.setName(index, name);
  }
  
}
