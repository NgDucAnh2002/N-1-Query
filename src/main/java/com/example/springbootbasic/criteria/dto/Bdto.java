package com.example.springbootbasic.criteria.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
public class Bdto {
    public Bdto(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Bdto() {}

    private String id;
    private String name;
}
