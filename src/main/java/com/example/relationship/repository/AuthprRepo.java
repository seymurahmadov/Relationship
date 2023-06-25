package com.example.relationship.repository;

import com.example.relationship.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthprRepo extends JpaRepository<Author,Long> {
}
