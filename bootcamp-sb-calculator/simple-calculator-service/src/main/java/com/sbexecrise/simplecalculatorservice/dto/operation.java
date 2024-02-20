package com.sbexecrise.simplecalculatorservice.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Value;

@AllArgsConstructor
@ToString

public enum operation {
    add("add"),
    sub("sub"),
    mul("mul"),
    div("div");

    private final String operation ; 


}
