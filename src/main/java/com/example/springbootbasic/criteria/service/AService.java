package com.example.springbootbasic.criteria.service;

import com.example.springbootbasic.criteria.dto.Adto;
import com.example.springbootbasic.criteria.entity.A;
import com.example.springbootbasic.criteria.entity.B;
import com.example.springbootbasic.criteria.repository.ARepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.criteria.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AService {
    @Autowired
    private ARepository aRepository;

    @PersistenceContext
    EntityManager em;

    public Object get() throws InterruptedException {
        // C1
        List<A> a = aRepository.queryAJoinB();
        for(A i: a) {
            System.out.println(i.getB().size());
        }

        // C2
//        List<Adto> a = aRepository.queryADtoJoinB();
//        for(Adto i: a) {
//            System.out.println(i.getB().size());
//        }

        // C3
//        List<Object[]> results = aRepository.queryADtoJoinBNativeQuery();
//        List<Adto> a = results.stream().map(result -> new Adto(
//                ((String) result[0]), (String) result[1], ((String) result[2]), (String) result[3])).collect(Collectors.toList());
//        for(Adto i: a) {
//            System.out.println(i.getB().size());
//        }

        return a;
    }
}
