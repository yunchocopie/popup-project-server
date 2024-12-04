package com.example.popupprojectserver.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ManageController {
    @GetMapping("/")
    public String index() {
        return "main";
    }
}
