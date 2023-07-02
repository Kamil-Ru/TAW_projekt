package com.example.taw_projekt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

@JsonSerialize
@Data
public class Subjects {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("ects")
    private Integer ects;

    @JsonProperty("room")
    private Integer room;

    @JsonProperty("exam")
    private Boolean exam;

}
