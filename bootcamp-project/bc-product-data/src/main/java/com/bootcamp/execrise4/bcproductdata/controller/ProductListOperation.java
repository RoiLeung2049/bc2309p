package com.bootcamp.execrise4.bcproductdata.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.bootcamp.execrise4.bcproductdata.dto.CoinData;
import com.bootcamp.execrise4.bcproductdata.dto.CoinList;
import com.bootcamp.execrise4.bcproductdata.dto.CoinOutput;
import com.bootcamp.execrise4.bcproductdata.dto.DailyStockOutput;
import com.bootcamp.execrise4.bcproductdata.dto.StockList;
import com.bootcamp.execrise4.bcproductdata.dto.StockOutput;
import com.bootcamp.execrise4.bcproductdata.entity.CoinsEntity;
import com.bootcamp.execrise4.bcproductdata.entity.StocksEntity;
import com.bootcamp.execrise4.bcproductdata.entity.coinListEntity;
import com.bootcamp.execrise4.bcproductdata.infra.ApiResponse;

public interface ProductListOperation { // input the product list from ecternal input 
  

  @PostMapping(value = "/coins")
  @ResponseStatus(value = HttpStatus.OK)
  public ApiResponse<coinListEntity> setCoinProductList(@RequestBody CoinList cl);


  @PostMapping(value = "/stocks")
  @ResponseStatus(value = HttpStatus.OK)
  public ApiResponse<StocksEntity> setStockProductList(@RequestBody StockList sl);

  

  //@GetMapping(value = "/product/stocks")
  @GetMapping(value = "/stocks")
  public List<String> getStocksProductList(); // data type need to be define

  @GetMapping(value = "/product/stocks")
  public ApiResponse<List<StockOutput>> getAllStocksProductList() ; 


  //@GetMapping(value = "/product/coins")
  public List<String> getCoinsProductList(); 

  @GetMapping(value = "/product/coins")
  public ApiResponse<List<CoinOutput>> getAllCoinsProductList(); // data type need to be define
  
  @GetMapping(value = "/products")
  public ApiResponse<List<Object>> getAllProduct(); // data type need to be define


  @DeleteMapping(value ="/{coin_id}")
  public boolean delete(@PathVariable("coin_id") String coin_id) ; 

  @GetMapping(value = "/product/stock/daily")
  public ResponseEntity<ApiResponse<List<DailyStockOutput>>> getDailyStockData(@RequestParam(value = "stock_code") String Stock_code) ; // data type need to be define
  
  
  //@GetMapping(value = "/product/stock/daily2")
  //public ApiResponse<List<DailyStockOutput>> getDailyStockDataTest(@RequestParam(value = "stock_code") String Stock_code) ; // data type need to be define
}
