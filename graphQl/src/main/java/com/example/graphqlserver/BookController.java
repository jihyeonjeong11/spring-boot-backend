package com.example.graphqlserver;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import java.util.List;
import java.util.UUID;


@Controller
public class BookController {
    @QueryMapping
    public Book bookById(@Argument String id) {
        return Book.getById(id);
    }

    @SchemaMapping
    public Author author(Book book) {
        return Author.getById(book.authorId());
    }

    @QueryMapping
    public List<Book> findAllBooks() {
        return Book.books;
    }

    @MutationMapping
    public Book addBook(@Argument String name, @Argument int pageCount, @Argument String authorId) {
        Author author = Author.getById(authorId); 
        if (author == null) {
            throw new RuntimeException("Author not found");
        }
        
        Book newBook = new Book(UUID.randomUUID().toString(), name, pageCount, authorId);
        Book.books.add(newBook); 
        
        return newBook;
    }
}