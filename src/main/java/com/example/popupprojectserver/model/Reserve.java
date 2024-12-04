package com.example.popupprojectserver.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Reserve {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String selectedDate; // 예약 날짜

    @Column(nullable = false)
    private String userId; // 사용자 ID

    private String description; // 예약 설명

    public Reserve(String selectedDate, String userId, String description) {
        this.selectedDate = selectedDate;
        this.userId = userId;
        this.description = description;
    }
}
