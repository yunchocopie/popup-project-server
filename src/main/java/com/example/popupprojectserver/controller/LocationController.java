package com.example.popupprojectserver.controller;

import com.example.popupprojectserver.dto.LocationRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/location")
public class LocationController {

    @PostMapping("/coordinates")
    public ResponseEntity<String> receiveCoordinates(@RequestBody LocationRequest locationRequest) {
        double userLatitude = locationRequest.getUserLatitude();
        double userLongitude = locationRequest.getUserLongitude();

        // 위치 데이터를 이용해 필요한 작업 수행 (예: 데이터베이스 저장, 로깅 등)
        System.out.println("사용자 위치 - 위도: " + userLatitude + ", 경도: " + userLongitude);

        // 위치 수신 성공 응답
        return new ResponseEntity<>("위치가 성공적으로 수신되었습니다.", HttpStatus.OK);
    }
}
