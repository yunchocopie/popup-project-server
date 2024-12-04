package com.example.popupprojectserver.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ManageController {
    @GetMapping("/main")
    public String index() {
        return "main";
    }
}
