package com.vtxlab.bootcamp.bootcamphelloworld.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.vtxlab.bootcamp.bootcamphelloworld.model.Cat;
import  com.vtxlab.bootcamp.bootcamphelloworld.controller.Helloworld;


@Controller
@ResponseBody
@RequestMapping(value = "/api/v1") // this @ has to be put in implemntation class 
public class HelloworldImpl implements Helloworld{


  // get other get data 
   



  //@GetMapping(value = "/helloworld") // /hellworld is the end point  
 @Override
  public String helloworld() {
    return "hello world.  This is my first app. " ; 
  }

  // second api 
 // @GetMapping(value = "/sleep") // the path   
  
 @Override
 public String sleep() {
    return "I am sleeping. ZZZ " ; 
  }


  // third api 

 // @GetMapping(value = "/stone")
  @Override
  public double stone(){
    return 1 ; 
  } 

 // @GetMapping(value = "/test/int")
@Override
  public int testInt(){
    return 3 ;
  }


//  @GetMapping(value = "/cat")
@Override
  public Cat cat(){
    List<String> descriptions = new ArrayList<>() ; 
    descriptions.add("abc");
    descriptions.add("def");
    descriptions.add("Mary");
    Cat cat = new Cat("May",descriptions);
    return cat  ; 
    
  }
    
  

}
