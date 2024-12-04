package com.example.popupprojectserver.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "reserve") // 데이터베이스 테이블 이름은 그대로 유지
public class Check {
    // Getters and Setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String selectedDate;

    @Column(nullable = false)
    private String userId;

    private String description;

}