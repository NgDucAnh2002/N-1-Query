package com.example.springbootbasic.criteria.repository;


import com.example.springbootbasic.criteria.entity.B;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BRepository extends JpaRepository<B, String> {

}
