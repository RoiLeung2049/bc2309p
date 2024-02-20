package com.vtxlab.bootcamp.bootcamphelloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.vtxlab.bootcamp.bootcamphelloworld.model.Cat;




@Controller
@ResponseBody
@RequestMapping(value = "/api/v1")

public interface Helloworld {



  @GetMapping(value = "/helloworld") // /hellworld is the end point  
  public String helloworld();

  @GetMapping(value = "/sleep") // the path   
  public String sleep() ;
  
  @GetMapping(value = "/stone")
  
  public double stone();


  @GetMapping(value = "/test/int")

  public int testInt();


  
  @GetMapping(value = "/cat")

  public Cat cat();
} 