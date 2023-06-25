package com.example.manytomany.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "students")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String firstName;

    @ManyToMany(fetch= FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "student_lesson"
            ,joinColumns={
            @JoinColumn(name = "student_id", referencedColumnName = "id")
    }, inverseJoinColumns = {
            @JoinColumn(name = "course_id",referencedColumnName = "id")
    })
    private Set<Lessons> assignLessonToStudents=new HashSet<>();


//https://github.com/Dev2ProdCoding/spring-data-jpa-manytomany/tree/master
}
