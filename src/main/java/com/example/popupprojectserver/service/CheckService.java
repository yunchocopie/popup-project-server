package com.example.popupprojectserver.service;
import com.example.popupprojectserver.model.Check;
import com.example.popupprojectserver.repository.CheckRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckService {
    private final CheckRepository checkRepository;

    public CheckService(CheckRepository checkRepository) {
        this.checkRepository = checkRepository;
    }

    public List<Check> getAllChecks() {
        return checkRepository.findAll();
    }
}