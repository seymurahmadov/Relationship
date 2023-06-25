package com.example.relationship.repository;

import com.example.relationship.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Books,Long> {
}
