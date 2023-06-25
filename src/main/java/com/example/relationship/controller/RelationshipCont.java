package com.example.relationship.controller;

import com.example.relationship.dto.AuthorDto;
import com.example.relationship.dto.BookDto;
import com.example.relationship.entity.Author;
import com.example.relationship.entity.Books;
import com.example.relationship.service.RelationshipService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RelationshipCont {
    private final RelationshipService relationshipService;

    @PostMapping("/author")
    public Author saveAuthor(@RequestBody AuthorDto dto){
     return   relationshipService.saveAuthors(dto);
    }

    @PostMapping("/books")
    public Books saveBooks(@RequestBody BookDto dto){
     return  relationshipService.saveBooks(dto);
    }
}
