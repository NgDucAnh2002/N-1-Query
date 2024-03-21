package com.example.springbootbasic.criteria.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class B {
    public B(String name) {
        this.name = name;
    }

    public B() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;

    @Column()
    String name;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "a_id")
    A a;

}
