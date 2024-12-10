package com.example.popupprojectserver.repository;

import com.example.popupprojectserver.model.Check;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckRepository extends JpaRepository<Check, Long> {
}
