package com.sap.cloud.fin.trm.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class HelloWorldResponse
{
    @JsonProperty("hello")
    private final String name;
}
