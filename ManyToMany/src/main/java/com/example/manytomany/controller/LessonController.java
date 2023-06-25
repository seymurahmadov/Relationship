package com.example.manytomany.controller;

import com.example.manytomany.entity.Lessons;
import com.example.manytomany.repository.LessonRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lessons")
@RequiredArgsConstructor
public class LessonController {

    private final LessonRepo lessonRepo;

    @GetMapping
    public List<Lessons> getAll(){
       return lessonRepo.findAll();
    }

    @PostMapping
    public Lessons createSubject(@RequestBody Lessons lessons){
        return lessonRepo.save(lessons);

    }
}


