package com.example.springbootbasic.criteria.dto;

import com.example.springbootbasic.criteria.entity.B;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Adto {
    public Adto(String id, String name, String bID, String bName) {
        this.id = id;
        this.name = name;
        b.add(new Bdto(bID, bName));
    }

    private String id;
    private String name;
    private List<Bdto> b = new ArrayList<>();
}
