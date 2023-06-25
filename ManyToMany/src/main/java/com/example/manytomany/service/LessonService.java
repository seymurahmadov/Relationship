package com.example.manytomany.service;

import com.example.manytomany.entity.Lessons;
import com.example.manytomany.entity.Students;
import com.example.manytomany.repository.LessonRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LessonService {
    private final LessonRepo lessonRepo;


    public void saveLessons(Lessons lessons){
        lessonRepo.save(lessons);
    }

    public List<Lessons> getLessonDetails(Long lessonId){
        if (null !=lessonId ){
            return lessonRepo.findAllById(lessonId);
        }else{
            return lessonRepo.findAll();
        }
    }

}
