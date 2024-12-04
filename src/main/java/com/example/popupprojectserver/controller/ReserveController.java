package com.example.popupprojectserver.controller;

import com.example.popupprojectserver.model.Reserve;
import com.example.popupprojectserver.repository.ReserveRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reservations")
public class ReserveController {

    private final ReserveRepository reserveRepository;

    public ReserveController(ReserveRepository reserveRepository) {
        this.reserveRepository = reserveRepository;
    }

    @PostMapping
    public ResponseEntity<String> createReservation(@RequestBody Reserve reservation) {
        // 요청 데이터 검증
        if (reservation.getSelectedDate() == null || reservation.getUserId() == null) {
            return ResponseEntity.badRequest().body("Invalid request data");
        }

        // 데이터 저장
        reserveRepository.save(reservation);

        // 성공 응답 반환
        return ResponseEntity.ok("Reservation successfully created");
    }
}

