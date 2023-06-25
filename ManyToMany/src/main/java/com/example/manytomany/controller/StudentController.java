package com.example.manytomany.controller;

import com.example.manytomany.entity.Students;
import com.example.manytomany.repository.StudentRepo;
import com.example.manytomany.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentRepo studentRepo;
    private final StudentService studentService;

    @GetMapping
    private List<Students> getAll() {
        return studentRepo.findAll();
    }

    @PostMapping
    private Students createStudent(@RequestBody Students student) {
        return studentRepo.save(student);
    }

    @PutMapping("/{studentId}/lesson/{lessonId}")
    Students studentCourse(@PathVariable Long studentId, @PathVariable Long lessonId) {

        return studentService.assignLessonToStudentService(studentId, lessonId);

    }

}
