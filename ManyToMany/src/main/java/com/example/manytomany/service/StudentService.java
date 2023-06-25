package com.example.manytomany.service;

import com.example.manytomany.entity.Lessons;
import com.example.manytomany.entity.Students;
import com.example.manytomany.repository.LessonRepo;
import com.example.manytomany.repository.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final LessonRepo lessonRepo;
    private final StudentRepo studentRepo;


    public void saveStudent(Students students){
        studentRepo.save(students);
    }

    public List<Students> getStudentDetails(Long studentId){
        if (null != studentId){
            return studentRepo.findAllById(studentId);
        }else{
            return studentRepo.findAll();
        }
    }

    public Students assignLessonToStudentService(Long studentId, Long lessonId){

        Set<Lessons> studentsSet = null;
        Students students = studentRepo.findById(studentId).get();
        Lessons lessons = lessonRepo.findById(lessonId).get();

        studentsSet=students.getAssignLessonToStudents();
        studentsSet.add(lessons);

        students.setAssignLessonToStudents(studentsSet);
        return studentRepo.save(students);

    }
}
