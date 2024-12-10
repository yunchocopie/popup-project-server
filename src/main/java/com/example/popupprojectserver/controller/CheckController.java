package com.example.popupprojectserver.controller;


import com.example.popupprojectserver.service.CheckService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CheckController {
    private final CheckService checkService;

    public CheckController(CheckService checkService) {
        this.checkService = checkService;
    }

    @GetMapping("/check/reservation")
    public String showReservations(Model model) {
        // Service를 통해 모든 Check 데이터를 가져와 모델에 추가
        model.addAttribute("checks", checkService.getAllChecks());
        // Thymeleaf 템플릿 이름 반환
        return "reservation";
    }
}