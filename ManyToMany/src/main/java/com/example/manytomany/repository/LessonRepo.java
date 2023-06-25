package com.example.manytomany.repository;

import com.example.manytomany.entity.Lessons;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LessonRepo extends JpaRepository<Lessons,Long> {
    List<Lessons> findAllById(Long lessonId);
}
