package com.vtxlab.bootcamp.bootcamphelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import com.vtxlab.bootcamp.controller.Helloworld;
import com.vtxlab.bootcamp.bootcamphelloworld.controller.Helloworld; 
@SpringBootApplication
public class BootcampHelloworldApplication {

	public static void main(String[] args) {// to be called by JVM 
		System.out.println("hello");
		SpringApplication.run(BootcampHelloworldApplication.class, args);// can be stopped by contorl + C
	}

}
