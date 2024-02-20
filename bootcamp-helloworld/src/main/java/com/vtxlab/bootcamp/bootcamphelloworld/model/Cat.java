package com.vtxlab.bootcamp.bootcamphelloworld.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Cat {
  private String name ; 


  private List<String> cats ;
}
