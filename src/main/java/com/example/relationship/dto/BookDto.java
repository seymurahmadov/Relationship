package com.example.relationship.dto;

import com.example.relationship.entity.Author;
import lombok.Data;

@Data
public class BookDto {
    private Long id;
    private String name;
    private Long authorId;
}
