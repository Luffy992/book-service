package com.som.bookservice.service;

import com.som.bookservice.entity.Book;
import com.som.bookservice.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository
            bookRepository;

    public Book createBook(
            Book book) {

        return bookRepository.save(
                book
        );
    }

    public List<Book> getAllBooks() {

        return bookRepository.findAll();
    }

    public Book getBookById(
            Long id) {

        return bookRepository
                .findById(id)
                .orElseThrow(
                        () -> new RuntimeException(
                                "Book not found"
                        )
                );
    }
}