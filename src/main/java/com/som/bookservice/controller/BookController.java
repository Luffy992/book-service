package com.som.bookservice.controller;

import com.som.bookservice.entity.Book;
import com.som.bookservice.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
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

    @GetMapping("/page")
    public Page<Book> getBooks(

            @RequestParam(
                    defaultValue = "0"
            )
            int page,

            @RequestParam(
                    defaultValue = "5"
            )
            int size) {

        return bookService.getBooks(
                page,
                size
        );
    }

    @GetMapping("/test-user")
    public String testUserService() {

        return bookService
                .testUserService();
    }
}