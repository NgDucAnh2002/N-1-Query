package com.example.springbootbasic.criteria.repository;


import com.example.springbootbasic.criteria.dto.Adto;
import com.example.springbootbasic.criteria.entity.A;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.springbootbasic.criteria.dto.Adto;

import java.util.List;

@Repository
public interface ARepository extends JpaRepository<A, String> {
    // C1: Sử dụng JPQL JOIN Fetch
    // Thay name Entity B vào kia
    @Query(value = "SELECT a FROM A a LEFT JOIN FETCH a.b b WHERE b.name = 'B_3'")
    List<A> queryAJoinB();

    // C2: Sử dụng phép chiếu DTO
    // Ngày trước anh đọc document, thì cách này rất nhanh vì dirty check nhưng code hơi mệt tí
    @Query(value = "SELECT new com.example.springbootbasic.criteria.dto.Adto(a.id, a.name, b.id, b.name) FROM A a " +
                    "INNER JOIN B b " +
                    "ON a.id = b.a.id")
    List<Adto> queryADtoJoinB();

    // C3: Sử dụng phép chiếu DTO với nativeQuery
    @Query(value = "SELECT a.id, a.name, b.id, b.name FROM a INNER JOIN b ON a.id = b.a_id", nativeQuery = true)
    List<Object[]> queryADtoJoinBNativeQuery();
}
