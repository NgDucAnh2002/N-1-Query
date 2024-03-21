package com.example.springbootbasic.criteria.controller;

import com.example.springbootbasic.criteria.service.AService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("criteria")
public class Controller {
    @Autowired
    AService aService;
    @GetMapping("")
    public ResponseEntity<?> controller() throws InterruptedException {
        return ResponseEntity.ok().body(aService.get());
    }
    /*
INSERT INTO a(id, name) VALUES ('8661b4f6-7ea2-4ccc-88c7-64b42c5778aa', '5353');
INSERT INTO a(id, name) VALUES ('a5fa4dbe-9c51-42c4-aee4-347bc8639d6d', '64564');
INSERT INTO a(id, name) VALUES ('c6ce4ff5-dbff-4deb-9004-78df6ae8913b', 'A_2');
INSERT INTO a(id, name) VALUES ('cc4d6b97-9506-401f-9093-7a2f751948cd', 'A_1');

INSERT INTO B (id, a_id, name) VALUES
('13263a3d-ac99-4313-baa8-7a8a948e192e', 'cc4d6b97-9506-401f-9093-7a2f751948cd', 'B_2'),
('5e1896d8-fb38-4608-9df7-27a8a0bc50b3', 'a5fa4dbe-9c51-42c4-aee4-347bc8639d6d', 'B_3'),
('8661b4f6-7ea2-4ccc-88c7-64b42c5778aa', 'cc4d6b97-9506-401f-9093-7a2f751948cd', 'B_4'),
('a5fa4dbe-9c51-42c4-aee4-347bc8639d6d', '8661b4f6-7ea2-4ccc-88c7-64b42c5778aa', 'B_1');
     */
}
