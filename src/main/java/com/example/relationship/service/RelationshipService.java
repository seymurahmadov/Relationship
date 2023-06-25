package com.example.relationship.service;

import com.example.relationship.dto.AuthorDto;
import com.example.relationship.dto.BookDto;
import com.example.relationship.entity.Author;
import com.example.relationship.entity.Books;
import com.example.relationship.repository.AuthprRepo;
import com.example.relationship.repository.BookRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RelationshipService {

    private final AuthprRepo authprRepo;
    private final BookRepo bookRepo;

    public Books saveBooks(BookDto dto){
        Optional<Author> byId = authprRepo.findById(dto.getAuthorId());

        Books books = Books.builder()
                .name(dto.getName())
                .author(byId.get())
                .build();

         return bookRepo.save(books);

    }

    public Author saveAuthors(AuthorDto dto){
        Author author = Author.builder()
                .name(dto.getName())
                .build();

     return   authprRepo.save(author);
    }

}
