package com.example.popupprojectserver.repository;


import com.example.popupprojectserver.model.Reserve;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReserveRepository extends JpaRepository<Reserve, Long> {
}
