package com.example.manytomany.repository;

import com.example.manytomany.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepo extends JpaRepository<Students,Long> {
    List<Students> findAllById(Long studentId);
}
