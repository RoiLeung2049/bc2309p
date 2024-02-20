package com.vtxlab.bootcamp.bootcamphelloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface DatabaseController {



  // the contorller name is not important 

  @GetMapping(value = "/db/idx/{idx}") // this is called path variable  . ths name {index }  has to be same as the name of parameter  of controller function 
  // for input the varialbe from path into the contorller function . we need to use @PathVariable ( name = xxx) in case the name of parameter vairalbe is not the same as the 
  // controller fxn variable name  
  // this part has to be memorized . !!!!
  String getName(@PathVariable (name = "idx") int index);
  


  @GetMapping(value = "/db/idx/{idx}/name/{name}")
  void setName(@PathVariable (name = "idx") int index , @PathVariable String name );
}
