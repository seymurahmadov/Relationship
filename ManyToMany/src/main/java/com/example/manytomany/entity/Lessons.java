package com.example.manytomany.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "lessons")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Lessons {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String lessonName;

    @JsonIgnore
    @ManyToMany(mappedBy = "assignLessonToStudents",fetch = FetchType.LAZY)
    private Set<Students> students= new HashSet<>();
}
