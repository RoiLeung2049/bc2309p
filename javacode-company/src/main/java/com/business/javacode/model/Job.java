package com.business.javacode.model;


import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
@Builder
public class Job {

  private LocalDate StartDate ; 
  private LocalDate deadLine; 
  



  public static void main(String[] args) {
    
    Job j1 = new Job( LocalDate.of(2023,4,12), LocalDate.of(2024,4,23));

    System.out.println(j1.getStartDate());

    Job job = Job.builder().StartDate(LocalDate.of(2023,4,12)).deadLine(LocalDate.of(2024,12,30)).build();
  }
}
