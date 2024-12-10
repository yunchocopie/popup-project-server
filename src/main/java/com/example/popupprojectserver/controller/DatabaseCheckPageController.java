package com.example.popupprojectserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Controller
public class DatabaseCheckPageController {
    private final DataSource dataSource;

    public DatabaseCheckPageController(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @GetMapping("/db-check-page")
    public String checkDatabaseConnection(Model model) {
        String status;
        try (Connection connection = dataSource.getConnection()) {
            status = connection.isValid(2) ? "Connected" : "Failed";
        } catch (SQLException e) {
            status = "Error: " + e.getMessage();
        }
        model.addAttribute("status", status);
        return "db-check";
    }
}
