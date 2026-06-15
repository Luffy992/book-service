package com.som.bookservice.controller;

import com.som.bookservice.entity.Book;
import com.som.bookservice.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService
            bookService;

    @PostMapping
    public Book createBook(
            @RequestBody Book book) {

        return bookService.createBook(
                book
        );
    }

    @GetMapping
    public List<Book> getAllBooks() {

        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(
            @PathVariable Long id) {

        return bookService.getBookById(
                id
        );
    }

    @PutMapping("/{id}")
    public Book updateBook(
            @PathVariable Long id,
            @RequestBody Book book) {

        return bookService.updateBook(
                id,
                book
        );
    }

    @DeleteMapping("/{id}")
    public String deleteBook(
            @PathVariable Long id) {

        return bookService.deleteBook(
                id
        );
    }
}