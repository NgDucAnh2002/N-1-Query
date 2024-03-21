package com.example.springbootbasic.criteria.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class A {
    public A(String name) {
        this.name = name;
    }

    public A() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;

    @Column()
    String name;

    @OneToMany(mappedBy = "a", fetch = FetchType.LAZY)
    List<B> b;

    public void addB(B b) {
        this.b.add(b);
    }
}
