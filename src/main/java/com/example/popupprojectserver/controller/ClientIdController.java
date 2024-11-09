package com.example.popupprojectserver.controller;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/config")
public class ClientIdController {

    private final Dotenv dotenv = Dotenv.load();

    @GetMapping("/client-id")
    public String getClientId() {
        // .env 파일에 저장된 NAVER_CLIENT_ID 값을 가져옴
        String clientId = dotenv.get("NAVER_CLIENT_ID");
        return clientId != null ? clientId : "Client ID not found";
    }
}
