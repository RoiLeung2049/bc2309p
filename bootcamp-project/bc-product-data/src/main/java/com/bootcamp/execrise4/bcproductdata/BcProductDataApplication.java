package com.bootcamp.execrise4.bcproductdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class BcProductDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(BcProductDataApplication.class, args);
	}

}
